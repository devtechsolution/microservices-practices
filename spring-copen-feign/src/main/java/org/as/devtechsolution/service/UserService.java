package org.as.devtechsolution.service;

import java.util.List;

import org.as.devtechsolution.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



/**
 * @author Aditya
 *
 */
@FeignClient(name = "${service.name}", url = "${service.base.url}")
public interface UserService {

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") String id);

    @GetMapping(value = "/users")
    List<User> getUserList();


    @PostMapping("/user")
    String addUser(User user);

    @DeleteMapping("/user/{id}")
     String deleteUser(@PathVariable("id") String id);

    @PutMapping("/updateAddress/{id}/{newAddress}")
     String updateAddress(@PathVariable("id") String id, @PathVariable("newAddress") String newAddress);




    }