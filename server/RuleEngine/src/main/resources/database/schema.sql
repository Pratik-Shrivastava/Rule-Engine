CREATE TABLE IF NOT EXISTS rule (
    id SERIAL PRIMARY KEY,
    rule_string VARCHAR(255) NOT NULL,
    ast JSONB NOT NULL

);