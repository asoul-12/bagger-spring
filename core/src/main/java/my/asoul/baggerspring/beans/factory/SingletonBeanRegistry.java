package my.asoul.baggerspring.beans.factory;

/**
 * @author 4512
 * @date 2022/10/30 2:34
 */
public interface SingletonBeanRegistry {
    /**
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
