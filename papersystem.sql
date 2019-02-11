/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : papersystem

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-02-10 17:31:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `name` varchar(40) DEFAULT NULL,
  `psw` varchar(40) DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('001', 'admin', 'admin', null);

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` varchar(20) NOT NULL DEFAULT '0',
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('001', '一班');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `cname` varchar(50) DEFAULT NULL,
  `tno` varchar(20) DEFAULT NULL,
  `gradeno` varchar(20) DEFAULT NULL,
  `classno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('001', '数学', '001', '001', '001');
INSERT INTO `course` VALUES ('002', '语文', '002', '001', '001');

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` varchar(20) NOT NULL DEFAULT '0',
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('001', '1501级');

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `sno` varchar(20) DEFAULT NULL,
  `cno` varchar(20) DEFAULT NULL,
  `scores` double(20,1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('001', '001', '001', '93.5');
INSERT INTO `score` VALUES ('002', '001', '002', '94.0');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `psw` varchar(40) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `classid` varchar(40) DEFAULT NULL,
  `gradeid` varchar(40) DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('001', 'bob', '123', '男', null, null, '001', '001', null);

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` varchar(20) NOT NULL DEFAULT '',
  `name` varchar(50) DEFAULT NULL,
  `psw` varchar(30) DEFAULT NULL,
  `gradeno` varchar(20) DEFAULT NULL,
  `classno` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `qq` varchar(30) DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('001', '李老师', '123', '001', '001', '女', null, null, null);
INSERT INTO `teacher` VALUES ('002', '王老师', '123', '001', '001', '男', null, null, null);
