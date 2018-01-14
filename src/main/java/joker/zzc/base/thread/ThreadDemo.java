package joker.zzc.base.thread;

/**
 * Created by chun on 18-1-14.
 */
public class ThreadDemo extends Thread {
    private Thread thread;
    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Starting " + name);
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }

    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + name + ", " + i);
                thread.sleep(20);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted, " + e.toString());
        }
        System.out.println("Thread " + name + "exiting.");
    }
}
