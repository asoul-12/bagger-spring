package my.asoul.baggerspring.beans.factory.support;

import my.asoul.baggerspring.beans.factory.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * bean实例化容器
 * @author 4512
 * @date 2022/10/30 2:35
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 一级缓存
     */
    private Map<String, Object> stringObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return stringObjects.get(beanName);
    }

    /**
     * protected : 继承此类的其他类调用
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        stringObjects.put(beanName, singletonObject);
    }
}
