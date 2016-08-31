package org.skier.service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Xie.Zhe
 */
@WebService(endpointInterface = "org.skier.service.UserService", targetNamespace = "http://service.skier.org/")
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User("张三", "123", 12, "zs", 1));
        users.add(new User("李四", "123", 42, "ls", 2));
        users.add(new User("lily", "123", 32, "lily", 3));
        users.add(new User("小明", "123", 22, "xm", 4));
        users.add(new User("小王", "123", 18, "xw", 5));
    }

    @Override
    public User getUserById(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id)
                return users.get(i);
        }
        return null;
    }

    @Override
    public List<User> listUser() {
        return users;
    }

    @Override
    public User addUser(User user) {
        users.add(user);
        return user;
    }
}
