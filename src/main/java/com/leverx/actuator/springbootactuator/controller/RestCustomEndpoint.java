package com.leverx.actuator.springbootactuator.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "rest-end-point")
public class RestCustomEndpoint {

    @GetMapping("/custom")
    public @ResponseBody
    ResponseEntity customEndPoint() {
        return new ResponseEntity<>("REST end point", HttpStatus.OK);
    }
}
