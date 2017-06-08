package org.david.code.net;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.HttpAsyncClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2017/6/7.
 */
public class HttpRequest {

    private static Logger logger = LoggerFactory.getLogger(HttpRequest.class);

    public String request() {
        String body = null;
        CloseableHttpAsyncClient httpClient = null;
        try {
            httpClient = HttpAsyncClients.createDefault();
            httpClient.start();
            HttpGet request = new HttpGet("http://www.sina.com.cn");
            Future<HttpResponse> future = httpClient.execute(request, null);
            HttpResponse response = future.get();
            if (response != null) {
                logger.info(request.getRequestLine() + "=========" + response.getStatusLine() + "======" + response.getEntity().getContent());
            }
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream is = entity.getContent();
                Reader reader = new InputStreamReader(is);
                StringBuilder sb = new StringBuilder();
                char[] tmp = new char[2014];
                int len;
                while ((len = reader.read(tmp)) != -1) {
                    sb.append(tmp);
                }
                body = sb.toString();
            }
        } catch (Exception e) {
            logger.error("error", e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                logger.error("close error", e);
            }
        }
        return body;
    }

}
