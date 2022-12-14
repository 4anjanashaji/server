package com.medium.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ServerController {

    @GetMapping(value = "/greet")
    ResponseEntity<String> greet(String name){
        return ResponseEntity.ok("Hello"+ name);
    }
}
