package com.grabfood.cachedemo.service;

import com.grabfood.cachedemo.dto.Food;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    // Giả lập database
    private List<Food> mockDatabase = Arrays.asList(
            new Food(1L, "Phở Bò", 101L),
            new Food(2L, "Bún Chả", 101L),
            new Food(3L, "Cơm Tấm", 102L),
            new Food(4L, "Gỏi Cuốn", 102L)
    );

    @Cacheable(value = "foods", key = "#restaurantId")
    public List<Food> getFoodsByRestaurantId(Long restaurantId) {
        System.out.println("Fetching from mock database for restaurantId: " + restaurantId);
        // Giả lập delay khi query database
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return mockDatabase.stream()
                .filter(food -> food.getRestaurantId().equals(restaurantId))
                .collect(Collectors.toList());
    }
}
