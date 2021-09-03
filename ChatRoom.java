package com.java.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IObservable{
    String title;
    List<IObserver> members = new ArrayList<IObserver>();

    public ChatRoom(String title) {
        this.title = title;
    }

    public void receiveMessage(String message){
        System.out.println("Chatroom " + this.title + " received message : "+ message);
        System.out.println("Notifying members....");
        this.notifyObservers(message);
    }


    @Override
    public void add(IObserver person) {
        members.add(person);
    }

    @Override
    public void remove(IObserver person) {
        members.removeIf(member -> member.equals(person));
    }

    @Override
    public void notifyObservers(String message) {
        for(IObserver member : members){
            member.update(message);
        }
    }
}
