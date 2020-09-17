package com.kodilla.good.patterns.challenges.food;

import java.util.Scanner;

public class EnterProductName {
    private Scanner scanner = new Scanner(System.in);

    void enterNameOfWantedProduct() {
        System.out.println("Wprowadź nazwe wybranego produku");
        scanner.nextLine();
    }
}
