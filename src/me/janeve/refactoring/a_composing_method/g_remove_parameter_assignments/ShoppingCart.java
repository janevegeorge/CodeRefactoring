package me.janeve.refactoring.a_composing_method.g_remove_parameter_assignments;

public class ShoppingCart {

    int discount(int inputVal, int quantity) {
        if (inputVal > 50) {
            inputVal -= 2;
        }
        return inputVal;
    }

}