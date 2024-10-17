package com.Zeotap.RuleEngine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Node {
    String type;  // "operator" or "operand"
    Node left;
    Node right;
    Object value;  // value for operands like age, department, etc.
}
