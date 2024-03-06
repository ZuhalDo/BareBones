package com.example.BareBones.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BareBones.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}