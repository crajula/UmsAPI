package com.investec.ums.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class UserDetailsResponseDTO {
   private int statusCode;
   private int message;
}