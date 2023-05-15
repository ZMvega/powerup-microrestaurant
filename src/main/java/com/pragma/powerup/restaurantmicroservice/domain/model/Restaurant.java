package com.pragma.powerup.restaurantmicroservice.domain.model;

public class Restaurant {
    private String name;
    private Long NIT;
    private String address;
    private String phone;
    private String urlLogo;
    private Long idUser;

    public Restaurant(String name, Long NIT, String address, String phone, String urlLogo, Long idUser) {
        this.name = name;
        this.NIT = NIT;
        this.address = address;
        this.phone = phone;
        this.urlLogo = urlLogo;
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNIT() {
        return NIT;
    }

    public void setNIT(Long NIT) {
        this.NIT = NIT;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
