package com.trainee.colors.application.services;

import com.trainee.colors.domain.entities.Color;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.trainee.colors.domain.repositories.ColorRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ColorServiceMySql implements ColorService {

    ColorRepository colorRepository;

    @Override
    public List<Color> findAll() {
        return this.colorRepository.findAll();
    }

    @Override
    public Color findById(Long id) {
        return this.colorRepository.findById(id).orElse(null);
    }

    @Override
    public Color saveColor(Color color) {
        return this.colorRepository.save(color);
    }

    @Override
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
    public Color deleteColor(Long id) {
        Optional<Color> existingColor = this.colorRepository.findById(id);
        if (existingColor.isEmpty()) {
            return null;
        }
        this.colorRepository.deleteById(id);
        return existingColor.get();
    }

}
