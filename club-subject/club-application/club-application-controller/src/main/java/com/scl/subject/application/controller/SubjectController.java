package com.scl.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题controller
 */
@RestController
public class SubjectController {
    @GetMapping("/test")
    public String test(){
        return "Hello World11";
    }
}
