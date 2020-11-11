package com.dystopiastudios.easystory.cucumber;


import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class ResponseResults {
    private final ClientHttpResponse clientResponse;
    private final String body;

    ClientHttpResponse getTheResponse() {
        return clientResponse;
    }

    String getBody() {
        return body;
    }
    ResponseResults(final ClientHttpResponse response) throws IOException {
        this.clientResponse = response;
        final InputStream bodyInputStream = response.getBody();
        if (null == bodyInputStream) {
            this.body = "{}";
        } else {
            final StringWriter stringWriter = new StringWriter();
            IOUtils.copy(bodyInputStream, stringWriter);
            this.body = stringWriter.toString();
        }
    }

}
