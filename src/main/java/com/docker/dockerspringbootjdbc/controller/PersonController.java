package com.docker.dockerspringbootjdbc.controller;

import com.docker.dockerspringbootjdbc.po.Person;
import com.docker.dockerspringbootjdbc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class PersonController {
    //test对付对付对付
    @Autowired
    private PersonService personService;
    @GetMapping("/jdbc")
    public String  getPerson(){
        List<Person> list = personService.getList();
        list.forEach(x->System.out.print(x.getName()));
        return "success"+list.get(0).getName();
    }
}
