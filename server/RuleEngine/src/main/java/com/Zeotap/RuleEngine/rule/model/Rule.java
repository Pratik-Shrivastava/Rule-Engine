package com.Zeotap.RuleEngine.rule.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Rule {

    @Id
    private int id;
    private String ruleString;
    private Object ast;
}
