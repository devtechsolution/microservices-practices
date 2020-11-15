package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
	
    @GetMapping("/patients")
    public String doctors(){
        return "List of patients";
    }

}
