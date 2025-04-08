package designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject {

    List<Observer> subs = new ArrayList<>();
    private String latestVideo;

    @Override
    public void subscriber(Observer observer) {
        subs.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subs.remove(observer);
    }

    @Override
    public void notifySubs() {
        for(Observer observer : subs){
            observer.update(latestVideo);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        System.out.println("New video uploaded: " + videoTitle);
        notifySubs();
    }
}
