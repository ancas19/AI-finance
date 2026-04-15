package co.com.ancas.finance.r2dbc.mapper;

import co.com.ancas.finance.model.people.PeopleModel;
import co.com.ancas.finance.r2dbc.entities.PeopleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeopleDatabaseMapper {
    PeopleModel toPeopleModel(PeopleEntity peopleEntity);

    PeopleEntity toPeopleEntity(PeopleModel peopleModel);

}
