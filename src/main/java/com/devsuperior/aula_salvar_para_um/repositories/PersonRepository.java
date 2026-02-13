package com.devsuperior.aula_salvar_para_um.repositories;

import com.devsuperior.aula_salvar_para_um.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
