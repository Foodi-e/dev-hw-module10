CREATE TABLE IF NOT EXISTS CLIENT(
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(200) CHECK(LENGTH(name) >= 3 )
);

CREATE TABLE IF NOT EXISTS PLANET(
    id VARCHAR PRIMARY KEY CHECK (id = UPPER(id)),
    name VARCHAR(500)
);

CREATE TABLE IF NOT EXISTS TICKET(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    created_at TIMESTAMP,
    client_id BIGINT,
    from_planet_id VARCHAR,
    to_planet_id VARCHAR,
    FOREIGN KEY (client_id) REFERENCES CLIENT(id),
    FOREIGN KEY (from_planet_id) REFERENCES PLANET(id),
    FOREIGN KEY (to_planet_id) REFERENCES PLANET(id)
);