package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;
import com.trainee.colors.domain.entities.Color;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public interface ColorController {

    ResponseEntity<ColorListResponse> findAll(Pageable pageable);
    ResponseEntity<ColorResponse> findById(Long id);
    ResponseEntity<ColorResponse> save(ColorRequest color, UriComponentsBuilder uriComponentsBuilder);
    Color update(Long id, Color color);
    Color delete(Long id);

}
