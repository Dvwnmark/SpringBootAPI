package com.example.springbootapi.repository;

import com.example.springbootapi.entity.Student;
import org.springframework.data.repository.CrudRepository;



public interface RepositoryStudent extends CrudRepository<Student, Long> {
}
