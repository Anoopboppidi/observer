package com.java.pattern.behavioral.observer;

public interface IObservable {
    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void notifyObservers(String message);
}
