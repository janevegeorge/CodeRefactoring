package me.janeve.refactoring.a_composing_method.h_method_object;

public class Order {

    //...
    public double price() {

        // Some stuff here..

        double primaryBasePrice;
        double secondaryBasePrice;
        double tertiaryBasePrice;
        double computedPrice = 1d;
        // long computation.
        //...
        //...
        //...
        //...
        //... Finally evaluated the computedPrice
        //... Using the primaryBasePrice, secondaryBasePrice and tertiaryBasePrice

        // Some other stuff here..

        return computedPrice;
    }

}