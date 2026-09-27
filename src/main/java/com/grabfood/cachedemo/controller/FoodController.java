package com.grabfood.cachedemo.controller;

import com.grabfood.cachedemo.dto.Food;
import com.grabfood.cachedemo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/restaurant/{restaurantId}")
    public List<Food> getFoods(@PathVariable Long restaurantId) {
        return foodService.getFoodsByRestaurantId(restaurantId);
    }
}
