package org.david.code;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * RateLimit Tester.
 *
 * @author david
 * @version 1.0
 * @since <pre>06/09/2017</pre>
 */
public class RateLimitTest {

    private RateLimit rateLimit;

    @Before
    public void before() throws Exception {
        rateLimit = new RateLimit();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: runRateLimiter()
     */
    @Test
    public void testRunRateLimiter() throws Exception {
        rateLimit.runRateLimiter();
    }


} 
