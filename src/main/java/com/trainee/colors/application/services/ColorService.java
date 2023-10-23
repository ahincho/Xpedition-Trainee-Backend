package com.trainee.colors.application.services;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.entities.Color;

import org.springframework.data.domain.Pageable;

public interface ColorService {

    ColorListResponse findAll(Pageable pageable);
    Color findById(Long id);
    Color saveColor(Color color);
    Color updateColor(Long id, Color color);
    Color deleteColor(Long id);

}
