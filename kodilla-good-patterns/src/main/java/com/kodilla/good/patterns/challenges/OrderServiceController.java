package com.kodilla.good.patterns.challenges;

import java.util.Scanner;

public class OrderServiceController {
    private Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository;
    private UserService userService;

    void showProducts() {
        for (Product product : productRepository.getProducts()) {
            System.out.println(product);
        }
    }

    void enterNameOfWantedProduct() {
        System.out.println("Wprowadź szukany produkt");
        String product = scanner.nextLine();
        userService.findProduct(product);

        System.out.println(product);
    }


    public static void main(String[] args) {
        OrderServiceController orderServiceController = new OrderServiceController();

        orderServiceController.showProducts();

        orderServiceController.enterNameOfWantedProduct();


    }
}
