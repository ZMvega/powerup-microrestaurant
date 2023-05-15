package com.pragma.powerup.restaurantmicroservice.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantRequestDto {
    private String name;
    private Long NIT;
    private String address;
    private String phone;
    private String urlLogo;
    private Long idUser;
}
