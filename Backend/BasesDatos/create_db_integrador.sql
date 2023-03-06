-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_integrador_makaia
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_integrador_makaia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_integrador_makaia` DEFAULT CHARACTER SET utf8 ;
USE `db_integrador_makaia` ;

-- -----------------------------------------------------
-- Table `db_integrador_makaia`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_integrador_makaia`.`Cliente` (
  `cedula` INT(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellidos` VARCHAR(90) NULL,
  `celular` INT NULL,
  `mail` VARCHAR(45) NULL,
  `direccion_residencia` VARCHAR(45) NULL,
  `ciudad` VARCHAR(45) NULL,
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_integrador_makaia`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_integrador_makaia`.`Empleado` (
  `cedula` INT(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apelllidos` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `mail` VARCHAR(45) NULL,
  `direccion_residencia` VARCHAR(45) NULL,
  `ciudad` VARCHAR(45) NULL,
  `antiguedad_empresa` DATE NULL,
  `rh_sangre` VARCHAR(45) NULL,
  `tipo_empleado` VARCHAR(45) NULL,
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_integrador_makaia`.`Paquete`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_integrador_makaia`.`Paquete` (
  `idPaquete` INT NOT NULL,
  `tipo` VARCHAR(45) NULL,
  `peso` DOUBLE NOT NULL,
  `valor_declardo` DOUBLE NOT NULL,
  PRIMARY KEY (`idPaquete`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_integrador_makaia`.`Envio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_integrador_makaia`.`Envio` (
  `num_guia` INT NOT NULL,
  `cliente` INT NOT NULL,
  `ciudad_origen` VARCHAR(45) NOT NULL,
  `ciudad_destino` VARCHAR(45) NOT NULL,
  `dir_destino` VARCHAR(45) NOT NULL,
  `nombre_recibe` VARCHAR(45) NOT NULL,
  `celular_recibe` INT NOT NULL,
  `hora_entrega` DATETIME NULL,
  `estado` VARCHAR(45) NULL,
  `valor_envio` DOUBLE NULL,
  `paquete` INT NOT NULL,
  PRIMARY KEY (`num_guia`),
  INDEX `paquete_idx` (`paquete` ASC) VISIBLE,
  INDEX `cliente_idx` (`cliente` ASC) VISIBLE,
  CONSTRAINT `paquete`
    FOREIGN KEY (`paquete`)
    REFERENCES `db_integrador_makaia`.`Paquete` (`idPaquete`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `cliente`
    FOREIGN KEY (`cliente`)
    REFERENCES `db_integrador_makaia`.`Cliente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
