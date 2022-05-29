CREATE TABLE IF NOT EXISTS users
(
    user_id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL
);

CREATE TABLE IF NOT EXISTS phones
(
    phone_id    BIGSERIAL PRIMARY KEY ,
    assigned_ip  VARCHAR(200) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);