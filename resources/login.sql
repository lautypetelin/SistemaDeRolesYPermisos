-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2024 a las 20:09:26
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `login`
--
CREATE DATABASE IF NOT EXISTS `login` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `login`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `ID` int(11) NOT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `NOMBREROL` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`ID`, `DESCRIPCION`, `NOMBREROL`) VALUES
(1, 'Rol para administradores.', 'admin'),
(2, 'Rol para usuarios comúnes.', 'user');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(11) NOT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `CONTRASENIA` varchar(255) DEFAULT NULL,
  `CORREOELECTRONICO` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `FK_ROL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `APELLIDO`, `CONTRASENIA`, `CORREOELECTRONICO`, `NOMBRE`, `FK_ROL`) VALUES
(1, NULL, 'admin123', 'admin@mail.com', 'Administrador', 1),
(2, 'Gomez', 'alejandro123', 'alejandroGomez@mail.com', 'Alejandro', 2),
(3, 'Rodriguez', 'laura123', 'lauraRodriguez@mail.com', 'Laura', 2),
(4, 'Fernandez', 'carlos123', 'carlosFernandez@mail.com', 'Carlos', 2),
(5, 'Perez', 'marta123', 'martaPerez@mail.com', 'Marta', 2),
(6, 'Martinez', 'javier123', 'javierMartinez@mail.com', 'Javier', 2),
(7, 'López', 'isabel123', 'isabelLopez@mail.com', 'Isabel', 2),
(8, 'Sánchez', 'juan123', 'juanSanchez@mail.com', 'Juan', 2),
(9, 'García', 'ana123', 'anaGarcia@mail.com', 'Ana', 2),
(10, 'Díaz', 'luis123', 'luisDiaz@mail.com', 'Luis', 2),
(11, 'Torres', 'patricia123', 'patriciaTorres@mail.com', 'Patricia', 2),
(12, 'Herrera', 'francisco123', 'franciscoHerrera@mail.com', 'Francisco', 2),
(13, 'Romero', 'sonia123', 'soniaRomero@mail.com', 'Sonia', 2),
(14, 'Ramírez', 'pedro123', 'pedroRamirez@mail.com', 'Pedro', 2),
(15, 'Vargas', 'carmen123', 'carmenVargas@mail.com', 'Carmen', 2),
(16, 'Mendoza', 'raul123', 'raulMendoza@mail.com', 'Raúl', 2),
(17, 'Ruiz', 'beatriz123', 'beatrizRuiz@mail.com', 'Beatriz', 2),
(18, 'Castro', 'alberto123', 'albertoCastro@mail.com', 'Alberto', 2),
(19, 'Morales', 'teresa123', 'teresaMorales@mail.com', 'Teresa', 2),
(20, 'Cruz', 'manuel123', 'manuelCruz@mail.com', 'Manuel', 2),
(21, 'Álvarez', 'lucia123', 'luciaAlvarez@mail.com', 'Lucía', 2),
(22, 'González', 'marcos123', 'marcosGonzalez@mail.com', 'Marcos', 2),
(23, 'Hernández', 'laura456', 'lauraHernandez@mail.com', 'Laura', 2),
(24, 'Jiménez', 'oscar123', 'oscarJimenez@mail.com', 'Óscar', 2),
(25, 'Márquez', 'sofia123', 'sofiaMarquez@mail.com', 'Sofía', 2),
(26, 'Castillo', 'daniel123', 'danielCastillo@mail.com', 'Daniel', 2),
(27, 'Serrano', 'victoria123', 'victoriaSerrano@mail.com', 'Victoria', 2),
(28, 'Torres', 'carlos456', 'carlosTorres@mail.com', 'Carlos', 2),
(29, 'Paredes', 'raul456', 'raulParedes@mail.com', 'Raúl', 2),
(30, 'Vega', 'maria123', 'mariaVega@mail.com', 'María', 2),
(31, 'Muñoz', 'pedro456', 'pedroMunoz@mail.com', 'Pedro', 2),
(32, 'Fuentes', 'ana456', 'anaFuentes@mail.com', 'Ana', 2),
(33, 'Salazar', 'juan456', 'juanSalazar@mail.com', 'Juan', 2),
(34, 'Vázquez', 'susana123', 'susanaVazquez@mail.com', 'Susana', 2),
(35, 'Ruiz', 'alberto123', 'albertoRuiz@mail.com', 'Alberto', 2),
(36, 'Luna', 'patricia456', 'patriciaLuna@mail.com', 'Patricia', 2),
(37, 'Gil', 'jorge123', 'jorgeGil@mail.com', 'Jorge', 2),
(38, 'Ríos', 'luisa123', 'luisaRios@mail.com', 'Luisa', 2),
(39, 'Navarro', 'fernando123', 'fernandoNavarro@mail.com', 'Fernando', 2),
(40, 'Pinto', 'elena123', 'elenaPinto@mail.com', 'Elena', 2),
(41, 'Cordero', 'ricardo123', 'ricardoCordero@mail.com', 'Ricardo', 2),
(42, 'Delgado', 'beatriz456', 'beatrizDelgado@mail.com', 'Beatriz', 2),
(43, 'Romero', 'manuel456', 'manuelRomero@mail.com', 'Manuel', 2),
(44, 'Sánchez', 'angel123', 'angelSanchez@mail.com', 'Ángel', 2),
(45, 'Martín', 'marta456', 'martaMartin@mail.com', 'Marta', 2),
(46, 'Ortiz', 'cristina123', 'cristinaOrtiz@mail.com', 'Cristina', 2),
(47, 'Martínez', 'emilio123', 'emilioMartinez@mail.com', 'Emilio', 2),
(48, 'Cabrera', 'miriam123', 'miriamCabrera@mail.com', 'Miriam', 2),
(49, 'Escobar', 'francisco456', 'franciscoEscobar@mail.com', 'Francisco', 2),
(50, 'Bermúdez', 'carmen456', 'carmenBermudez@mail.com', 'Carmen', 2),
(51, 'Ponce', 'gabriel123', 'gabrielPonce@mail.com', 'Gabriel', 2),
(52, 'García', 'marta789', 'martaGarcia@mail.com', 'Marta', 2),
(53, 'Torres', 'pablo123', 'pabloTorres@mail.com', 'Pablo', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_USUARIO_FK_ROL` (`FK_ROL`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_USUARIO_FK_ROL` FOREIGN KEY (`FK_ROL`) REFERENCES `rol` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
