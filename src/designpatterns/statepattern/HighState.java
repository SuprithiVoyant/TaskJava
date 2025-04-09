package designpatterns.statepattern;

public class HighState implements State {
    public void pressButton(Fan fan) {
        System.out.println("Turning fan OFF");
        fan.setState(new OffState());
    }
}