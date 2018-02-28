package me.janeve.refactoring.c_organizing_data.a_change_value_to_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    private static final Random randomizer = new Random();


    public static void main(String[] args) {
        List<String> customers = Arrays.asList("Janeve", "Ravikiran", "Manojna");
        final List<Order> orders = new ArrayList<>();

        IntStream.rangeClosed(0, 50).forEach(
            i -> {
                String randomCustomer = customers.get(randomizer.nextInt(customers.size()));
                orders.add(new Order(randomCustomer));
            }
        );

        customers.forEach(
            name -> {
                System.out.println(name + "'s orders: " + Order.getNumberOfItems(orders, name));
            }
        );
    }

}