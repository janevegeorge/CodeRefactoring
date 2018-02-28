package me.janeve.refactoring.b_moving_features.d_hide_delegate_middle_man;

public class Department {

    private String name;
    private Person manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }
}