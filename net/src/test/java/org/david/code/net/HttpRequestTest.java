package org.david.code.net;

import org.david.code.net.HttpRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * HttpRequest Tester.
 *
 * @author david
 * @version 1.0
 * @since <pre>06/07/2017</pre>
 */
public class HttpRequestTest {

    private HttpRequest httpRequest;

    @Before
    public void before() throws Exception {
        httpRequest = new HttpRequest();
    }

    @Test
    public void testRequest() {
        String result = httpRequest.request();
        assertNotNull(result);
    }

    @After
    public void after() throws Exception {
    }


} 
