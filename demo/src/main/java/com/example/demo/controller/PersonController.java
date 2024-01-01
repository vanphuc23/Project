package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.Role;
import com.example.demo.service.IPersonService;
import com.example.demo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private IPersonService iPersonService;
    @Autowired
    private IRoleService iRoleService;

    @GetMapping("")
    public String showList(@PageableDefault(page = 0, size = 10, sort = "name", direction = Sort.Direction.ASC) Pageable pageable, Model model,
                           @RequestParam(defaultValue = "", required = false) String searchName) {
        List<Role> roleList = iRoleService.listRole();
        Page<Person> page = iPersonService.display(pageable, searchName);
        model.addAttribute("searchName", searchName);
        model.addAttribute("page", page);
        model.addAttribute("roleList", roleList);
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Long id, Model model) {
        Person person = iPersonService.findById(id);
        model.addAttribute("person", person);
        model.addAttribute("roles", iRoleService.listRole());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Person person, RedirectAttributes redirectAttributes) {
        iPersonService.edit(person);
        redirectAttributes.addFlashAttribute("mess", "Edit success");
        return "redirect:/persons";
    }

    @GetMapping("{role}")
    public String showRole(@PageableDefault(page = 0, size = 10, sort = "name", direction = Sort.Direction.ASC) Pageable pageable,
                           @PathVariable String role, Model model) {
        List<Role> roleList = iRoleService.listRole();
        Role role1 = iRoleService.findByName(role);
        Page<Person> personList = iPersonService.listRole(pageable, role1.getIdRole());
        model.addAttribute("page", personList);
        model.addAttribute("roleList", roleList);
        return "list";
    }
}
