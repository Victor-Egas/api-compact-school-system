package com.compact.school.school.util.mapper;

import com.compact.school.school.model.api.MatriculaDto;
import com.compact.school.school.model.entity.Matricula;
import org.mapstruct.Mapper;

@Mapper
public interface MatriculaMapper {

    MatriculaDto matriculaToMatriculaDto(Matricula matricula);
}
