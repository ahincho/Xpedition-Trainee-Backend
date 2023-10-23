package com.trainee.colors.domain.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColorListResponse {

    private List<ColorResponse> colors;
    private int pages;
    private String nextPage;
    private String previousPage;

}
