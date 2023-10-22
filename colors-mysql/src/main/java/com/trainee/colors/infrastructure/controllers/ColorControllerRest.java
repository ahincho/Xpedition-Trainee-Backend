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
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("/api/colors")
public class ColorControllerRest implements ColorController {

    private final ColorService colorService;

    @Override
    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorListResponse> findAll(@PageableDefault(size = 9) Pageable pageable) {
        ColorListResponse colorListResponse = this.colorService.findAll(pageable);
        // HTTP Status 204 : No Content (There are no colors here)
        if (colorListResponse.getColors().isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        // HTTP Status 200 : Ok
        return ResponseEntity.ok(colorListResponse);
    }

    @Override
    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> findById(@PathVariable("id") Long id) {
        Color color = this.colorService.findById(id);
        // HTTP Status 200 : Ok
        return ResponseEntity.ok(new ColorResponse(color));
    }

    @Override
    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> save(@RequestBody @Valid ColorRequest color, UriComponentsBuilder uriComponentsBuilder) {
        // HTTP Status 201 : Created
        Color created = this.colorService.saveColor(mapColorRequestToColor(color));
        URI uri = uriComponentsBuilder.path("/api/colors/{id}").buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(uri).body(new ColorResponse(created));
    }

    @Override
    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> update(@PathVariable("id") Long id, @RequestBody @Valid ColorRequest color) {
        // HTTP Status 200 : OK - This is the most appropriate code for most use-cases.
        // HTTP Status 204 : No Content - A proper code for updates that don’t return data
        // to the client, for example when just saving a currently edited document.
        Color updated = this.colorService.updateColor(id, mapColorRequestToColor(color));
        return ResponseEntity.ok(new ColorResponse(updated));
    }

    @Override
    @DeleteMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<ColorResponse> delete(@PathVariable("id") Long id) {
        // HTTP Status 200 : OK - Some people think a delete function of any kind should return the deleted
        // element, so a representation of the deleted element can be included in the response body.
        // HTTP Status 204 : Not Found - The most fitting status code for this case. It’s better to reduce
        // traffic and simply tell the client the deletion is complete and return no response body
        // (as the resource has been deleted).
        Color deleted = this.colorService.deleteColor(id);
        return ResponseEntity.ok(new ColorResponse(deleted));
    }

    private static Color mapColorRequestToColor(ColorRequest colorRequest) {
        return Color.builder()
                .name(colorRequest.name())
                .color(colorRequest.color())
                .pantone(colorRequest.pantone())
                .build();
    }

}
