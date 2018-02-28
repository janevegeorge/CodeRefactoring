package me.janeve.refactoring.a_composing_method.e_replace_temp_with_query;

public class Calculator {

    double quantity = 10;
    double itemPrice = 5.49;

    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }

}