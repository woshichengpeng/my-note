package com.cp.mynote.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cp
 * @create 2019-12-29 16:19
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "hello world";
    }

}
