package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeseasesController {
	
	@GetMapping("/diseases")
    public String doctors(){
        return "List of diseases";
    }

}
