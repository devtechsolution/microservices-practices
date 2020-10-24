package org.as.devtechsolution.usermanagementapp.services;

import org.as.devtechsolution.usermanagementapp.dto.User;

import java.util.Set;

public interface UserService {
    Set<User> getAllUsers();

    User getUser(String id);

    void addUser(User user);

    User updateUser(User user);

    User deleteUser(String id);

}