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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import com.trainee.colors.application.services.ColorService;
import com.trainee.colors.domain.entities.Color;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorControllerRest implements ColorController {

    ColorService colorService;

    @Override
    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorListResponse> findAll(@PageableDefault(size = 9) Pageable pageable) {
        ColorListResponse colorListResponse = this.colorService.findAll(pageable);
        return ResponseEntity.ok(colorListResponse);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ColorResponse> findById(@PathVariable("id") Long id) {
        // Found Color 200 Ok
        Color color = this.colorService.findById(id);
        return ResponseEntity.ok(new ColorResponse(color));
    }

    @Override
    @PostMapping
    public ResponseEntity<ColorResponse> save(@RequestBody @Valid ColorRequest color, UriComponentsBuilder uriComponentsBuilder) {
        // Return 201 Created
        Color created = this.colorService.saveColor(mapColorRequestToColor(color));
        URI uri = uriComponentsBuilder.path("/api/colors/{id}").buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(uri).body(new ColorResponse(created));
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
