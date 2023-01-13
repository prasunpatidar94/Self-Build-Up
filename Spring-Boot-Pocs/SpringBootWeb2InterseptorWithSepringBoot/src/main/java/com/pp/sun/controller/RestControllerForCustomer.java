package com.pp.sun.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class RestControllerForCustomer {

    @RequestMapping(value = "/get/customer", method = RequestMethod.GET)
    public ResponseEntity<String> getCustomer() {
        return new ResponseEntity<>("customer : Prasun", HttpStatus.OK);
    }


    @RequestMapping(value = "/get/customer/exception", method = RequestMethod.GET)
    public void getCustomerException() throws Exception {
        throw new Exception("invalid url");
    }


}
