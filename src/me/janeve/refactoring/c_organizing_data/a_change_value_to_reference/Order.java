package me.janeve.refactoring.c_organizing_data.a_change_value_to_reference;

import java.util.List;
import java.util.OptionalInt;

public class Order {

    private Customer customer;
    private int number;

    public String getCustomerName(){
        return customer.getName();
    }

    public String setCustomerName(){
        return customer.getName();
    }

    public Order(String name) {
        this.customer = new Customer(name);
    }

    public static Integer getNumberOfItems(List<Order> orders, String customer) {
        OptionalInt count = orders.stream().mapToInt((o) ->{if(o.getCustomerName().equalsIgnoreCase(customer)) return 1; else return 0;} ).reduce((x,y)->x+y);
        if(count.isPresent()) {
            return count.getAsInt();
        } else {
            return 0;
        }
    }
}