package my.asoul.baggerspring.beans.factory.config;

/**
 * @author 4512
 * @date 2022/10/30 2:18
 */
public class BeanDefinition {
    private Class beanClass;
    private String className;
    private String[] alias;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String[] getAlias() {
        return alias;
    }

    public void setAlias(String[] alias) {
        this.alias = alias;
    }
}
