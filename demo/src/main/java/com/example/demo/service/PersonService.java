package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {
    @Autowired
    private IPersonRepository iPersonRepository;

    @Override
    public Page<Person> display(Pageable pageable, String name) {
        return iPersonRepository.findPersonByNameContaining(pageable, name);
    }

    @Override
    public Person findById(Long id) {
        return iPersonRepository.findById(id).orElse(null);
    }

    @Override
    public void edit(Person person) {
        iPersonRepository.save(person);
    }

    @Override
    public List<Person> list() {
        return iPersonRepository.findAll();
    }

    @Override
    public Page<Person> listRole(Pageable pageable, Long id) {
        return iPersonRepository.showListPersonByRoleId(pageable, id);
    }
}
