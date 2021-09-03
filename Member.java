package com.java.pattern.behavioral.observer;

public class Member implements IObserver{
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void update(String message) {
        System.out.println("Received message for " + this.firstName + " " + this.lastName + " and message is :" + message);
    }
}
