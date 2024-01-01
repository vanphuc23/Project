package com.example.demo.repository;


import com.example.demo.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonRepository extends JpaRepository<Person, Long> {
    Page<Person> findPersonByNameContaining(Pageable pageable, String name);

    @Query(value = "select * from person p join role r on p.role_type = r.id_role where r.id_role = :roleId", nativeQuery = true)
    Page<Person> showListPersonByRoleId(Pageable pageable, @Param("roleId") Long roleId);
}
