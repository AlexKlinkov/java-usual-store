CREATE TABLE IF NOT EXISTS users
(
    id       bigint generated always as identity not null primary key,
    username VARCHAR(255)                        NOT NULL,
    email    VARCHAR(255)                        NOT NULL,
    password VARCHAR(255)                        NOT NULL,
    balance  DOUBLE                              NOT NULL
);

CREATE TABLE IF NOT EXISTS roles
(
    id   bigint generated always as identity not null primary key,
    name VARCHAR(255)                        NOT NULL
);

CREATE TABLE IF NOT EXISTS users_roles
(
    user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES roles (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS products
(
    id          bigint generated always as identity not null primary key,
    name        VARCHAR(255)                        NOT NULL,
    description VARCHAR(2000)                       NOT NULL,
    price       DOUBLE                              NOT NULL,
    stock       bigint                              NOT NULL,
    discount_id bigint,
    FOREIGN KEY (discount_id) REFERENCES discounts (id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS companies
(
    id          bigint generated always as identity not null primary key,
    name        VARCHAR(255)                        NOT NULL,
    description VARCHAR(2000),
    logo        VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS products_companies
(
    product_id bigint NOT NULL,
    company_id bigint NOT NULL,
    PRIMARY KEY (product_id, company_id),
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE,
    FOREIGN KEY (company_id) REFERENCES companies (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS reviews
(
    id         bigint generated always as identity not null primary key,
    content    VARCHAR(500)                        NOT NULL,
    rating     bigint                              NOT NULL,
    user_id    bigint                              NOT NULL,
    product_id bigint                              NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS features
(
    id         bigint generated always as identity not null primary key,
    name       VARCHAR(255)                        NOT NULL,
    value      VARCHAR(255)                        NOT NULL,
    product_id bigint                              NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS discounts
(
    id         bigint generated always as identity not null primary key,
    amount     DOUBLE                              NOT NULL,
    start_date TIMESTAMP                           NOT NULL,
    end_date   TIMESTAMP                           NOT NULL
);

CREATE TABLE IF NOT EXISTS products_discounts
(
    product_id  bigint NOT NULL,
    discount_id bigint NOT NULL,
    PRIMARY KEY (product_id, discount_id),
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE,
    FOREIGN KEY (discount_id) REFERENCES discounts (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS notifications
(
    id      bigint generated always as identity not null primary key,
    title   VARCHAR(255)                        NOT NULL,
    date    TIMESTAMP                           NOT NULL,
    content VARCHAR(500)                        NOT NULL,
    user_id INTEGER                             NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS grades_users
(
    user_id    bigint NOT NULL,
    product_id bigint NOT NULL,
    grade      double,
    PRIMARY KEY (user_id, product_id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS users_accounts
(
    id      bigint generated always as identity not null primary key,
    user_id bigint                              NOT NULL,
    status  VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS users_companies
(
    user_id bigint NOT NULL,
    company_id bigint NOT NULL,
    PRIMARY KEY (user_id, company_id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (company_id) REFERENCES companies (id) ON DELETE CASCADE
);



