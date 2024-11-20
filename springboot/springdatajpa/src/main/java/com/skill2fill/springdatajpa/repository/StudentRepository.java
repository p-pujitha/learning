package com.skill2fill.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skill2fill.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
