INSERT INTO CLIENT (name) VALUES
    ('John Doe'),
    ('Jane Smith'),
    ('Michael Johnson'),
    ('Emily Davis'),
    ('Robert Brown'),
    ('Emma Wilson'),
    ('David Anderson'),
    ('Olivia Thompson'),
    ('Daniel Martinez'),
    ('Sophia Rodriguez');

INSERT INTO PLANET (id, name) VALUES
    ('EARTH', 'Earth'),
    ('MARS', 'Mars'),
    ('JUPITER', 'Jupiter'),
    ('SATURN', 'Saturn'),
    ('VENUS', 'Venus');

INSERT INTO TICKET (created_at, client_id, from_planet_id, to_planet_id) VALUES
    ('2020-01-01 10:00:00', 1, 'EARTH', 'MARS'),
    ('2020-02-02 12:00:00', 2, 'EARTH', 'VENUS'),
    ('2021-03-03 15:30:00', 3, 'MARS', 'JUPITER'),
    ('2021-04-04 16:45:00', 4, 'JUPITER', 'SATURN'),
    ('2022-05-05 18:20:00', 5, 'MARS', 'EARTH'),
    ('2022-06-06 09:10:00', 6, 'SATURN', 'VENUS'),
    ('2022-07-07 11:30:00', 7, 'VENUS', 'MARS'),
    ('2023-08-08 14:15:00', 8, 'EARTH', 'SATURN'),
    ('2023-09-09 17:00:00', 9, 'JUPITER', 'EARTH'),
    ('2023-10-10 19:45:00', 10, 'VENUS', 'JUPITER');