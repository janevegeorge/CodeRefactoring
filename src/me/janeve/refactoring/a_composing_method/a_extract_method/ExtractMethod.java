package me.janeve.refactoring.a_composing_method.a_extract_method;

import java.util.List;

class ExtractMethod {

    void printOwing(List<Member> members) {
        //print banner
        System.out.println(" ----------------------- ");
        System.out.println("Title: Outstanding Amounts");
        System.out.println(" ----------------------- ");

        //print details of members
        for(Member m: members) {
            System.out.println("name: " + m.getName());
            System.out.println("amount: " + m.getOutstanding());
        }

        //print footer
        System.out.println(" ----------------------- ");
    }

}