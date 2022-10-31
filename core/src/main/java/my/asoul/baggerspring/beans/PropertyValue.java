package my.asoul.baggerspring.beans;

/**
 * @author 4512
 * @date 2022/10/31 21:36
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
