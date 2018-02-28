package me.janeve.refactoring.b_moving_features.b_move_field;

public class Class2 {

    Class1 class1 = new Class1();

    void method2A() {
        int aProperty = class1.commonFunction();
        class1.method1A(aProperty);
    }


    void method2B() {
        int aProperty = class1.commonFunction();
        class1.method1B(aProperty);
    }


    void method2C() {
        int aProperty = class1.commonFunction();
        class1.method1C(aProperty);
    }


    void method2D() {
        int aProperty = class1.commonFunction();
        class1.method1D(aProperty);
    }


    void method2E() {
        int aProperty = class1.commonFunction();
        class1.method1E(aProperty);
    }

}