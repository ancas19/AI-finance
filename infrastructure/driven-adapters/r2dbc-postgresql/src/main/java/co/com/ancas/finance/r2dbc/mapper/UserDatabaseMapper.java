package co.com.ancas.finance.r2dbc.mapper;

import co.com.ancas.finance.model.users.UserModel;
import co.com.ancas.finance.r2dbc.entities.UsersEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDatabaseMapper {
    UsersEntity toUsersEntity(UserModel userModel);

    UserModel toUserModel(UsersEntity usersEntity);
}
