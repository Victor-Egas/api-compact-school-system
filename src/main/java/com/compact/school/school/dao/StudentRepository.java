package com.compact.school.school.dao;

import com.compact.school.school.model.entity.Student;

import java.util.List;

public interface StudentRepository {

    public List<Student> findAllStudent();
}
