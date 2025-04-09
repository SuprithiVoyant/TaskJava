package threads;

public class ThreadLocals {
    private static final ThreadLocal<String> dogSession = new ThreadLocal<>();

    public static void main(String[] args) {

        Runnable dog1 = () ->{
            dogSession.set("Dog has bone 1");
            System.out.println(Thread.currentThread().getName() + " : "+dogSession.get());
        };

        Runnable dog2 = ()->{
            dogSession.set("Dog has Bone 2");
            System.out.println(Thread.currentThread().getName()+" : "+dogSession.get());
        };

        Runnable dog3 = ()->{
            dogSession.set("Dog has Bone 3");
            System.out.println(Thread.currentThread().getName()+" : "+dogSession.get());
        };

        Thread t1 = new Thread(dog1, "Thread1");
        Thread t2 = new Thread(dog2, "Thread2");
        Thread t3 = new Thread(dog3, "Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
