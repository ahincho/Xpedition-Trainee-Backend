package com.trainee.colors.domain.dtos;

import com.trainee.colors.domain.entities.Color;

import java.time.LocalDateTime;

public record ColorResponse(Long id, String name, String color, String pantone, LocalDateTime createdOn, LocalDateTime lastUpdatedOn) {

    public ColorResponse(Color color) {
        this(color.getId(), color.getName(), color.getColor(), color.getPantone(), color.getCreatedOn(), color.getLastUpdatedOn());
    }

}
