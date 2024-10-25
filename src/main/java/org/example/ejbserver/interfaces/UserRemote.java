package org.example.ejbserver.interfaces;


import javax.ejb.Remote;
import javax.xml.registry.infomodel.User;
import java.util.List;

@Remote
public interface UserRemote {

    boolean userExists(String username);

    User getUserInfo(String username);

    void addUser(User user);

    List<User> getAllUsers();
}

