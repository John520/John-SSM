package com.john.ssm.bean;

import java.util.Set;

public class Category {
    private int id;
    private String name;
    private String details;
    private Set<Product> products;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", products=" + products +
                '}';
    }
}
