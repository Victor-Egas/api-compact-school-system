package com.compact.school.school.util.mapper;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.model.entity.Seccion;
import org.mapstruct.Mapper;

@Mapper
public interface SeccionMapper {

    SeccionDto seccionToSeccionDto(Seccion seccion);
}
