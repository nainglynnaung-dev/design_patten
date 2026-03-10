package com.nk.ly;

public class Main {
    public static void main(String[] args) {
        StockMarket nyse = new StockMarket();

        // Users subscribing
        MobileAppObserver user1 = new MobileAppObserver("Sousuke's iPhone");
        MobileAppObserver user2 = new MobileAppObserver("Trading Bot");

        nyse.registerObserver(user1);
        nyse.registerObserver(user2);

        // Price changes!
        nyse.setPrice("GOOGLE", 175.50);
        
        // One user unsubscribes
        nyse.removeObserver(user2);
        
        // Another price change
        nyse.setPrice("APPLE", 190.20);
    }
}