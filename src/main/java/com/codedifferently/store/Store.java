package com.codedifferently.store;

public class Store {
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;

    }
    public void advertise() {
        String message = "We are selling " + productType + "at " + price + " per bottle";
        System.out.println(message);
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");


    }
    public double getPriceWithTax(){
        double totalPrice = price + price * 0.08;
        return totalPrice;

    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade ", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        Store kicksAndTricks = new Store ("Jordan 1's ", 200);

        System.out.println(cookieShop);
        System.out.println(kicksAndTricks);
        System.out.println(lemonadeStand);

    }


}
