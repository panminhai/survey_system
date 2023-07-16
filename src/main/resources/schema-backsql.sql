CREATE TABLE IF NOT EXISTS `survey_title` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `t_number` INT NOT NULL,
  `title` VARCHAR(45) NULL,
  `comment` VARCHAR(90) NULL,
  `status` INT NOT NULL DEFAULT 0,
  `start_time` DATE NULL,
	`end_time` DATE NULL,
  PRIMARY KEY (`number`));
  
 CREATE TABLE IF NOT EXISTS `survey_question` (
  `number` INT NOT NULL AUTO_INCREMENT,
  `q_number` INT NOT NULL,
  `question` VARCHAR(45) NULL,
  `options` VARCHAR(100) NULL,
  `category` VARCHAR(20) NULL,
  `be_write` TINYINT NULL DEFAULT 0,

  PRIMARY KEY (`number`));
  
  CREATE TABLE IF NOT EXISTS `user_info` (
    `number` INT NOT NULL AUTO_INCREMENT,
	`user_name` VARCHAR(45) NULL,
	`phone` VARCHAR(20) NULL,
	`mail` VARCHAR(30) NULL,
	`age` INT NULL,
	`t_number` INT NOT NULL,
 	`question` VARCHAR(45) NULL,
 	`answer` VARCHAR(45) NULL,
 	`write_time` DATETIME NULL,
    PRIMARY KEY (`number`));


  
  


  




