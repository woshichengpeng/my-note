package com.cp.mynote.controllers;

import org.springframework.data.mongodb.core.index.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author cp
 * @create 2020-01-02 17:14
 */
@Controller
public class AdminController {
    @GetMapping("/")
    public String index(HttpSession session) {
        Object userId = session.getAttribute("UserId");
        if (userId != "") {
            return
        }

        return "/home/index";
    }

    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "cp");
        return "thymeleafTest";
    }
}
