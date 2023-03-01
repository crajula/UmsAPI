package com.investec.ums.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserDetailsResponseDTO {
   private int statusCode;
   private int message;
}