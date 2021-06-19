package com.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommunicationRule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commRuleId;
    private String ruleName;
    private String description;
    private Boolean isActive;
    private String objectName;
    private String fieldName;
    private String condition;
    private String fieldValue;
    private String fieldType;
    private Long leftHandRuleId;
    private String leftHandCondition;
    private String version;
    private List<String> auditorFields;


}
