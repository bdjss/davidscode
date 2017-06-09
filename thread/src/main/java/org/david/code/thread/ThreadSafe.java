package org.david.code.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by david on 2017/6/8.
 */
public class ThreadSafe {

    private static AtomicInteger count = new AtomicInteger(0);

    public void testAtomicInteger() {
        int i1 = count.get();
        System.out.println(i1);
        int i2 = count.getAndSet(5);
        System.out.println(i2);
        int i3 = count.get();
        System.out.println(i3);
        int i4 = count.getAndIncrement();
        System.out.println(i4);
        int i5 = count.get();
        System.out.println(i5);
        int i6 = count.incrementAndGet();
        System.out.println(i6);
        int i7 = count.get();
        System.out.println(i7);

        boolean b1 = count.compareAndSet(7, 1);//先预期当前值，如果true才set
        System.out.println("b1=" + b1 + ",count=" + count.get());


    }

}
