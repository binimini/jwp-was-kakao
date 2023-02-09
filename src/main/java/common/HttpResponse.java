package common;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {
    private Map<HttpHeader, String> headers = new HashMap<>();
    private byte[] body = "".getBytes();
    private HttpStatus httpStatus;

    public HttpResponse() {
    }

    public HttpResponse(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getHeader(HttpHeader header) {
        return headers.get(header);
    }

    public byte[] getBody() {
        return body;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHeader(final HttpHeader header, final String value) {
        this.headers.put(header, value);
    }

    public void setBody(final byte[] body) {
        this.body = body;
        setHeader(HttpHeader.CONTENT_LENGTH, String.valueOf(body.length));
    }

    public void setHttpStatus(final HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}