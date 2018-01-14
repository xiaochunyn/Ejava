package joker.zzc.base.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by chun on 18-1-14.
 */
public class FutureDemo implements Callable<Integer> {

    public static void main(String[] args) {
        FutureDemo futureDemo = new FutureDemo();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(futureDemo);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " i = " + i);
            if (i == 20) {
                new Thread(futureTask, "new a thread with return value").start();
            }
        }
        try {
            System.out.println("Value of subThread" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
