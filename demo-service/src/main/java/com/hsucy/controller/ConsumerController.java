package com.hsucy.controller;

import com.hsucy.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbon-consume", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.helloService();
    }
}
