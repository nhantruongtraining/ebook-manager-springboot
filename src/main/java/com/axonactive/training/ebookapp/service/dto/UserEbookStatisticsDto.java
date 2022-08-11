package com.axonactive.training.ebookapp.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEbookStatisticsDto {
    private String ebookTitle;
    private String username;
    private LocalDate addFavoriteDate;
}
