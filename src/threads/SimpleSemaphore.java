package threads;

import java.util.concurrent.Semaphore;

public class SimpleSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // only 2 times permissions

        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            try {
                System.out.println(name+" trying to enter...");
                semaphore.acquire();
                System.out.println(name+" entered.");
                Thread.sleep(2000);
                System.out.println(name+" exiting.");
                semaphore.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
        new Thread(task, "Thread-3").start();
    }
}
