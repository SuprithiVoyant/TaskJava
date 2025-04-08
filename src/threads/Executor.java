package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0; i<5; i++){
            Runnable task = new MyTask("Task1 "+i);
            executorService.submit(task);
        }
        for(int i=0; i<5; i++){
            Runnable task = new MyTask("Task2 "+i);
            executorService.submit(task);
        }

        executorService.shutdown();
    }
}
