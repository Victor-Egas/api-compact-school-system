package com.compact.school.school.service;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.model.entity.Seccion;

import java.util.List;

public interface SeccionService {

    List<SeccionDto> findAllSeccion();
}
