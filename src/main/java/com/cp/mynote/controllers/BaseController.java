package com.cp.mynote.controllers;

import com.cp.mynote.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * @author cp
 * @create 2020-01-02 20:37
 */
public class BaseController {
    @Autowired
    HttpSession session;

}
