package soft.transport.management.service;

import java.util.List;

import soft.transport.management.model.User;

public interface UsersService {

    void addUser(User user);
    void updateUser(User user);
    User getUser(Long id); 
    List<User> getAllUsers();
    void deleteUsers(User user);
    User findByUserName(String username);
    
}
