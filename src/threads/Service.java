package threads;

import java.util.concurrent.CountDownLatch;

class AppStartup {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3); // 3 services to wait for

        Thread service1 = new Thread(new Service("Database Service", 2000, latch));
        Thread service2 = new Thread(new Service("Cache Service", 3000, latch));
        Thread service3 = new Thread(new Service("Message Queue Service", 1000, latch));

        service1.start();
        service2.start();
        service3.start();

        System.out.println("Main thread waiting for services to start");
        latch.await();
        System.out.println("All services are active! Application is starting now.");
    }
}

public class Service implements Runnable {
    private final String name;
    private final int timeToStart;
    private final CountDownLatch latch;

    public Service(String name, int timeToStart, CountDownLatch latch) {
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeToStart);
            System.out.println(name + " is active");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            latch.countDown();
        }
    }
}
