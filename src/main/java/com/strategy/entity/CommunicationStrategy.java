package com.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommunicationStrategy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stId;
    private String strategyName;
    private String description;
    private Boolean isActive;
    private String version;
    private List<String> auditorFields;

    @ManyToMany(mappedBy = "communication_strategy")
    private List<CommunicationSchedule> schedules;
}
