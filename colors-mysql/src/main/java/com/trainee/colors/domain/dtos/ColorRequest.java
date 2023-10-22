package com.trainee.colors.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ColorRequest (
        @NotBlank String name,
        @NotBlank
        @Pattern(regexp = "^#[A-F0-9]{6}$")
        String color,
        @NotBlank
        @Pattern(regexp = "^[0-9]{2}-[0-9]{4}$")
        String pantone
) {

}
