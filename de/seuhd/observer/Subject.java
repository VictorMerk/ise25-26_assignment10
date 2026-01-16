package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        System.out.println("Sending update to observers ...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
