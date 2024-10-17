package com.Zeotap.RuleEngine.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Node {

    private Long id;

    private String type;    // "operator" or "operand"
    private String value;   // e.g., "age > 30", "department = 'Sales'"

    private Node left;      // Left child node

    private Node right;     // Right child node
}
