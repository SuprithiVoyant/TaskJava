package designpatterns.statepattern;

public class LowState implements State {
    public void pressButton(Fan fan){
        System.out.println("Low speed");
        fan.setState(new MediumState());
    }
}
