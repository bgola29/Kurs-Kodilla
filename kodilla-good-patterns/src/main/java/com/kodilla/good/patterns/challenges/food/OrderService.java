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
        enterProductName.enterNameOfWantedProduct();
        foodProducers.process();


        //jakś logika wyboru produktu  wywołanie metody process
        //


    }
    public static void main (String [] args){
        OrderService orderService = new OrderService();
    }
}
