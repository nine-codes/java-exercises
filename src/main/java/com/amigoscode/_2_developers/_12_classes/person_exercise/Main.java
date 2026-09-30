package com.amigoscode._2_developers._12_classes.person_exercise;

public class Main {
    static void main() {
        Person person = new Person(
                "Zack",
                "Doe",
                18,
                Gender.MALE,
                new Address("Test Street", "Test City", "Test Country")
        );

        System.out.println(person);
    }
}
