package designpatterns.decoratorpattern;

public class ExclamationDecorator implements Message{

    private Message message;

    public ExclamationDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent() + "!";
    }
}
