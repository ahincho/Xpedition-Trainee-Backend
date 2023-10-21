package com.trainee.colors.application.services;

import com.trainee.colors.domain.entities.Color;

import java.util.List;

public interface ColorService {

    List<Color> findAll();
    Color findById(Long id);
    Color saveColor(Color color);
    Color updateColor(Long id, Color color);
    Color deleteColor(Long id);

}
