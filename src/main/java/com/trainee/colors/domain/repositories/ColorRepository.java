package com.trainee.colors.domain.repositories;

import com.trainee.colors.domain.entities.Color;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

}
