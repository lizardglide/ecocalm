package com.capgemini.ecocalm.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Progress {
    private String co2Saved;
    private String electricityConsumptionReduction;
}
