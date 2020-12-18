package com.leverx.actuator.springbootactuator.pojo;

public enum ProductType {
    MEAT("MEAT"),
    VEGETABLES("VEGETABLES");

    private String info;

    private ProductType(String info) {
        this.info = info;
    }
}
