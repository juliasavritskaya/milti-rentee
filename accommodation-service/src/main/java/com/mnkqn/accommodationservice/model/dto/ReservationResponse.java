package com.mnkqn.accommodationservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationResponse {

    private String status;

    //TODO
    /*
    private ReservationStatus status;

    enum ReservationStatus{
        SUCCESSFULLY_APPLIED,
        DECLINED
    }
    */
}
