package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.BeansException;
import my.asoul.baggerspring.beans.PropertyValue;
import my.asoul.baggerspring.beans.PropertyValues;
import my.asoul.baggerspring.beans.factory.config.BeanDefinition;
import my.asoul.baggerspring.beans.factory.config.BeanReference;
import my.asoul.baggerspring.util.BeanUtil;

import java.lang.reflect.Constructor;

/**
 * @author 4512
 * @date 2022/10/30 2:35
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        // 根据策略进行实例化
        bean = createBeanInstance(beanDefinition, beanName, args);
        // 依赖注入
        applyPropertyValues(beanName, bean, beanDefinition);
        // 加入缓存
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructor2Use = null;
        Class beanClass = beanDefinition.getBeanClass();
        Constructor[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (args != null && constructor.getParameterTypes().length == args.length) {
                constructor2Use = constructor;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, constructor2Use, args);
    }


    /**
     * @param bean           实例化但未注入依赖的对象
     * @param beanDefinition bean定义
     */
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            if (propertyValues == null) return;
            PropertyValue[] values = propertyValues.getPropertyValues();
            for (PropertyValue property : values) {
                String name = property.getName();
                Object value = property.getValue();

                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 反射设置属性
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values for bean: " + beanName, e);
        }
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
