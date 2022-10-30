package my.asoul.baggerspring.beans.factory;

/**
 * @author 4512
 * @date 2022/10/29 21:42
 */
public interface BeanFactory {

    /**
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * @param name
     * @param args
     * @return
     */
    Object getBean(String name, Object... args);

}
