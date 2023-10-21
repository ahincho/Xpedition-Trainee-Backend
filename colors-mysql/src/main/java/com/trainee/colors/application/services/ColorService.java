package com.trainee.colors.application.services;

import com.trainee.colors.domain.entities.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ColorService {

    Page<Color> findAll(Pageable pageable);
    Color findById(Long id);
    Color saveColor(Color color);
    Color updateColor(Long id, Color color);
    Color deleteColor(Long id);

}
