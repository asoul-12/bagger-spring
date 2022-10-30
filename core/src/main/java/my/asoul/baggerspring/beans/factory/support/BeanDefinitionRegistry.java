package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;

/**
 * @author 4512
 * @date 2022/10/30 2:36
 */
public interface BeanDefinitionRegistry {

    /**
     * Register a new bean definition with this registry.
     *
     * @param beanName bean在spring容器中唯一的名字
     * @param beanDefinition 定义bean的配置元信息
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
