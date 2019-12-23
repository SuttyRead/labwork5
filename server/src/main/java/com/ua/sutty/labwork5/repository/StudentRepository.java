package com.ua.sutty.labwork5.repository;

import com.ua.sutty.labwork5.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
