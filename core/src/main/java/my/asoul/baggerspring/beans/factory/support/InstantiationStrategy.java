package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author 4512
 * @date 2022/10/30 16:41
 */
public interface InstantiationStrategy {
    /**
     * @param beanDefinition
     * @return
     */
    Object instantiate(BeanDefinition beanDefinition, Constructor constructor,Object... args);
}
