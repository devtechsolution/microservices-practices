package org.as.devtechsolution.controller;

import java.net.URI;
import java.util.List;

import org.as.devtechsolution.entity.User;
import org.as.devtechsolution.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger("UserManagementApp");

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        logger.info("getting users..");
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id){
        return userService.findUserByName(new Long(id));
    }

    @PostMapping("/user")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        userService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        return ResponseEntity.created(path).build();

    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUserById(new Long(id));
        return "User with Id " + id + " deleted";
    }

    @GetMapping("/getAllUserByFirstName/{firstName}")
    public List<User>getAllUsersByFirstName(@PathVariable String firstName){
        return userService.getAllUserByFirstName(firstName);
    }

    @GetMapping("/getAllUserByGender/{gender}")
    public List<User>getAllUsersByGender(@PathVariable String gender){
        return userService.getUsersByGender(gender);
    }

    @PutMapping("/updateAddress/{id}/{newAddress}")
    public String updateAddress(@PathVariable String id, @PathVariable String newAddress){
        userService.updateAddress(Long.parseLong(id), newAddress);
        return "address updated!!";
    }

    @GetMapping("/getAllSortedUser/{sortedParam}")
    public List<User>getAllSortedusers(@PathVariable String sortedParam){
        return userService.findSortedUsers(sortedParam);
    }

    @GetMapping("/getAllUserByGender/{gender}/{sortedParam}")
    public List<User>getAllUsersByGenderAndSort(@PathVariable String gender, @PathVariable String sortedParam){
        return userService.getUsersByGenderAndSort(gender, sortedParam);
    }

    @GetMapping("/getAllUserByPages/{pageNumber}/{numberOfElementsPerPage}")
    public Page<User> getAllUserByPages(@PathVariable String pageNumber, @PathVariable String numberOfElementsPerPage){
        return userService.getAllUsersByPages(Integer.parseInt(pageNumber), Integer.parseInt(numberOfElementsPerPage));
    }
}