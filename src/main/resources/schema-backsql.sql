CREATE TABLE IF NOT EXISTS `survey_title` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `status` TINYINT NULL DEFAULT 0,
  `start_time` DATE NULL,
	`end_time` DATE NULL,
  PRIMARY KEY (`number`));
  




