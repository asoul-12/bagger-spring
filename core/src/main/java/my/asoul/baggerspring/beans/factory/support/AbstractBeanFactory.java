package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.BeanFactory;
import my.asoul.baggerspring.beans.factory.config.BeanDefinition;

/**
 * @author 4512
 * @date 2022/10/30 2:31
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object sharedInstance = getSingleton(beanName);
        if (sharedInstance != null) {
            System.out.println("getSingleton from cacheContext");
            return sharedInstance;
        }
        System.out.println("getSingleton from create");
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    /**
     * @param beanName
     * @return
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName);

    /**
     * @param beanName
     * @param beanDefinition
     * @return
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}
