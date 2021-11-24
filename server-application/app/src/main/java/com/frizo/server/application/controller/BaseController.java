package com.frizo.server.application.controller;

import com.frizo.common.utils.greeting.HelloUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BaseController {

    @GetMapping
    public String home(){
        return "This is home page.";
    }

    @GetMapping("say/hello")
    public String sayHello(@RequestParam("name") String name){
        return HelloUtil.sayHello(name);
    }

}
