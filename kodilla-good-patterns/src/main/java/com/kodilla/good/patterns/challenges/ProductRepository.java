package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("Buraki", 2.70));
        products.add(new Product("Klapki", 14.70));
        products.add(new Product("Laptop", 2700.70));
        products.add(new Product("Rower", 800.70));
        products.add(new Product("AC:Unity", 80.70));
        products.add(new Product("The Settlers 2", 10.70));
    }

    public List<Product> getProducts() {
        return products;
    }
}
