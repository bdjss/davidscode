package org.david.code.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by william on 2017/6/7.
 */
public class MultiThread {

    private static Logger logger = LoggerFactory.getLogger(MultiThread.class);

    private ExecutorService fixedExecutorService = Executors.newFixedThreadPool(3);


    public void run() {
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            fixedExecutorService.execute(new Runnable() {
                public void run() {
                    System.out.println(finalI + ":" + Thread.currentThread().getName());
                }
            });
        }
    }

    public void runBasic() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(3000);//sleep不能写在synchronized块中
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (this) {
                        try {
                            System.out.println(Thread.currentThread().getName() + ",start to run...");
                            System.out.println(Thread.currentThread().getName() + ",running...");
                            this.wait();//释放锁,同时本线程阻塞
                            System.out.println(Thread.currentThread().getName() + ",end running...");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        System.out.println("waiting all runner end...");
        synchronized (this) {
            this.notifyAll();
            System.out.println("all runner end...");
        }

        System.out.println("finish...");

    }

}
