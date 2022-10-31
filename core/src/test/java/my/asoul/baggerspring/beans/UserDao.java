package my.asoul.baggerspring.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 4512
 * @date 2022/10/31 23:22
 */
public class UserDao {
    private static final Map<String, UserInfo> cache = new HashMap<>();

    static {
        cache.put("1", new UserInfo("1", "1"));
        cache.put("2", new UserInfo("2", "2"));
        cache.put("3", new UserInfo("3", "3"));
    }

    public UserInfo getUserInfo(String id) {
        return cache.get(id);
    }

}
