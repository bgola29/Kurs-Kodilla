package com.kodilla.good.patterns.challenges.food;

public class OrderService {
    FoodProducers foodProducers;

    public OrderService(FoodProducers foodProducers) {
        this.foodProducers = foodProducers;
    }

    public void orderProcess() {

        System.out.println("we start the process");
        foodProducers.inform();
        foodProducers.products()
                .entrySet()
                .stream()
                .forEach(s -> System.out.println(s));
        EnterProductName enterProductName = new EnterProductName();
        String enterProduct = enterProductName.enterNameOfWantedProduct();
        foodProducers.process(enterProduct);
        if (foodProducers.contractExecuted()) {
            System.out.println("The order has been completed");
        } else {
            System.out.println("The order has not been processed");
        }
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new ExtraFoodShop());
        orderService.orderProcess();
    }
}
