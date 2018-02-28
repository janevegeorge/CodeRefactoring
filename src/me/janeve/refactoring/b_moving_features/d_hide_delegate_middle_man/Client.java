package me.janeve.refactoring.b_moving_features.d_hide_delegate_middle_man;

public class Client {

    private void someTransaction(Person person){
        Department department = person.getDepartment();
        Person manager = department.getManager();

        System.out.println("Manager: " + manager.getName());
    }

}