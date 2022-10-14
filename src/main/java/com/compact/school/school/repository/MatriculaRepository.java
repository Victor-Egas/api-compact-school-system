package com.compact.school.school.repository;

import com.compact.school.school.model.entity.Alumno;

import java.util.List;

public interface MatriculaRepository {

    public List<Alumno> findAllStudent();
}
