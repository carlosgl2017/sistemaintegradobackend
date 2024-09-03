INSERT INTO users (username,email,lastname,name,password) VALUES ('admin','carlos2017gl@gmail.com','garcia','carlos','$2a$10$DOMDxjYyfZ/e7RcBfUpzqeaCs8pLgcizuiQWXPkU35nOhZlFcE9MS');

INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_USER');

INSERT INTO users_roles (role_id,user_id) VALUES (1,1);
--INSERT INTO users_roles (role_id,user_id) VALUES (1,2);
