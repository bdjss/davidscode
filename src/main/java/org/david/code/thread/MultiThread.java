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

    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    public void run() {
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("123");
                logger.info("running...");
            }
        });
    }

}
