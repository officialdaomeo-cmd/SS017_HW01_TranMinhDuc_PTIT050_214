package com.grabfood.cachedemo.dto;

import java.io.Serializable;

public class Food implements Serializable {
    private Long id;
    private String name;
    private Long restaurantId;

    public Food() {}

    public Food(Long id, String name, Long restaurantId) {
        this.id = id;
        this.name = name;
        this.restaurantId = restaurantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
