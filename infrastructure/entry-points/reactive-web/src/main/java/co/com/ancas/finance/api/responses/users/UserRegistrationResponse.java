package co.com.ancas.finance.api.responses.users;


public record UserRegistrationResponse(
        String names,
        String lastNames,
        String dni,
        String cellphone,
        String email
) {
}
