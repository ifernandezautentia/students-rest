package com.autentia.rest.alumnos.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.autentia.rest.alumnos.domain.Student;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface PostgresRestRepository extends CrudRepository<Student, String>{
}
