-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2019 a las 01:03:49
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(10) NOT NULL,
  `nombre` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `descripcion` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `idproveedor` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nombre`, `descripcion`, `idproveedor`) VALUES
(1, 'Leche evaporada con miel', '450ml de leche evaporada Amarillo', 1),
(2, 'Cil', 'Aceite', 1),
(3, 'Sal', 'Yodada', 2),
(4, 'Galleta', 'Ritz', 2),
(5, 'Harina', 'Blanca flor 50kg', 2),
(6, 'Ayudin', 'el gordito rendidor de 450gr', 2),
(7, 'Paneton', '800gr ', 1),
(8, 'Galletas', '4 unidades', 2),
(9, 'Harina pastelera', '25kg', 2),
(10, 'Gelatina Negrita', '125gr', 2),
(11, 'Gelatina Naranja', '125gr sabor a fruta', 1),
(12, 'Gelatina Piña', 'Gelatina sabor a fruta', 1),
(13, 'Gelatina de manzana', 'Gelatina sabor a fruta', 1),
(14, 'Harina pastelera', 'harina de 25kg', 2),
(15, 'Harina Kekes', 'Harina de 25kg', 2),
(16, 'Ajinomen', 'Sopa instantáneo', 2),
(17, 'Cerveza Cristal', '450ml de cerveza de alta calidad', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idproveedor` int(10) NOT NULL,
  `nombreproveedor` varchar(500) COLLATE utf8mb4_bin NOT NULL,
  `ruc` varchar(15) COLLATE utf8mb4_bin NOT NULL,
  `direccion` varchar(500) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idproveedor`, `nombreproveedor`, `ruc`, `direccion`) VALUES
(1, 'Gloria S.A.A.', '10465896525', 'Jr. Gloria Nº1463'),
(2, 'Alicorp', '20365896544', 'Jr. Alicorp Nº2341'),
(3, 'Aje Perú', '13124412412', 'Av. Alfonsu Ugarte 1654'),
(4, 'Unique', '31246124121', 'Av. 26 de Enero 1412');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idproveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idproducto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idproveedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
