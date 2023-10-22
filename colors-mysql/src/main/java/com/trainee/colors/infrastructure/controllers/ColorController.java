package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

public interface ColorController {

    ResponseEntity<ColorListResponse> findAll(Pageable pageable);
    ResponseEntity<ColorResponse> findById(Long id);
    ResponseEntity<ColorResponse> save(ColorRequest color, UriComponentsBuilder uriComponentsBuilder);
    ResponseEntity<ColorResponse> update(Long id, ColorRequest color);
    ResponseEntity<ColorResponse> delete(Long id);

}
