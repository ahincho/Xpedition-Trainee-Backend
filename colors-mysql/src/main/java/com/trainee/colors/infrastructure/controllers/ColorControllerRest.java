package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.trainee.colors.application.services.ColorService;
import com.trainee.colors.domain.entities.Color;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorControllerRest implements ColorController {

    ColorService colorService;

    @Override
    @GetMapping
    public Page<ColorResponse> findAll(Pageable pageable) {
        return this.colorService.findAll(pageable).map(ColorResponse::new);
    }

    @Override
    @GetMapping("/{id}")
    public Color findById(@PathVariable("id") Long id) {
        return this.colorService.findById(id);
    }

    @Override
    @PostMapping
    public Color save(@RequestBody @Valid ColorRequest color) {
        return this.colorService.saveColor(mapColorRequestToColor(color));
    }

    @Override
    @PutMapping("/{id}")
    public Color update(@PathVariable("id") Long id, @RequestBody Color color) {
        return this.colorService.updateColor(id, color);
    }

    @Override
    @DeleteMapping("/{id}")
    public Color delete(@PathVariable("id") Long id) {
        return this.colorService.deleteColor(id);
    }

    private static Color mapColorRequestToColor(ColorRequest colorRequest) {
        return Color.builder()
                .name(colorRequest.name())
                .color(colorRequest.color())
                .pantone(colorRequest.pantone())
                .build();
    }

}
