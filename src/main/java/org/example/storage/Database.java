package org.example.storage;

import org.flywaydb.core.Flyway;

public class Database{
    private static final String DB_JDBC_CONNECTION_URL = "jdbc:h2:./SpaceTravel";
    public static void main(String[] args) {

        Flyway flyway = Flyway
                .configure()
                .dataSource(DB_JDBC_CONNECTION_URL, null, null)
                .load();
        flyway.migrate();

    }
}
