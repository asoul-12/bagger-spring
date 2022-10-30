package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;

/**
 * @author 4512
 * @date 2022/10/30 2:35
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object instance = null;
        try {
            instance = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        addSingleton(beanName, instance);
        return instance;
    }
}
