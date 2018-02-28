package me.janeve.refactoring.b_moving_features.b_move_field;

public class Class1 {

    private int aProperty;

    public int getaProperty() {
        return aProperty;
    }

    public void setaProperty(int aProperty) {
        this.aProperty = aProperty;
    }

    int commonFunction() {
       return aProperty + 1;
    }

    void method1A(int aProperty) {
        System.out.println("A doing something with: " + aProperty);
    }

    void method1B(int aProperty) {
        System.out.println("B doing something with: " + aProperty);
    }

    void method1C(int aProperty) {
        System.out.println("C doing something with: " + aProperty);
    }

    void method1D(int aProperty) {
        System.out.println("D doing something with: " + aProperty);
    }

    void method1E(int aProperty) {
        System.out.println("E doing something with: " + aProperty);
    }
}