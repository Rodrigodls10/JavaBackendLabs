-- Aumentar el salario Juan Perez
UPDATE empleados
SET salario = 75000.00
WHERE nombre = "Juan Perez";

-- Cambiar el puesto de Ana gomez
UPDATE empleados
SET puesto = "Jefe de Diseno"
WHERE id = 2;
