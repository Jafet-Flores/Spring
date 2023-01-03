INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$MJ3/Ok51vzDMR2EFiPP5S.2KaZuihKkW.Exnqpu7yePCNY1f7XMaC',1,'Andres','Guzman','profesor@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('jafet','$2a$10$VgBhxu5xJsCkabek7clkmOPFbo5rgJdVa.DcWUbFwm/4oefVNEVMq',1,'Jafet','Flores','jafet@bolsadeideas.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);