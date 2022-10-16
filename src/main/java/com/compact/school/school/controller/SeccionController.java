package com.compact.school.school.controller;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.service.SeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seccion")
public class SeccionController {

    @Autowired
    SeccionService seccionService;

    @GetMapping("/findAll")
    public ResponseEntity<List<SeccionDto>> findAllSeccion(){
        List<SeccionDto> seccionList = seccionService.findAllSeccion();

        return new ResponseEntity<>(seccionList , HttpStatus.OK);
    }
}
