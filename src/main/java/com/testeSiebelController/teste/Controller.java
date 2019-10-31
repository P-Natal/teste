package com.testeSiebelController.teste;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value = "{request}", method = RequestMethod.POST)
    public ResponseEntity teste(@PathVariable String request){

        log.info("\n\n\nREQUEST RECEBIDO : " + request);

        return new ResponseEntity(HttpStatus.OK);

    }
}
