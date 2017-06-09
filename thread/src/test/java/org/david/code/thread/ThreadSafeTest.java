package org.david.code.thread;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ThreadSafe Tester.
 *
 * @author david
 * @version 1.0
 * @since <pre>06/08/2017</pre>
 */
public class ThreadSafeTest {

    private ThreadSafe threadSafe;

    @Before
    public void before() throws Exception {
        threadSafe = new ThreadSafe();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: testAtomicInteger()
     */
    @Test
    public void testTestAtomicInteger() throws Exception {
        threadSafe.testAtomicInteger();
    }


} 
