package my.asoul.baggerspring.beans;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;
import my.asoul.baggerspring.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author 4512
 * @date 2022/10/30 17:27
 */
public class Test {

    public static void main(String[] args) {
        //
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserInfo.class);
        factory.registerBeanDefinition("userInfo", beanDefinition);

        UserInfo userInfo = (UserInfo)factory.getBean("userInfo");
        UserInfo s = (UserInfo)factory.getBean("userInfo");
        System.out.println(userInfo.toString());

        // 注册

        // 获取

    }
}
