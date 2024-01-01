package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;

    @Override
    public List<Role> listRole() {
        return iRoleRepository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return iRoleRepository.findRoleByNameRole(name);
    }
}
