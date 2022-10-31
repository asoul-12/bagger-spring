package my.asoul.baggerspring.beans;

/**
 * @author 4512
 * @date 2022/10/31 23:16
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
