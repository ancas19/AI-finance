package co.com.ancas.finance.api.mapper;

import co.com.ancas.finance.api.requests.UserRegistrationRequest;
import co.com.ancas.finance.model.users.UserCreationModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserCreationModel mapToUserCreationModel(UserRegistrationRequest userRegistrationRequest);
}
