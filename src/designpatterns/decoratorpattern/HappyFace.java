package designpatterns.decoratorpattern;

import javax.swing.*;

public class HappyFace implements Message {

    private Message message;

    public HappyFace(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent() + ":)";
    }
}
