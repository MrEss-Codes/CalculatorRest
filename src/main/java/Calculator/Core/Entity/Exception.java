package Calculator.Core.Entity;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class Exception {
   //Our entity that we use to send a json object containing error information
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;


    public Exception(String message,
                     HttpStatus httpStatus,
                     ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }


    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
