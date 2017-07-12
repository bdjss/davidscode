package org.david.code;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by william on 2017/6/9.
 */
public class RateLimit {

    public void runRateLimiter() {

        final CountDownLatch countDownLatch = new CountDownLatch(10);

        int num = 10;

        final RateLimiter rateLimiter = RateLimiter.create(5);//
        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                public void run() {
                    if (rateLimiter.tryAcquire(1, TimeUnit.SECONDS)) {
                        System.out.println(Thread.currentThread() + "...");
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    countDownLatch.countDown();
                }
            }).start();

        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finish...");

    }

}
