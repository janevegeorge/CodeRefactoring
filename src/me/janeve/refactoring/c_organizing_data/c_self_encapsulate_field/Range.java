package me.janeve.refactoring.c_organizing_data.c_self_encapsulate_field;

public class Range {

    private int low, high;
    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

}