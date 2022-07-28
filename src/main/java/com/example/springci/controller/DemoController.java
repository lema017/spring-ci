package com.example.springci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api/v1" )
public class DemoController {

    /**
     * Ping string.
     *
     * @return the string
     */
    @RequestMapping("/ping")
    public String ping() {
        return "pong vicente";
    }

}
