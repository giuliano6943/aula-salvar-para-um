package com.devsuperior.aula_salvar_para_um.services;

import com.devsuperior.aula_salvar_para_um.dto.PersonDTO;
import com.devsuperior.aula_salvar_para_um.dto.PersonDepartmentDTO;
import com.devsuperior.aula_salvar_para_um.entities.Department;
import com.devsuperior.aula_salvar_para_um.entities.Person;
import com.devsuperior.aula_salvar_para_um.repositories.DepartmentRepository;
import com.devsuperior.aula_salvar_para_um.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        //Department dept = new Department();
        //dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartmentID());

        //Department dept = new Department();
        //dept.setId(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDTO(entity);
    }
}
