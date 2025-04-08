package designpatterns.observerpattern;

public class Main {
    public static void main(String[] args) {
        Youtube channel = new Youtube();

        Observer sub1 = new Subscriber("Ram");
        Observer sub2 = new Subscriber("sam");
        Observer sub3 = new Subscriber("dam");

        channel.subscriber(sub1);
        channel.subscriber(sub2);
        channel.subscriber(sub3);

        channel.uploadVideo("video one");

        channel.unsubscribe(sub2);

        channel.uploadVideo("video two");
    }
}
