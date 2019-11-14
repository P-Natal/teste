package com.mocking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generic")
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity genericPost(@PathVariable String id, @RequestBody GenericRequest requestBody){
        log.info("Received request with ID: {} and body {}", id, requestBody);
        return new ResponseEntity(HttpStatus.OK);

    }
}
