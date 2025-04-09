package threads;

public class LightSwitch {
    static volatile boolean lightOn = false;

    public static void main(String[] args) {
        Thread person1 = new Thread(() -> {
            while (!lightOn) {
                System.out.println("Person 1: Waiting...");
            }
            System.out.println("Person 1: Light is ON! Noticed.");
        });

        Thread person2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            lightOn = true;
            System.out.println("Person 2: Turned ON the light.");
        });

        person1.start();
        person2.start();
    }
}
