create table "users"
(
    id                 bigserial   not null,
    user_uuid          varchar     not null,
    first_name         varchar(60) not null,
    last_name          varchar(60) not null,
    email              varchar(60) not null,
    encrypted_password varchar(60) not null,
    primary key (id)
);