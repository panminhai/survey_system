CREATE TABLE IF NOT EXISTS `survey_title` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `comment` VARCHAR(90) NULL,
  `status` INT NOT NULL DEFAULT 0,
  `start_time` DATE NULL,
	`end_time` DATE NULL,
  PRIMARY KEY (`number`));
  




