package me.janeve.refactoring.a_composing_method.f_split_temporary_variable;

public class Rectangle {

    private double height = 2;
    private double width = 4;

    void printProperties(){
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }

}