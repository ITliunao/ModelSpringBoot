/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : myscoremanage

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-01-18 16:23:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(40) NOT NULL,
  `gradeid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for `clas_cour_teach`
-- ----------------------------
DROP TABLE IF EXISTS `clas_cour_teach`;
CREATE TABLE `clas_cour_teach` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classid` varchar(30) NOT NULL,
  `gradeid` varchar(30) NOT NULL,
  `courseid` varchar(30) NOT NULL,
  `teacherid` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of clas_cour_teach
-- ----------------------------

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for `exam`
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `time` date NOT NULL,
  `mark` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  `gradeid` varchar(30) NOT NULL,
  `classid` varchar(30) NOT NULL,
  `courseid` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of exam
-- ----------------------------

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grade
-- ----------------------------

-- ----------------------------
-- Table structure for `gra_cour`
-- ----------------------------
DROP TABLE IF EXISTS `gra_cour`;
CREATE TABLE `gra_cour` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeid` varchar(30) NOT NULL,
  `courseid` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of gra_cour
-- ----------------------------

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examid` varchar(30) NOT NULL,
  `classid` varchar(30) NOT NULL,
  `stuid` varchar(30) NOT NULL,
  `gradeid` varchar(30) NOT NULL,
  `courseid` varchar(30) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for `stu`
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `name` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `psw` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `sex` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `phone` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `qq` varchar(1000) COLLATE utf8mb4_bin NOT NULL,
  `classid` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `gradeid` varchar(30) COLLATE utf8mb4_bin NOT NULL,
  `photo` varchar(1000) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `num` (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('94', '21', '2121', '212', '121', '21', '121', '2121', '212', '1547793108414_my1.png');
INSERT INTO `stu` VALUES ('95', '110', '刘闹', '123', '男', '1', '1', '1', '1', '1547793246219_my1.png');

-- ----------------------------
-- Table structure for `sys`
-- ----------------------------
DROP TABLE IF EXISTS `sys`;
CREATE TABLE `sys` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `schname` varchar(50) NOT NULL,
  `fbteacher` int(11) NOT NULL,
  `fbstudent` varchar(255) NOT NULL,
  `noticeteacher` varchar(100) NOT NULL,
  `noticestudent` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of sys
-- ----------------------------

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `psw` varchar(30) DEFAULT NULL,
  `sex` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `qq` varchar(20) NOT NULL,
  `photo` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `num` (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('6', '111', '111', '111', '111', '1', '1', '1547625146021_my1.png');
INSERT INTO `teacher` VALUES ('7', '444', '4', '4', '4', '4', '4', '1547635509398_my2.png');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(100) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `psw` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '1', '1');
