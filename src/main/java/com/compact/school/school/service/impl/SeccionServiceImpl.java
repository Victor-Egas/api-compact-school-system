package com.compact.school.school.service.impl;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.model.entity.Seccion;
import com.compact.school.school.repository.SeccionRepository;
import com.compact.school.school.service.SeccionService;
import com.compact.school.school.util.mapper.SeccionMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeccionServiceImpl implements SeccionService {

    private SeccionMapper mapper = Mappers.getMapper(SeccionMapper.class);
    @Autowired
    SeccionRepository repository;
    @Override
    public List<SeccionDto> findAllSeccion() {
        List<SeccionDto> dtoList = new ArrayList<>();

        for(Seccion seccion : repository.findAll()){
            SeccionDto seccionDto = mapper.seccionToSeccionDto(seccion);
            dtoList.add(seccionDto);
        }
        return dtoList;
    }
}
