package me.janeve.refactoring.a_composing_method.c_extract_variable;

public class Browser {

    private String name;

    public Browser(String name) {
        this.name = name;
    }

    public String toUpperCase() {
        return name.toUpperCase();
    }
}