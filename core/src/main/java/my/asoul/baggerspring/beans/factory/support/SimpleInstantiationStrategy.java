package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 4512
 * @date 2022/10/30 22:41
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, Constructor constructor, Object... args) {
        Class aClass = beanDefinition.getBeanClass();
        try {
            if (null != constructor) {
                return aClass.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return aClass.getDeclaredConstructor().newInstance();
            }

        } catch (InstantiationException | NoSuchMethodException |
                 InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
