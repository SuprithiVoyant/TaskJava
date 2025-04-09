package designpatterns.observerpattern;

public interface Subject {
    void subscriber(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubs();
}
