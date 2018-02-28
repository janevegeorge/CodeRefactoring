package me.janeve.refactoring.a_composing_method.a_extract_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    private static Random randomizer = new Random();

    public static void main(String[] args) {
        ExtractMethod obj = new ExtractMethod();

        String[] designations = {"Owner", "Admin", "Editor", "Contributor", "User"};

        final List<Member> members = new ArrayList<>();

        IntStream.rangeClosed(0, 10).forEach(
            i -> {
                members.add(new Member("User " + i, designations[randomizer.nextInt(designations.length)], randomizer.nextDouble()));
            }
        );

        obj.printOwing(members);
    }

}