/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : mytestdb

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-01-11 14:44:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_user_phone`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user_phone`;
CREATE TABLE `tbl_user_phone` (
  `uid` int(11) NOT NULL COMMENT '用户编号',
  `phone` varchar(11) CHARACTER SET utf8 DEFAULT NULL COMMENT '手机号码',
  `option` tinyint(2) DEFAULT '0' COMMENT '是否默认手机号码：默认0',
  `ctime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_user_phone
-- ----------------------------
