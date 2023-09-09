package domain;

import androidx.annotation.NonNull;

public class Dish {
    private String title, description;
    private int price;

    public Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
