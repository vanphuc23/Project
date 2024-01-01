package com.example.demo.service;

import com.example.demo.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> listRole();

    Role findByName(String name);
}
