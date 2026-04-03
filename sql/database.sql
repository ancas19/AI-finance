create table if not exists people(
                                     id serial primary key,
                                     names varchar(200) not null,
    last_names varchar(200) not null,
    dni varchar(30) unique not null,
    cellphone varchar(30) not null,
    created_by varchar(200) not null,
    created_at timestamp  default now() not null,
    updated_by varchar(200),
    updated_at timestamp
    );


create index idx_people_dni
    on people(dni);


create table if not exists users(
                                    id serial primary key,
                                    email varchar(200)not null,
    password varchar(1000) not null,
    person_id int not null unique,
    created_by varchar(200) not null,
    created_at timestamp  default now() not null,
    updated_by varchar(200),
    updated_at timestamp,
    constraint fk_user_person_id foreign key (person_id) references people(id)  on delete cascade
    );


create unique index idx_users_email
    on users(lower(email));

create index idx_users_person_id
    on users(person_id);