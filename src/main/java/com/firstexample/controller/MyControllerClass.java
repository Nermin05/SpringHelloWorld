package com.firstexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllerClass {
@RequestMapping("/helloWorld")
@ResponseBody
    public String helloWorld() {
        return "Hello World";
    }
}
