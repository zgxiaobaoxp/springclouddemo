package com.example.provider.controller;

import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {
    private Logger log = LoggerFactory.getLogger(SLF4JLogger.class);
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> instanceList = client.getInstances("hello-service");
        for(int i = 0;i < ((List) instanceList).size();i ++){
            log.info("/hello,host:" + instanceList.get(i).getHost() + ",service_id:" + instanceList.get(i).getServiceId());
        }
        return "helloworld";
    }
}
