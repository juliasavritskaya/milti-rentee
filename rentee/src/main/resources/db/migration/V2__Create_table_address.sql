CREATE TABLE "address"
(
    "id"               bigserial   NOT NULL PRIMARY KEY,
    "country"          varchar(60) NOT NULL,
    "city"             varchar(60) NOT NULL,
    "street"           varchar(60) NOT NULL,
    "building_number"  varchar(60) NOT NULL,
    "apartment_number" varchar(60),
    "accommodation_id" int8        NOT NULL
);

ALTER TABLE accommodation
    ADD address_id int8 NOT NULL,
    ADD CONSTRAINT fk_address FOREIGN KEY(address_id) references address(id);