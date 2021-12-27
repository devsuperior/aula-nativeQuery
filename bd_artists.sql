CREATE TABLE genres (
  id              INTEGER     NOT NULL,
  name            VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE artists (
  id              INTEGER      NOT NULL,
  name            VARCHAR(100) NOT NULL,
  genre_id        INTEGER,
  birthdate   	  DATE,
  country      	  VARCHAR(30),
  PRIMARY KEY(id),
  FOREIGN KEY(genre_id) REFERENCES genres
);


INSERT INTO genres VALUES(1, 'Pop');
INSERT INTO genres VALUES(2, 'Rock');
INSERT INTO genres VALUES(3, 'Heavy Metal');
INSERT INTO genres VALUES(4, 'Mpb');
INSERT INTO genres VALUES(5, 'Rap');
INSERT INTO genres VALUES(6, 'Eletrônica');
INSERT INTO genres VALUES(7, 'Hip Hop');
INSERT INTO genres VALUES(8, 'R&B');
INSERT INTO genres VALUES(9, 'Samba');


INSERT INTO artists VALUES(1, 'Beyoncé', 1, '1981-09-04', 'United States');
INSERT INTO artists VALUES(2, 'Nina Simone', 8, '1933-02-21', 'United States');
INSERT INTO artists VALUES(3, 'Caetano Veloso', 4, '1942-08-07', 'Brazil');
INSERT INTO artists VALUES(4, 'Milton Nascimento', 4, '1942-10-26', 'Brazil');
INSERT INTO artists VALUES(5, 'Elis Regina', 4, '1945-03-17', 'Brazil');
INSERT INTO artists VALUES(6, 'Lady Gaga', 1, '1986-03-28', 'United States');
INSERT INTO artists VALUES(7, 'Adele', 1, '1988-05-05', 'United Kingdom');
INSERT INTO artists VALUES(8, 'Shakira', 1, '1977-02-02', 'Colombia');
INSERT INTO artists VALUES(9, 'Anitta', 1, '1993-03-30', 'Brazil');
INSERT INTO artists VALUES(10, 'Cartola', 9, '1908-11-11', 'Brazil');
INSERT INTO artists VALUES(11, 'Ivone Lara', 9, '1921-04-13', 'Brazil');
