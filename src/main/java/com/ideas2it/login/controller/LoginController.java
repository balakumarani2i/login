package com.ideas2it.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/l")
public class LoginController {

    @RequestMapping(value = "/test")
    public String saveApprovalMeta() {
        return new String("Hello");
    }
}
