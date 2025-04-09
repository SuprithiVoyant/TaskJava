package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FoodDelivery {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable notifyUser = () -> {
            System.out.println("Notification: Your order has been placed!");
        };

        Callable<String> prepareOrder = () -> {
            Thread.sleep(3000);
            return "Order -> 15 minutes";
        };

        executor.submit(notifyUser);

        Future<String> orderStatus = executor.submit(prepareOrder);

        System.out.println("Waiting for your food...");

        String result = orderStatus.get();
        System.out.println("Update: " + result);

        executor.shutdown();
    }
}
