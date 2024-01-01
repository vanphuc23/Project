package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPersonService {
    Page<Person> display(Pageable pageable, String name);

    Person findById(Long id);

    void edit(Person person);

    List<Person> list();

    Page<Person> listRole(Pageable pageable, Long id);
}
