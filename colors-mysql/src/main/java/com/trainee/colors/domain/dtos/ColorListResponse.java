package com.trainee.colors.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColorListResponse {

    private List<ColorResponse> colors;
    private int pages;
    private String nextPage;
    private String previousPage;

}
