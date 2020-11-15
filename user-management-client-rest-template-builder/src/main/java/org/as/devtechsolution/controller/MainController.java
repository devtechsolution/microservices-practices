package org.as.devtechsolution.controller;
import java.util.List;

import org.as.devtechsolution.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userList")
    List<User> getUserList(){
//        return restTemplate.getForObject("http://localhost:8083/springData/users",
//                List.class);
    	return restTemplate.getForObject("/users",
            List.class);
    }
}