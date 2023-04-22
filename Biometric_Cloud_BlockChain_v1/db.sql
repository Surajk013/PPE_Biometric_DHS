/*
SQLyog - Free MySQL GUI v5.19
Host - 5.5.29 : Database - db_biometric_blockchain
*********************************************************************
Server version : 5.5.29
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `db_biometric_blockchain`;

USE `db_biometric_blockchain`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `m_admin` */

DROP TABLE IF EXISTS `m_admin`;

CREATE TABLE `m_admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `phone no` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `m_admin` */

insert into `m_admin` (`admin_id`,`userid`,`password`,`username`,`phone no`,`address`,`email`) values (1,'admin','admin','admin','9876787678','btm','admin@gmail.com');

/*Table structure for table `m_request` */

DROP TABLE IF EXISTS `m_request`;

CREATE TABLE `m_request` (
  `s_no` int(20) NOT NULL AUTO_INCREMENT,
  `adhar_no` varchar(50) DEFAULT NULL,
  `adharimg_feature` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`s_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `m_request` */

insert into `m_request` (`s_no`,`adhar_no`,`adharimg_feature`) values (2,'1111','6~19'),(4,'1234','6~19'),(5,'1555565231485','29~86');

/*Table structure for table `m_user` */

DROP TABLE IF EXISTS `m_user`;

CREATE TABLE `m_user` (
  `sno` int(50) NOT NULL AUTO_INCREMENT,
  `author_no` varchar(13) DEFAULT NULL,
  `u_name` varchar(30) DEFAULT NULL,
  `u_pass` varchar(50) DEFAULT NULL,
  `f_name` varchar(30) DEFAULT NULL,
  `m_name` varchar(30) DEFAULT NULL,
  `dob` varchar(30) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `hosue_no` varchar(50) DEFAULT NULL,
  `village` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `state` varchar(25) DEFAULT NULL,
  `pin` decimal(10,0) DEFAULT NULL,
  `phone` decimal(50,0) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `u_image` varchar(50) DEFAULT NULL,
  `u_fingerprint` varchar(50) DEFAULT NULL,
  `encrypted_features` varchar(600) DEFAULT NULL,
  `previous_shatg` varchar(300) DEFAULT NULL,
  `shatag` varchar(300) DEFAULT NULL,
  `timestamps` varchar(80) DEFAULT NULL,
  `nonce` int(60) DEFAULT NULL,
  `blkid` varchar(70) DEFAULT NULL,
  `status` varchar(300) DEFAULT 'unverified',
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `m_user` */

insert into `m_user` (`sno`,`author_no`,`u_name`,`u_pass`,`f_name`,`m_name`,`dob`,`gender`,`hosue_no`,`village`,`district`,`state`,`pin`,`phone`,`email`,`u_image`,`u_fingerprint`,`encrypted_features`,`previous_shatg`,`shatag`,`timestamps`,`nonce`,`blkid`,`status`) values (1,'123456789123','jack','5510','bhimaji','rekha','01-02-1996','male','101','dwd','dwd','karnataka','580008','9620725674','ashwini@dhsinfomatics.com','2.jpeg','1.jpg','29~86','','0c0e5ada32d31a8eb6bc27e44f0af76c066394d615998f6cd64919f433ae2325','17-02-2020  03:53:30',216,'B1001.zip','verified'),(2,'1111','aaa','3862','mercy','precy','01-02-1995','female','101','dwd','dwd','karnataka','580008','9620725674','ashwini@dhsinfomatics.com','2.jpeg','4.jpg','3~39','0c0e5ada32d31a8eb6bc27e44f0af76c066394d615998f6cd64919f433ae2325','4e938e245d696ee34f5a7073d41b37dab9b51c2d68e436d64e72edf2d4884210','17-02-2020  03:55:17',788,'B2.zip','unverified'),(3,'1234','ddd','2316','aaa','ccc','26-04-2023','male','243','jpnagar','blr','KA','560011','9546798765','mystoreindia123@gmail.com','admin_dhs_dhs.png','guru_dhs_dhs.jpg','29~86','4e938e245d696ee34f5a7073d41b37dab9b51c2d68e436d64e72edf2d4884210','9e3e3e439116d41e76ae659961fea85ddccbd01c4a631b758f90c492dea78217','17-04-2023  13:16:25',669,'B3.zip','unverified'),(4,'1555565231485','sss','7812','fff','hhh','17-04-2023','male','89','jpnagar','bangalore','karnataka','560011','9876545677','mystoreindia123@gmail.com','dhs_dhs.png','dhs_dhs.jpg','29~86','9e3e3e439116d41e76ae659961fea85ddccbd01c4a631b758f90c492dea78217','4bc7aba4a674b7af73f3c523d2d23aadeeb717bb9a5654dfb9da755654421b6d','17-04-2023  13:23:23',671,'B4.zip','verified');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
