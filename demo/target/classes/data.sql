-- Inserts para la tabla RecetaMC
-- Nota: cantidadChocolateGramos se convierte en cantidad_chocolate_gramos
INSERT INTO receta_mc (cantidad_chocolate_gramos, cantidad_huevos, cantidad_mantequilla_gramos, cantidad_azucar_gramos) 
VALUES (200.0, 4, 150.0, 100.0);

INSERT INTO receta_mc (cantidad_chocolate_gramos, cantidad_huevos, cantidad_mantequilla_gramos, cantidad_azucar_gramos) 
VALUES (250.0, 6, 180.0, 120.0);

-- Inserts para la tabla UtensilioMC
-- Nota: Se usan los nombres de campos que definiste: horno, espatula, trituradora
INSERT INTO utensilio_mc (horno, espatula, trituradora) 
VALUES ('Horno convencional', 'Espátula de silicona', 'Trituradora de mano');

INSERT INTO utensilio_mc (horno, espatula, trituradora) 
VALUES ('Horno profesional', 'Espátula metálica', 'Trituradora industrial');

-- Inserts para la tabla ChefMC
-- Nota: añosExperiencia se convierte en años_experiencia
INSERT INTO chef_mc (nombre, especialidad, años_experiencia) 
VALUES ('Juan', 'Postres de chocolate', 10);

INSERT INTO chef_mc (nombre, especialidad, años_experiencia) 
VALUES ('Ana', 'Mousse y repostería fría', 5);