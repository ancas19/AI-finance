package co.com.ancas.finance.model.enums;

public enum ErrorMessages {
    ERROR_MESSAGE_DNI_ALREADY_EXISTS("Already exists an user with that DNI (%s)"),
    ERROR_MESSAGE_EMAIL_ALREADY_EXISTS("Already exists an user with that email (%s)");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
