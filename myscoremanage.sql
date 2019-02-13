/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : myscoremanage

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-02-13 21:00:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `classname` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '001', '一班');
INSERT INTO `class` VALUES ('2', '002', '二班');

-- ----------------------------
-- Table structure for `clas_cour_teach`
-- ----------------------------
DROP TABLE IF EXISTS `clas_cour_teach`;
CREATE TABLE `clas_cour_teach` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `gradeid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `courseid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `teacherid` varchar(30) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of clas_cour_teach
-- ----------------------------
INSERT INTO `clas_cour_teach` VALUES ('1', '001', '001', '00a', '001');
INSERT INTO `clas_cour_teach` VALUES ('2', '001', '001', '00b', '001');
INSERT INTO `clas_cour_teach` VALUES ('3', '001', '002', '00c', '002');
INSERT INTO `clas_cour_teach` VALUES ('4', '001', '001', '00c', '001');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `coursename` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '00a', '语文');
INSERT INTO `course` VALUES ('2', '00b', '数学');
INSERT INTO `course` VALUES ('3', '00c', '英语');

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gradeid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `gradename` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '001', '1501级');
INSERT INTO `grade` VALUES ('2', '002', '1401级');

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scoreid` varchar(30) CHARACTER SET utf8 NOT NULL,
  `scores` float(11,1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('1', 'aaa0001', '97.5');
INSERT INTO `score` VALUES ('2', 'aaa0002', '96.0');
INSERT INTO `score` VALUES ('3', 'aaa0003', '93.0');
INSERT INTO `score` VALUES ('4', 'baa0001', '91.0');
INSERT INTO `score` VALUES ('5', 'baa0002', '87.0');
INSERT INTO `score` VALUES ('6', 'caa0003', '77.0');
INSERT INTO `score` VALUES ('7', 'cba0004', '88.0');

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
  `photo` varchar(1000) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `num` (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('10', 'aa02', '1212', '121', '121', '212', '12', '001', '001', null);
INSERT INTO `stu` VALUES ('11', 'aa01', '小李', '', '', '', '', '001', '001', null);
INSERT INTO `stu` VALUES ('12', 'aa03', 'sasas', 'asa', 'sas', 'asas', 'asa', '001', '001', '1550038030471_my2.png');
INSERT INTO `stu` VALUES ('13', 'ba04', '刘闹', '111', '111', '111', '111', '001', '002', null);

-- ----------------------------
-- Table structure for `stu_cour_sco`
-- ----------------------------
DROP TABLE IF EXISTS `stu_cour_sco`;
CREATE TABLE `stu_cour_sco` (
  `id` varchar(30) NOT NULL,
  `scoreid` varchar(30) NOT NULL,
  `stuid` varchar(30) NOT NULL,
  `courseid` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of stu_cour_sco
-- ----------------------------
INSERT INTO `stu_cour_sco` VALUES ('1', 'aaa0001', 'aa01', '00a');
INSERT INTO `stu_cour_sco` VALUES ('2', 'aaa0002', 'aa02', '00a');
INSERT INTO `stu_cour_sco` VALUES ('3', 'aaa0003', 'aa03', '00a');
INSERT INTO `stu_cour_sco` VALUES ('4', 'baa0001', 'aa01', '00b');
INSERT INTO `stu_cour_sco` VALUES ('5', 'baa0002', 'aa02', '00b');
INSERT INTO `stu_cour_sco` VALUES ('6', 'caa0003', 'aa03', '00c');
INSERT INTO `stu_cour_sco` VALUES ('7', 'cba0004', 'ba04', '00c');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('6', '002', 'lucky', '111', '111', '1', '1', '1547625146021_my1.png');
INSERT INTO `teacher` VALUES ('7', '444', '4', '4', '4', '4', '4', '1547635509398_my2.png');
INSERT INTO `teacher` VALUES ('8', '001', 'cathy', '11', '11', '1', '1', '1');

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
