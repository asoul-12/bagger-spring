package my.asoul.baggerspring.util;

import java.lang.reflect.Field;

/**
 * @author 4512
 * @date 2022/10/31 21:55
 */
public class BeanUtil {

    public static void setFieldValue(Object bean, String fieldName, Object value) {
        Field field = ReflectUtil.getField(bean.getClass(), fieldName);
        ReflectUtil.setFieldValue(field, bean, value);
    }


}
