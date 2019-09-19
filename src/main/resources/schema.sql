CREATE TABLE USER
    (
        id INT NOT NULL AUTO_INCREMENT,
        username VARCHAR,
        password VARCHAR,
        active BOOLEAN,
        roles VARCHAR,
        PRIMARY KEY (id)
    );