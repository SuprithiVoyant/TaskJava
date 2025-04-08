package designpatterns.statepattern;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
    }
}