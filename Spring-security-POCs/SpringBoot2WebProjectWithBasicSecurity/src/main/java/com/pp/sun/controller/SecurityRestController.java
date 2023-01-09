package com.pp.sun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRestController {
    @GetMapping("/home")
    public   String home(){
        return "I M Home free for all";
    }@GetMapping("/get/index")
    public   String index(){
        return "I M index only for login user";
    }@GetMapping("/modification/data/emp")
    public   String modification(){
        return "I M modification for admin";
    }@GetMapping("/apprave/emp")
    public   String apprave(){
        return "I M apprave for manager";
    }@GetMapping("/emp/data/get")
    public   String Emp(){
        return "I M EMP for emp manager, admin";
    }@GetMapping("/emp/getemp")
    public   String getemp(){
        return "I M EMP";
    }

}
