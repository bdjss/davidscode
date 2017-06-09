package org.david.code.thread;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * MultiThread Tester.
 *
 * @author david
 * @version 1.0
 * @since <pre>06/08/2017</pre>
 */
public class MultiThreadTest {

    private MultiThread multiThread = null;

    @Before
    public void before() throws Exception {
        multiThread = new MultiThread();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testRun() throws Exception {
        multiThread.run();
    }

    @Test
    public void testRunBasic() throws Exception {
        multiThread.runBasic();
    }


} 
