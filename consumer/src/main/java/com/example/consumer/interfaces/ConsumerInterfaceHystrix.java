package com.example.consumer.interfaces;

import org.springframework.stereotype.Component;

@Component
public class ConsumerInterfaceHystrix implements ConsumerInterface{

    @Override
    public String test() {
        return "error,test2";
    }
}
