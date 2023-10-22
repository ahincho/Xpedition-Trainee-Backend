package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;
import com.trainee.colors.domain.entities.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ColorController {

    ColorListResponse findAll(Pageable pageable);
    Color findById(Long id);
    Color save(ColorRequest color);
    Color update(Long id, Color color);
    Color delete(Long id);

}
