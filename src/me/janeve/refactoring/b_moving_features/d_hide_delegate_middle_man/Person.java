package me.janeve.refactoring.b_moving_features.d_hide_delegate_middle_man;

public class Person {

    private Department department;
    private String name;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}