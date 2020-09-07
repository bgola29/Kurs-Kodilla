package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Product> orderList = new ArrayList<>();

    public Order(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void add(Product product){
        orderList.add(product);
    }

    public List<Product> getOrderList() {
        return orderList;
    }
}
