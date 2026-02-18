package com.devsuperior.aula_salvar_para_um.dto;

import com.devsuperior.aula_salvar_para_um.entities.Person;

public class PersonDTO {
    private Long id;
    private String name;
    private Double salary;
    private Long departmentID;

    public PersonDTO() {
    }

    public PersonDTO(Long id, String name, Double salary, Long departmentID) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentID = departmentID;
    }

    public PersonDTO(Person entity) {
        id =  entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentID = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getDepartmentID() {
        return departmentID;
    }
}

