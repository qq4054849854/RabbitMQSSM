/*
SQLyog Ultimate v12.2.6 (64 bit)
MySQL - 5.5.29 : Database - exam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`exam` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `exam`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `user_class` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `user_account` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `user_pwd` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `user_type` int(1) DEFAULT NULL COMMENT '1老师2学生',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`,`user_class`,`user_account`,`user_pwd`,`user_type`) values 
(1,'范冰冰','1班','fanbinbin','123',1),
(2,'张三丰','123班','zhangsan','123',2),
(3,'123','123班','123','123',1),
(4,'李四','123班','lisi','123',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
