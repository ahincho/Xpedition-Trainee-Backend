package com.trainee.colors.application.services;

import com.trainee.colors.domain.dtos.ColorListResponse;
import com.trainee.colors.domain.dtos.ColorResponse;
import com.trainee.colors.domain.entities.Color;
import com.trainee.colors.domain.repositories.ColorRepository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ColorServiceMySql implements ColorService {

    private final ColorRepository colorRepository;

    @Override
    public ColorListResponse findAll(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("createdOn", "lastUpdatedOn").descending());
        Page<Color> colorPage = this.colorRepository.findAll(pageable);
        List<ColorResponse> colorResponses = colorPage.stream().map(ColorResponse::new).toList();
        ColorListResponse colorListResponse = new ColorListResponse();
        colorListResponse.setColors(colorResponses);
        colorListResponse.setPages(colorPage.getTotalPages());
        String endpointPathPage = "/api/colors?page=";
        if (colorPage.hasNext()) {
            colorListResponse.setNextPage(endpointPathPage + (pageable.getPageNumber() + 1));
        }
        if (colorPage.hasPrevious()) {
            colorListResponse.setPreviousPage(endpointPathPage + (pageable.getPageNumber() - 1));
        }
        return colorListResponse;
    }

    @Override
    public Color findById(Long id) {
        return this.colorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Color saveColor(Color color) {
        return this.colorRepository.save(color);
    }

    @Override
    @Transactional
    public Color updateColor(Long id, Color color) {
        Optional<Color> existingColor = this.colorRepository.findById(id);
        if (existingColor.isEmpty()) {
            return null;
        }
        Color getColor = existingColor.get();
        getColor.setName(color.getName());
        getColor.setColor(color.getColor());
        getColor.setPantone(color.getPantone());
        return this.colorRepository.save(getColor);
    }

    @Override
    @Transactional
    public Color deleteColor(Long id) {
        Optional<Color> existingColor = this.colorRepository.findById(id);
        if (existingColor.isEmpty()) {
            return null;
        }
        this.colorRepository.deleteById(id);
        return existingColor.get();
    }

}
