CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    name VARCHAR(80),
    surname VARCHAR(80),
    cpf VARCHAR(11),
    phone_number VARCHAR(15),
    income DOUBLE PRECISION
);

CREATE TABLE proposal (
    id SERIAL PRIMARY KEY,
    amount_requested DOUBLE PRECISION,
    payment_deadline INT,
    approved BOOLEAN,
    integrated BOOLEAN,
    observation TEXT,
    user_id BIGINT,
    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES "user" (id)
);
