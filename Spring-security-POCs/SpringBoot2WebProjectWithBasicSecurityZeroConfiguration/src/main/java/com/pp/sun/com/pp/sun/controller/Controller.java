package com.pp.sun.com.pp.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value="/show")
    public String show() {
        return "This is my wevb";
    }
}
