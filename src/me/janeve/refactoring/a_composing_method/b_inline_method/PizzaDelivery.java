package me.janeve.refactoring.a_composing_method.b_inline_method;

public class PizzaDelivery {

    private int numberOfLateDeliveries;

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

}