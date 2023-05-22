package com.flexTechChallenge.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FavCancionDTO {
    private String spotifyId;
    private String userEmail;
}
