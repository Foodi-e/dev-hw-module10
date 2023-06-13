package org.example.Ticket;

import jakarta.persistence.*;
import lombok.Data;
import org.example.Client.Client;
import org.example.Planet.Planet;

@Entity
@Data
@Table(name = "Ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "created_at")
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "from_planet_id")
    private Planet FromPlanet;

    @OneToOne
    @JoinColumn(name = "to_planet_id")
    private Planet ToPlanet;


}
