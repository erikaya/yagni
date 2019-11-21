package com.thoughtworks.domain;

public class Service {

    private Category category;

    public Service(Category category) {
        this.category = category;
    }

    public boolean isFromCategory(Category category) {
        return this.category.equals(category);
    }
}
