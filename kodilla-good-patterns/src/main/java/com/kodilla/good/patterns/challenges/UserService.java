package com.kodilla.good.patterns.challenges;

import java.util.List;

// TODO - poczytaj o wstrzykiwaniu zależności
public class UserService {
    private ProductRepository productRepository;
    private Order order;

    public UserService(final ProductRepository productRepository, final Order order) {
        this.productRepository = productRepository;
        this.order = order;
    }

    public void findProduct(String productName) {

        List<Product> allProducts = productRepository.getProducts();
        Product chosenProduct = null;

        for (Product product : allProducts) {
            if (product.getName().equalsIgnoreCase(productName)) {
                chosenProduct = product;
                //todo: dodanie produktu do zamówienia
            }
        }


// ProductDoesntExistException
        //todo: dodaj wyjątek gdy produkt nie istnieje
    }


}
