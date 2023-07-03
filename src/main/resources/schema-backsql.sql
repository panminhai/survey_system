CREATE TABLE IF NOT EXISTS `survey_title` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `comment` VARCHAR(90) NULL,
  `status` INT NOT NULL DEFAULT 0,
  `start_time` DATE NULL,
	`end_time` DATE NULL,
  PRIMARY KEY (`number`));
  
 CREATE TABLE IF NOT EXISTS `survey_question` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(45) NULL,
  `options` VARCHAR(100) NULL,
  `category` VARCHAR(20) NULL,
  `be_write` TINYINT NULL DEFAULT 0,

  PRIMARY KEY (`number`));
  


  




