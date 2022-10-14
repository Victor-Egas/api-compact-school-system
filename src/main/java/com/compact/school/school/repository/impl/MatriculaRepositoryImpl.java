package com.compact.school.school.repository.impl;

import com.compact.school.school.repository.MatriculaRepository;
import com.compact.school.school.model.entity.Alumno;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {
    @Override
    public List<Alumno> findAllStudent() {
        List<Alumno> listStudent = new ArrayList<>();

        return listStudent;
    }
}
