package designpatterns.observerpattern;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name){
        this.name = name;
    }

    public void update(String title){
        System.out.println("new video out, "+name);
    }
}
