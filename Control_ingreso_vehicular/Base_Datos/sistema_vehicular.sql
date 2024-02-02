-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2023 a las 06:06:32
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_vehicular`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `control_entrada_salida`
--

CREATE TABLE `control_entrada_salida` (
  `Id_Control_Entrada_salida` varchar(10) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `hora_entrada` time NOT NULL,
  `fecha_salida` date NOT NULL,
  `hora_salida` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_entrada_salida`
--

CREATE TABLE `tabla_entrada_salida` (
  `id_entrada_salida` int(11) NOT NULL,
  `fecha_entrada` date NOT NULL,
  `hora_entrada` time NOT NULL,
  `fecha_salida` date NOT NULL,
  `hora_salida` time NOT NULL,
  `Id_ingresantes` int(11) NOT NULL,
  `Id_vehiculos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_usuarios`
--

CREATE TABLE `tabla_usuarios` (
  `Id_Usuarios` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tabla_usuarios`
--

INSERT INTO `tabla_usuarios` (`Id_Usuarios`, `Usuario`, `Contraseña`) VALUES
(1, 'sheyla', '12345'),
(3, 'Mercedes', '2003'),
(7, 'SEDE', '1234'),
(10, 'Marcos', '24'),
(11, 'walter', '11'),
(18, 'Ney', '2015'),
(44, 'Rosa', '8'),
(45, 'sheyla', '90'),
(56, 'MIN', '1996'),
(60, 'Rosita', '1980'),
(78, 'Meche', '23092003'),
(100, 'cien', '1000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_vehiculos`
--

CREATE TABLE `tabla_vehiculos` (
  `Id_vehiculos` int(11) NOT NULL,
  `propietario_vehiculo` varchar(255) NOT NULL,
  `dni_propietario` varchar(255) NOT NULL,
  `conductor` varchar(8) NOT NULL,
  `dni_conductor` int(11) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `licencia` varchar(40) NOT NULL,
  `tipo_vehiculo` varchar(40) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `placa_anterior` varchar(60) NOT NULL,
  `placa_vigente` varchar(60) NOT NULL,
  `Num_vin` varchar(50) NOT NULL,
  `sede` varchar(30) NOT NULL,
  `color` varchar(255) NOT NULL,
  `serie` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tabla_vehiculos`
--

INSERT INTO `tabla_vehiculos` (`Id_vehiculos`, `propietario_vehiculo`, `dni_propietario`, `conductor`, `dni_conductor`, `correo`, `telefono`, `licencia`, `tipo_vehiculo`, `marca`, `placa_anterior`, `placa_vigente`, `Num_vin`, `sede`, `color`, `serie`, `descripcion`) VALUES
(1, 'jazmin ', '77153366', 'Jazmin', 77153366, 'jasminhuLP@gmail.com', '9876544', 'SI', 'Motocicletas', 'mavila ', 'ninguna', '1906-jp', 'dgdfghgf676869', 'Piura', 'azul', 'dgdfghgf676869', 'luces'),
(3, 'dff', '24345', 'fgdgdg', 34566, 'fgfghfhf', '3454563467', 'NO', 'Motocicletas', 'waxin', 'w4gcdg', 'fege', '345354tretg', 'Cajamarca', 'fdwt', 'tetet', 'yrtytutu'),
(12, 'delel', '2345555', 'sheyk', 234567889, 'shey@gmail.com', '987656789', 'NO', 'Motocicletas', 'wanxin', '27764', 'i8t838746u', '634587', 'Lambayeque', 'rojo', 'sdotj9er', 'ste'),
(122, 'shey', '2442123123', 'sdjkgok', 131313, 'shey@gmail.cpm', '12344532', 'SI', 'Camioneta', 'wagd', 'dgg', 'gedg', '23er', 'La Libertad', 'er', 'erer2', 'ftgefg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `control_entrada_salida`
--
ALTER TABLE `control_entrada_salida`
  ADD PRIMARY KEY (`Id_Control_Entrada_salida`);

--
-- Indices de la tabla `tabla_entrada_salida`
--
ALTER TABLE `tabla_entrada_salida`
  ADD PRIMARY KEY (`id_entrada_salida`),
  ADD UNIQUE KEY `Id_Usuarios` (`Id_ingresantes`),
  ADD UNIQUE KEY `Id_vehiculos` (`Id_vehiculos`),
  ADD UNIQUE KEY `Id_ingresantes` (`Id_ingresantes`);

--
-- Indices de la tabla `tabla_usuarios`
--
ALTER TABLE `tabla_usuarios`
  ADD PRIMARY KEY (`Id_Usuarios`),
  ADD UNIQUE KEY `Contraseña` (`Contraseña`);

--
-- Indices de la tabla `tabla_vehiculos`
--
ALTER TABLE `tabla_vehiculos`
  ADD PRIMARY KEY (`Id_vehiculos`),
  ADD UNIQUE KEY `dni_propietario` (`dni_propietario`),
  ADD UNIQUE KEY `dni_conductor` (`dni_conductor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
