package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> extraToppings= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("would you like a small, medium or large pizza");
        String pizzaSize = input.next();
        double priceSmall = 7.99;
        double priceMedium = 10.99;
        double priceLarge = 13.99;
        System.out.println("choose two toppings");
        String toppingsTwo = input.next();
        System.out.println("would you like additional toppings for £1.25 each");
        String decision = input.next();
        while (decision.equalsIgnoreCase("yes")) {
            System.out.println("please add your additional topping");
            String topping = input.next();
            extraToppings.add(topping);
            System.out.println("");
        }
	// write your code here
    }
}
