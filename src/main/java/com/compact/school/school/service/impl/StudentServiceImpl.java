package com.compact.school.school.service.impl;

import com.compact.school.school.repository.MatriculaRepository;
import com.compact.school.school.model.entity.Alumno;
import com.compact.school.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private MatriculaRepository studentRepository;

    @Override
    public List<Alumno> findAllStudent() {
        return studentRepository.findAllStudent();
    }
}
