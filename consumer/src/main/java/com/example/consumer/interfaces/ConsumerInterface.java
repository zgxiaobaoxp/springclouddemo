package com.example.consumer.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "HELLO-SERVICE",fallback = ConsumerInterfaceHystrix.class)
@Component
public interface ConsumerInterface {
    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String test();
}
