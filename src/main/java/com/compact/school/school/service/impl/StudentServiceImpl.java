package com.compact.school.school.service.impl;

import com.compact.school.school.dao.StudentRepository;
import com.compact.school.school.model.entity.Student;
import com.compact.school.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAllStudent();
    }
}
