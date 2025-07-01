package com.lc540.boot.action;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAction {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name", required = false) String name){
        if(name == null || "".equals(name)){
            return "please enter your name";
        }
        return "hello, " + name;
    }

}
