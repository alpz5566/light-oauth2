package com.networknt.oauth.token.handler;

import com.networknt.client.Client;
import com.networknt.server.Server;
import com.networknt.exception.ClientException;
import com.networknt.exception.ApiException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
* Generated by swagger-codegen
*/
public class Oauth2TokenPostHandlerTest {
    @ClassRule
    public static TestServer server = TestServer.getInstance();

    static final Logger logger = LoggerFactory.getLogger(Oauth2TokenPostHandlerTest.class);

    @Test
    public void testOauth2TokenPostHandler() throws ClientException, ApiException {
        CloseableHttpClient client = Client.getInstance().getSyncClient();
        HttpPost httpPost = new HttpPost("http://localhost:6882/v1/oauth2/token");
        /*
        Client.getInstance().addAuthorization(httpPost);
        try {
            CloseableHttpResponse response = client.execute(httpPost);
            Assert.assertEquals(200, response.getStatusLine().getStatusCode());
            Assert.assertEquals("postToken", IOUtils.toString(response.getEntity().getContent(), "utf8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
