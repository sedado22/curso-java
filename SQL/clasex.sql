-- Comentario de linea
/*
Comentario de bloque
*/
-- Creamos la  base
CREATE 	DATABASE 	mis_usuarios_24250;
-- Nos posicionamos dentro de la nueva base de datos
USE mis_usuarios_24250;
-- Creamos la tabla paises
CREATE TABLE Paises(
idPais INT 	auto_increment primary key,
nombrePais varchar(100) NOT NULL
);
-- Inspeccionamos si la tabla esta creada
SHOW TABLES;
--  Inspeccionamos la tabla
SELECT * FROM Paises;
-- Creamos la tabla usuarios
CREATE TABLE Usuarios (
idUsuario INT auto_increment primary key,
nombre varchar(50) NOT NULL,
apellido varchar(50) NOT NULL,
email varchar(75) NOT NULL,
dir VARCHAR(50),
telefono VARCHAR(20),
-- diseñamos la foreign key
fkPais INT,
foreign key(fkPais) references Paises(idPais)
);
-- Inspeccionamos la tabla usuarios
SELECT * FROM Usuarios;
-- Agregamos columnas a la tabla
ALTER TABLE Usuarios ADD clave varchar(100) NOT NULL;
ALTER TABLE Usuarios ADD fechaNacimiento date not null;
-- Agregamos una columna en un lugar particular
ALTER TABLE Usuarios ADD mascota varchar(50) after idUsuario;
-- Borrar una columna
ALTER TABLE Usuarios DROP column mascota ;
ALTER TABLE Usuarios drop column telefono ;
ALTER TABLE Usuarios drop column dir ;

-- Clausulas del tipo DML para manipular tablas
-- Cargamos la tabla pais
INSERT INTO Paises (nombrePais) VALUE ('argentina'), ('brasil'),('chile'),('peru'), ('colombia'), ('uruguay');

-- Inspeccionamos la tabla paises
SELECT * from Paises;

-- Cargamos la tabla usuarios
INSERT INTO Usuarios (nombre, apellido, email, clave, fechaNacimiento, fkPais) VALUES
-- ('juan', 'perez', 'juanf@perez.com', '123456', '1980-10-5', 5 );
('Juan', 'Perez', 'juan.perez@example.com', 'password123', '1990-01-15', 1),
('Maria', 'DaSilva', 'maria.gomez@example.com', 'securepass', '1985-07-30', 2),
('Carlos', 'Lopez', 'carlos.lopez@example.com', 'mypassword', '1992-11-23', 3),
('Ana', 'Martinez', 'ana.martinez@example.com', 'anotherpass', '1988-05-10', 4),
('Luis', 'Rodriguez', 'luis.rodriguez@example.com', 'newpassword', '1995-03-05', 5);
-- Inspeccionamos la carga
SELECT * FROM Usuarios; 
-- Consultas varias
SELECT nombre, clave, apellido from Usuarios WHERE apellido='perez';
-- Consultas con WHERE
SELECT apellido, nombre FROM Usuarios WHERE fkPais = 5;
-- Consultas ordenadas
SELECT apellido, nombre, fkPais FROM Usuarios ORDER BY apellido;
-- Consultas avanzadas en mas de una tabla con JOIN
SELECT Usuarios.apellido, Usuarios.nombre, Pais.nombrePais
FROM Usuarios JOIN Paises ON Usuarios.fkPais = Paises.idPais;


