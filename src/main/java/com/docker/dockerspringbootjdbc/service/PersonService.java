package com.docker.dockerspringbootjdbc.service;

import com.docker.dockerspringbootjdbc.po.Person;

import java.util.List;

public interface PersonService {
    List<Person> getList();
}
