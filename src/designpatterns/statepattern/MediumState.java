package designpatterns.statepattern;

public class MediumState implements State {
    public void pressButton(Fan fan) {
        System.out.println("Full speed");
        fan.setState(new HighState());
    }
}