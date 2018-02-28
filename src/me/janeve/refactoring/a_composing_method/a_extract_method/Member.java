package me.janeve.refactoring.a_composing_method.a_extract_method;

public class Member {
    private String name;
    private Double outstanding;
    private String designation;

    public Member(String name, String designation, Double outstanding) {
        this.name = name;
        this.outstanding = outstanding;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOutstanding() {
        return outstanding;
    }

    public void setOutstanding(Double outstanding) {
        this.outstanding = outstanding;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}