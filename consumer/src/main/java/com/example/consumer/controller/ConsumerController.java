package com.example.consumer.controller;

import com.example.consumer.interfaces.ConsumerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerInterface consumerInterface;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String test(){
        return consumerInterface.test();
    }
}
