package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocterController {
	
	@GetMapping("/doctors")
    public String doctors(){
       /* try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "List of doctors";
    }

}
