CREATE TABLE "additional_characteristics"
(
    "id"                    bigserial NOT NULL PRIMARY KEY,
    "has_furniture"         BOOLEAN   NOT NULL,
    "has_fridge"            BOOLEAN   NOT NULL,
    "has_internet"          BOOLEAN   NOT NULL,
    "has_kitchen_furniture" BOOLEAN   NOT NULL,
    "has_washing_machine"   BOOLEAN   NOT NULL,
    "has_balcony"           BOOLEAN   NOT NULL,
    "has_plate"             BOOLEAN   NOT NULL,
    "has_tv"                BOOLEAN   NOT NULL,
    "has_conditioner"       BOOLEAN   NOT NULL
);
ALTER TABLE accommodation
    ADD additional_characteristics_id int8 NOT NULL,
    ADD CONSTRAINT fk_additional_characteristics FOREIGN KEY(additional_characteristics_id) references additional_characteristics(id);
