package com.trainee.colors.infrastructure.controllers;

import lombok.AllArgsConstructor;
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
    public List<Color> findAll() {
        return this.colorService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Color findById(@PathVariable("id") Long id) {
        return this.colorService.findById(id);
    }

    @Override
    @PostMapping
    public Color save(@RequestBody Color color) {
        return this.colorService.saveColor(color);
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

}
