package org.as.devtechsolution.controller;

import java.util.List;

import org.as.devtechsolution.dto.User;
import org.as.devtechsolution.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Aditya
 *
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;



    @GetMapping("user/{id}")
    public User user(@PathVariable("id") String id){
        logger.info("calling userList() to get list of users");
        return userService.getUser(id);
    }

    @GetMapping("userList")
    public List<User> userList(){
        logger.info("calling userList() to get list of users");
        return userService.getUserList();
    }


    @PostMapping("user")
    public String addUser(@RequestBody User user){
        logger.info("adding user");
        return userService.addUser(user);
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable String id){
        logger.info("deleting user - {}", id);
        return userService.deleteUser(id);
    }

    @PutMapping("/updateAddress/{id}/{newAddress}")
    String updateAddress(@PathVariable String id, @PathVariable String newAddress){
        logger.info("updating user - {}", id);
        return userService.updateAddress(id, newAddress);
    }


}