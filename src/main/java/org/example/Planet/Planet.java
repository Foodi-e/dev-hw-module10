package org.example.Planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PLANET")
public class Planet {
    @Id
    private String id;

    @Column(name = "name")
    private String name;
}
