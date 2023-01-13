package com.pp.sun.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class RestControllerForOrder {

    @RequestMapping(value = "/get/order", method = RequestMethod.GET)
    public ResponseEntity<String> getCustomer() {
        return new ResponseEntity<>("orader No  : 10002585HUHVH11P", HttpStatus.OK);
    }

    @RequestMapping(value = "/get/order/exception", method = RequestMethod.GET)
    public void getOrderException() throws Exception {
        throw new Exception("invalid url");
    }

}
