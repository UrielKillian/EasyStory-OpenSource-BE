package com.dystopiastudios.easystory.cucumber;

import com.dystopiastudios.easystory.EasystoryApplication;
import io.cucumber.java.en.And;
import io.cucumber.spring.CucumberContextConfiguration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;



@CucumberContextConfiguration
@SpringBootTest(classes = EasystoryApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringIntegrationTest {
    static ResponseResults latestResponse = null;
    public static HttpStatus response;

    @Autowired
    protected RestTemplate restTemplate;

    private final String BASE_URL = "http://localhost:8080";

    private static class ResponseResultErrorHandler implements ResponseErrorHandler {
        private ResponseResults results = null;
        private Boolean hadError = false;

        private ResponseResults getResults() {
            return results;
        }

        @Override
        public boolean hasError(ClientHttpResponse response) throws IOException {
            hadError = response.getRawStatusCode() >= 400;
            return hadError;
        }

        @Override
        public void handleError(ClientHttpResponse response) throws IOException {
            results = new ResponseResults(response);
        }
    }

    //POST METHOD
    public void executePost(String url, Object body) throws IOException {
        if (body != null){
            HttpEntity<Object> request = new HttpEntity<>(body);
            response = restTemplate
                    .exchange(BASE_URL+url, HttpMethod.POST, request, String.class).getStatusCode();
            String a = "";
        }
        else {
            response = HttpStatus.BAD_REQUEST;
        }


    }
    //GET METHOD
    public void executeGet(String url, Object body) throws IOException {
        if (body != null){
            HttpEntity<Object> request = new HttpEntity<>(body);
            response = restTemplate
                    .exchange(BASE_URL+url, HttpMethod.GET, request, String.class).getStatusCode();
            String a = "";
        }
        else {
            response = HttpStatus.BAD_REQUEST;
        }


    }

}
