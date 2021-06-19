package com.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicationSchedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long scId;
    private String scheduleName;
    private String description;
    private Boolean isActive;
    private Integer onDay;
    private String startDayType;
    private String letterType;
    private String smsType;
    private String versions;
    private List<String> auditorFields;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "strategy_schedule",joinColumns = @JoinColumn(name = "stratedy_id", referencedColumnName = "st_id"), inverseJoinColumns = @JoinColumn(name = "schedule_id", referencedColumnName = "sc_id"))
    private List<CommunicationStrategy> strategies;

}
