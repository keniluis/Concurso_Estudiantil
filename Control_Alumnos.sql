SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `Control_Alumnos` ;
CREATE SCHEMA IF NOT EXISTS `Control_Alumnos` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `Control_Alumnos` ;

-- -----------------------------------------------------
-- Table `Control_Alumnos`.`Carrera`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Control_Alumnos`.`Carrera` ;

CREATE TABLE IF NOT EXISTS `Control_Alumnos`.`Carrera` (
  `IdCarrera` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `CantidadSemenstres` VARCHAR(45) NULL,
  PRIMARY KEY (`IdCarrera`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Control_Alumnos`.`Alumno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Control_Alumnos`.`Alumno` ;

CREATE TABLE IF NOT EXISTS `Control_Alumnos`.`Alumno` (
  `NoControl` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Domicilio` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Edad` INT NOT NULL,
  `Carrera_IdCarrera` INT NOT NULL,
  PRIMARY KEY (`NoControl`),
  INDEX `fk_Alumno_Carrera_idx` (`Carrera_IdCarrera` ASC),
  CONSTRAINT `fk_Alumno_Carrera`
    FOREIGN KEY (`Carrera_IdCarrera`)
    REFERENCES `Control_Alumnos`.`Carrera` (`IdCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
