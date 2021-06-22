package com.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    String strategy;
    String email;
    Date placementDate;
    OfferTag offerTag;
    TreatmentTool treatmentTool;
    StrategyId strategyId;


}
