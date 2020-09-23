package com.kodilla.good.patterns.challenges.food;

import java.util.Scanner;

public class EnterProductName {
    private Scanner scanner = new Scanner(System.in);

    String enterNameOfWantedProduct() {
        System.out.println("Wprowadź nazwe wybranego produku");
       String selectedProduct = scanner.nextLine();
        System.out.println("Wybrałeś produkt :" + selectedProduct);
        return selectedProduct;
    }
}
