package me.janeve.refactoring.a_composing_method.c_extract_variable;

public class Platform {

    String name;

    public Platform(String name) {
        this.name = name;
    }

    public String toUpperCase() {
        return name.toUpperCase();
    }
}