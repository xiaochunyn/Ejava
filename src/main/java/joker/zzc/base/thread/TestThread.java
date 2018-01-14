package joker.zzc.base.thread;

/**
 * Created by chun on 18-1-14.
 */
public class TestThread {
    public static void main(String[] args) {
//        RunnableDemo r1 = new RunnableDemo("Thread1");
//        r1.start();
//        RunnableDemo r2 = new RunnableDemo("Thread2");
//        r2.start();

        ThreadDemo t1 = new ThreadDemo("t1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("t2");
        t2.start();
    }
}
