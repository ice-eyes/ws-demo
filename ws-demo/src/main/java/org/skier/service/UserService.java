package org.skier.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Xie.Zhe
 */
@WebService(targetNamespace = "http://service.skier.org/")
public interface UserService {

    @WebMethod
    public User getUserById(@WebParam(name = "id") Integer id);

    @WebMethod
    public List<User> listUser();

    @WebMethod
    public User addUser(@WebParam(name = "user")User user);

}
