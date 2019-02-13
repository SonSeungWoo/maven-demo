package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Leo.
 * User: sonseungwoo
 * Date: 2019-02-13
 * Time: 23:30
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
