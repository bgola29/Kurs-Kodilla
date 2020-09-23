package com.kodilla.good.patterns.challenges.food;

public class OrderService {
    FoodProducers foodProducers;

    public OrderService(FoodProducers foodProducers) {
        this.foodProducers = foodProducers;
    }

    public void orderProcess() {

        System.out.println("zaczynamy proces");
        foodProducers.inform();
        foodProducers.products()
                .entrySet()
                .stream()
                .forEach(s -> System.out.println(s));
        EnterProductName enterProductName = new EnterProductName();
        String enterProduct = enterProductName.enterNameOfWantedProduct();
        foodProducers.process(enterProduct);
        if (foodProducers.contractExecuted()) {
            System.out.println("Zamówienie zostało zrealizowane");
        } else {
            System.out.println("Zamówienie nie zostało zrealizowane");
        }
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new ExtraFoodShop());
        orderService.orderProcess();
    }
}
