-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         11.1.0-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para redes2
CREATE DATABASE IF NOT EXISTS `redes2` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `redes2`;

-- Volcando estructura para procedimiento redes2.eliminar_producto_por_nombre
DELIMITER //
CREATE PROCEDURE `eliminar_producto_por_nombre`(
  IN nombre_param VARCHAR(100)
)
BEGIN
  DELETE FROM productos WHERE nombre = nombre_param;
END//
DELIMITER ;

-- Volcando estructura para procedimiento redes2.IngresarProducto
DELIMITER //
CREATE PROCEDURE `IngresarProducto`(
  IN nombre_param VARCHAR(100),
  IN precio_param DOUBLE,
  IN descripcion_param VARCHAR(100),
  IN cantidad_param INT
)
BEGIN
  INSERT INTO productos (nombre, precio, descripcion, cantidad)
  VALUES (nombre_param, precio_param, descripcion_param, cantidad_param);
END//
DELIMITER ;

-- Volcando estructura para procedimiento redes2.modificar_producto_por_nombre
DELIMITER //
CREATE PROCEDURE `modificar_producto_por_nombre`(
  IN nombre_param VARCHAR(100),
  IN precio_param DOUBLE,
  IN descripcion_param VARCHAR(100),
  IN cantidad_param INT
)
BEGIN
  UPDATE productos SET
    precio = precio_param,
    descripcion = descripcion_param,
    cantidad = cantidad_param
  WHERE nombre = nombre_param;
END//
DELIMITER ;

-- Volcando estructura para tabla redes2.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla redes2.productos: ~2 rows (aproximadamente)
INSERT INTO `productos` (`id`, `nombre`, `precio`, `descripcion`, `cantidad`) VALUES
	(2, 'Nutella', 50, 'Spread', 400),
	(3, 'Camisa', 40, 'Camisa azul de hombre', 800);

-- Volcando estructura para procedimiento redes2.ver_productos
DELIMITER //
CREATE PROCEDURE `ver_productos`()
BEGIN
  SELECT * FROM productos;
END//
DELIMITER ;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
