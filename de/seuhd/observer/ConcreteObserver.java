package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    private static int observerCount = 0;
    private int observerNumber;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        observerCount++;
        this.observerNumber = observerCount;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject) {
            ConcreteSubject concreteSubject = (ConcreteSubject) subject;
            System.out.println("Observer " + observerNumber + " received update from subject : New value is " + concreteSubject.getValue());
        }
    }

    public void detach() {
        subject.detach(this);
    }
}
