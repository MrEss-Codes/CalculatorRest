package Calculator.Controller;

import Calculator.Core.Entity.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class ExceptionHandlerRestAdvice {
        //Handles exceptions when input can't be converted from string to a number
        @ExceptionHandler(NumberFormatException.class)
        public ResponseEntity<Object> handleNumberFormatException(NumberFormatException e) {
           // Create Payload
            Exception exception = new Exception(
                    e.getMessage(),
                    HttpStatus.BAD_REQUEST, //400
                    ZonedDateTime.now(ZoneId.of("CET"))
            );
            // Return response entity
            return new ResponseEntity<>(exception,HttpStatus.BAD_REQUEST);
        }

        //Handles Exceptions when we get a 404 not found error
        @ExceptionHandler(NoHandlerFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public ResponseEntity<Object> HandleNoHandlerFoundException(NoHandlerFoundException e) {
        // Create Payload
        Exception exception = new Exception(
                e.getMessage(),
                HttpStatus.NOT_FOUND, //404
                ZonedDateTime.now(ZoneId.of("CET"))
        );
        // Return response entity
        return new ResponseEntity<>(exception,HttpStatus.NOT_FOUND);
    }


}
