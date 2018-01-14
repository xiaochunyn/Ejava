package joker.zzc.base.thread;

/**
 * Created by chun on 18-1-14.
 */
public class RunnableDemo implements Runnable{
    private Thread thread;
    private String threadName;

    RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + threadName + ", " + i);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println("Thread: " + threadName + " interrupted. ");
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    // $threadName enter ready state
    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

//class TestThread {
//
//}