package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
