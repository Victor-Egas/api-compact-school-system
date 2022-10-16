package com.compact.school.school.controller;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.model.entity.Alumno;
import com.compact.school.school.service.SeccionService;
import com.compact.school.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class MatriculaController {

    @Autowired
    private StudentService service;

    @Autowired
    private SeccionService seccionService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Alumno>> findAllStudent(){
        List<Alumno> studentList = service.findAllStudent();

        return new ResponseEntity<>(studentList , HttpStatus.OK);
    }

}
