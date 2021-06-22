package com.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferReminder
{
    private Long id;
    private String series;
    private String emailId;
    private String offerReminderType;
    private String pfpCode;
    private String pfplCode;

}
