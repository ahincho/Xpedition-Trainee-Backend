package com.trainee.colors.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ColorRequest (
        @NotBlank String name,
        @NotBlank
        @Pattern(regexp = "#\\d{6}")
        String color,
        @NotBlank
        @Pattern(regexp = "\\d{2}-\\d{4}")
        String pantone
) {

}
