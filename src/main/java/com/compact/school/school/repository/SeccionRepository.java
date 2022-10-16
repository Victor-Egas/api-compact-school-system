package com.compact.school.school.repository;

import com.compact.school.school.model.api.SeccionDto;
import com.compact.school.school.model.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionRepository extends JpaRepository<Seccion, Integer> {
}
