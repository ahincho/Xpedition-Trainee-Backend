package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.trainee.colors.application.services.ColorService;
import com.trainee.colors.domain.entities.Color;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorControllerRest implements ColorController {

    ColorService colorService;

    @Override
    @GetMapping
    public ColorListResponse findAll(@PageableDefault(size = 10) Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("createdOn", "lastUpdatedOn").ascending());
        Page<Color> colorPage = colorService.findAll(pageable);
        List<ColorResponse> colorResponses = colorPage.stream().map(ColorResponse::new).toList();
        ColorListResponse response = new ColorListResponse();
        response.setColors(colorResponses);
        response.setPages(colorPage.getTotalPages());
        if (colorPage.hasNext()) {
            response.setNextPage("/api/colors?page=" + (pageable.getPageNumber() + 1));
        }
        if (colorPage.hasPrevious()) {
            response.setPreviousPage("/api/colors?page=" + (pageable.getPageNumber() - 1));
        }
        return response;
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
