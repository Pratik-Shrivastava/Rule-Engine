package com.Zeotap.RuleEngine.rule.repository;

import com.Zeotap.RuleEngine.rule.model.Rule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Integer> {

}
