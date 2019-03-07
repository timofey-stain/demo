package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestParam(value = "validationToken") String token){
        logger.trace("new__");
        logger.trace("Validation Token: " + token);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setContentType(new MediaType("text", "plain"));
        return new ResponseEntity<>(token, responseHeaders, HttpStatus.OK);
    }

}
