package my.asoul.baggerspring.beans.factory.config;

/**
 * @author 4512
 * @date 2022/10/31 21:34
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
