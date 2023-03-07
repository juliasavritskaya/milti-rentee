CREATE TABLE "accommodation"
(
    "id"          bigserial     NOT NULL PRIMARY KEY,
    "name"        varchar(255)  NOT NULL,
    "description" varchar(1000) NOT NULL,
    "price"       int          NOT NULL,
    "rooms"       int2          NOT NULL,
    "bedrooms"    int2          NOT NULL
);