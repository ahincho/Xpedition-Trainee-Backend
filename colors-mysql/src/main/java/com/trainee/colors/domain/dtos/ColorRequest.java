package com.trainee.colors.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ColorRequest (
        @NotBlank(message = "Name must not be blank")
        String name,
        @NotBlank(message = "Color must not be blank")
        @Pattern(regexp = "^#[A-F0-9]{6}$", message = "Color should be a valid hexadecimal format like #A1B2C3.")
        String color,
        @NotBlank(message = "Pantone must not be blank")
        @Pattern(regexp = "^[0-9]{2}-[0-9]{4}$", message = "Pantone should follow the number format 'dd-dddd' like 12-3456.")
        String pantone
) {

}
