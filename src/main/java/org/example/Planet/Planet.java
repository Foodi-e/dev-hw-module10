package org.example.Planet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@Table(name = "PLANET")
public class Planet {
    @Id
    @Pattern(regexp = "^[A-Z0-9]+$")
    private String id;

    @Column(name = "name")
    @Length(min = 1, max = 500)
    private String name;
}
