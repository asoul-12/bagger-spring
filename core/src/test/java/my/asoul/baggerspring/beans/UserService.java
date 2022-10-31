package my.asoul.baggerspring.beans;

/**
 * @author 4512
 * @date 2022/10/31 23:22
 */
public class UserService {

    private UserDao userDao;

    public UserInfo getUserInfo(String id) {
        System.out.println(id);
        return userDao.getUserInfo(id);
    }

}
