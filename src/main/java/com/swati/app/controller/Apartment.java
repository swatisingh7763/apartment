package com.swati.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apartment {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String test() {
        return "Hello World";
    }
}
