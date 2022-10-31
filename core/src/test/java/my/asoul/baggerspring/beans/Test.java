package my.asoul.baggerspring.beans;

import my.asoul.baggerspring.beans.factory.config.BeanDefinition;
import my.asoul.baggerspring.beans.factory.config.BeanReference;
import my.asoul.baggerspring.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author 4512
 * @date 2022/10/30 17:27
 */
public class Test {

    public static void main(String[] args) {
        // mock定义
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition userInfoDefinition = new BeanDefinition(UserInfo.class);
        BeanDefinition userDaoDefinition = new BeanDefinition(UserDao.class);
        BeanDefinition userServiceDefinition = new BeanDefinition(UserService.class);
        PropertyValues values = new PropertyValues();
        values.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        userServiceDefinition.setPropertyValues(values);
        // 加入beanDefinitionMap
        factory.registerBeanDefinition("userInfo", userInfoDefinition);
        factory.registerBeanDefinition("userService", userServiceDefinition);
        factory.registerBeanDefinition("userDao", userDaoDefinition);
        // 实例化
        UserService userService = (UserService) factory.getBean("userService");
        userService.getUserInfo("1");

        // 获取

    }
}
