---------------------------------------

-- Criar banco de dados caso não exista
CREATE DATABASE ecommerce;

---------------------------------------

CREATE TABLE customer (
  customer_id bigserial PRIMARY KEY,
  name varchar(255) NOT NULL,
  tax_id varchar(30) NOT NULL,
  email varchar(255) NOT NULL,
  phone varchar(20) NOT NULL,
  address varchar(255) NOT NULL,
  complement varchar(20),
  number varchar(6) NOT NULL,
  neighborhood varchar(30) NOT NULL,
  city varchar(40) NOT NULL,
  state varchar(20) NOT NULL
);

CREATE TABLE product (
 product_id bigserial PRIMARY KEY,
 name varchar(50) NOT NULL,
 description TEXT,
 price numeric(19,2) NOT NULL,
 qty_stock numeric(19,4) NOT NULL DEFAULT 0.00
);

CREATE TABLE payment_method (
  payment_method_id bigserial PRIMARY KEY,
  name varchar(20) NOT NULL,
  is_card boolean NOT NULL DEFAULT FALSE
);

CREATE TABLE demand (
  demand_id bigserial PRIMARY KEY,
  date_ordered timestamp NOT NULL DEFAULT now(),
  customer_id bigint NOT NULL REFERENCES customer(customer_id),
  total_items numeric(19,2) NOT NULL,
  total numeric(19,2) NOT NULL
);





