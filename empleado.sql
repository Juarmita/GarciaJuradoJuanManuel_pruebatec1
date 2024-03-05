-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 05-03-2024 a las 20:38:10
-- Versión del servidor: 8.2.0
-- Versión de PHP: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empleados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `APELLIDO` varchar(255) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `CARGO` varchar(255) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `FECHAINICIO` varchar(255) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `NOMBRE` varchar(255) COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `SALARIO` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`ID`, `APELLIDO`, `CARGO`, `FECHAINICIO`, `NOMBRE`, `SALARIO`) VALUES
(5, 'Garcia', 'Java Developer', '25/04/2024', 'Juan', 1500),
(17, 'Perez', 'SEO', '24/15/2500', 'Antonio', 2500);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
