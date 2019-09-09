package com.geometry.springboot.controlller;

import com.geometry.springboot.domin.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/person")
    public Person person(){
//        System.out.println(person);
        return person;
    }

}
