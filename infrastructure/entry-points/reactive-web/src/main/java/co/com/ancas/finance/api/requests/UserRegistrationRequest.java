package co.com.ancas.finance.api.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Schema(description = "User registration request payload")
public record UserRegistrationRequest(
        @NotNull(message="Names is required")
        @NotBlank(message="Names is required")
        String names,
        @NotBlank(message = "Lastnames is required")
        @NotNull(message = "Lastnames is required")
        String lastNames,
        @NotBlank(message = "DNI is required")
        @NotNull(message = "DNI is required")
        @Pattern(regexp = "^\\d{10,15}$", message = "DNI must contain only digits and have a length between 10 and 15 characters")
        String dni,
        @NotBlank(message = "Cellphone is require")
        @NotNull(message = "Cellphone is require")
        @Pattern(regexp = "^\\+[0-9]{11,15}$", message = "Cellphone must be valid")
        String cellphone,
        @NotBlank(message = "Email is required")
        @NotNull(message = "Email is required")
        @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Email must be valid")
        String email,
        @NotBlank(message = "Password is required")
        @NotNull(message = "Password is required")
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password must be valid. The password must be contains at least 8 characters")
        String password
) {
}
