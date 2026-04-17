package co.com.ancas.finance.api.responses.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ErrorResponse(
    List<String> errors,
    String status,
    String uri,
    LocalDateTime timeStamp
) {
}
