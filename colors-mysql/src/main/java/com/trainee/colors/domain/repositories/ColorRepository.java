package com.trainee.colors.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.colors.domain.entities.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

}
