package me.janeve.refactoring.a_composing_method.d_inline_temp;

public class ShoppingCart {

    boolean hasDiscount(Order order) {
        double basePrice = order.basePrice();
        return basePrice > 1000;
    }

}