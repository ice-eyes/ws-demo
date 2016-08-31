package org.skier.service;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.junit.Test;

/**
 * @author Xie.Zhe
 */
public class UserServiceTest {

    @Test
    public void test01(){
        ClientProxyFactoryBean client = new ClientProxyFactoryBean();

        client.setServiceClass(UserService.class);
        client.setAddress("http://localhost:8080/ws-demo/ws/userService?wsdl");
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        UserService userService = (UserService)client.create();

        User user = userService.getUserById(1);

        System.out.println(user);

    }

}
