package designpatterns.decoratorpattern;

public class SimpleMessage implements Message{
    @Override
    public String getContent() {
        return "Happy Morning";
    }
}
