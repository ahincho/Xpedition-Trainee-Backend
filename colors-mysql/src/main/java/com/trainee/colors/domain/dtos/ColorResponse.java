package com.trainee.colors.domain.dtos;

import com.trainee.colors.domain.entities.Color;

public record ColorResponse(Long id, String name, String color, String pantone) {

    public ColorResponse(Color color) {
        this(color.getId(), color.getName(), color.getColor(), color.getPantone());
    }

}
