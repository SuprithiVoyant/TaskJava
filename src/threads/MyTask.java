package threads;

public class MyTask implements Runnable {
    private String name;
    public MyTask(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task: " + name);
        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}