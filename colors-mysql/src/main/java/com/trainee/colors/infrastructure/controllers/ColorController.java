package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.entities.Color;

import java.util.List;

public interface ColorController {

    List<Color> findAll();
    Color findById(Long id);
    Color save(Color color);
    Color update(Long id, Color color);
    Color delete(Long id);

}
