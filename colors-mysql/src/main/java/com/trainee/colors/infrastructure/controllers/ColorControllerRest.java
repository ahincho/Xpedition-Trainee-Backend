package com.trainee.colors.infrastructure.controllers;

import com.trainee.colors.application.services.ColorService;
import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorRequest;
import com.trainee.colors.domain.dtos.ColorResponse;
import com.trainee.colors.domain.entities.Color;

import jakarta.validation.Valid;

import java.net.URI;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorControllerRest implements ColorController {

    private final ColorService colorService;

    @Override
    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorListResponse> findAll(@PageableDefault(size = 9) Pageable pageable) {
        ColorListResponse colorListResponse = this.colorService.findAll(pageable);
        return ResponseEntity.ok(colorListResponse);
    }

    @Override
    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> findById(@PathVariable("id") Long id) {
        // Found Color 200 Ok
        Color color = this.colorService.findById(id);
        return ResponseEntity.ok(new ColorResponse(color));
    }

    @Override
    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> save(@RequestBody @Valid ColorRequest color, UriComponentsBuilder uriComponentsBuilder) {
        // Return 201 Created
        Color created = this.colorService.saveColor(mapColorRequestToColor(color));
        URI uri = uriComponentsBuilder.path("/api/colors/{id}").buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(uri).body(new ColorResponse(created));
    }

    @Override
    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Color update(@PathVariable("id") Long id, @RequestBody Color color) {
        return this.colorService.updateColor(id, color);
    }

    @Override
    @DeleteMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
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
