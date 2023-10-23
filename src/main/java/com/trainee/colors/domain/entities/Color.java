package com.trainee.colors.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name = "colors")
@Entity(name = "color")
@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private String pantone;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime lastUpdatedOn;

}
