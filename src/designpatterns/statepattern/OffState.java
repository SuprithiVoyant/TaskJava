package designpatterns.statepattern;

public class OffState implements State{
    public void pressButton(Fan fan){
        System.out.println("Off");
        fan.setState(new LowState());
    }
}
