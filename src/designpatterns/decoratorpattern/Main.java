package designpatterns.decoratorpattern;

public class Main {
    public static void main(String[] args) {
        Message message = new SimpleMessage();
        System.out.println(message.getContent());

        message = new ExclamationDecorator(message);
        System.out.println(message.getContent());

        Message msg = new SimpleMessage();
        msg = new HappyFace(msg);
        System.out.println(msg.getContent());

    }
}

