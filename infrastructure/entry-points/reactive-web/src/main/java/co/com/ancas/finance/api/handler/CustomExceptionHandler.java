package co.com.ancas.finance.api.handler;


import co.com.ancas.finance.api.responses.exception.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.ServerWebInputException;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(ServerWebInputException.class)
    public ResponseEntity<ErrorResponse> handleServerWebInputException(ServerWebInputException ex, ServerWebExchange exchange) {
        log.error("ServerWebInputException: ", ex);
        String userMessage = "Invalid request data. Please check your input and try again.";
        String detailedMessage = ex.getReason() != null ? ex.getReason() : ex.getMessage();
        String fieldError = null;
        if (detailedMessage != null && detailedMessage.contains("field")) {
            fieldError = detailedMessage;
        }
        List<String> errors = fieldError != null ? List.of(userMessage, fieldError) : List.of(userMessage, detailedMessage);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ErrorResponse(
                        errors,
                        HttpStatus.BAD_REQUEST.toString(),
                        exchange.getRequest().getURI().toString(),
                        LocalDateTime.now())
                );
    }
}
