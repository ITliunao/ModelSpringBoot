/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : mytestdb

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2019-01-11 15:44:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_user`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT '' COMMENT '名称',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(11) CHARACTER SET utf8 DEFAULT 'sasas' COMMENT '电话号码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1324 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', '343', '322', '1');
INSERT INTO `tbl_user` VALUES ('2', '21', '212', '0');
INSERT INTO `tbl_user` VALUES ('1212', '1', '1', '0');
INSERT INTO `tbl_user` VALUES ('1323', '3', '3', '0');

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
INSERT INTO `tbl_user_phone` VALUES ('1', '1', '1', '2019-01-14 15:05:48');

-- ----------------------------
-- Procedure structure for `dadsa`
-- ----------------------------
DROP PROCEDURE IF EXISTS `dadsa`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `dadsa`()
UPDATE tbl_user a INNER JOIN
		(
			SELECT 
			u.id,
			up.phone
			from tbl_user u,tbl_user_phone up 
			WHERE u.id=up.uid 
		) AS c 
		SET a.phone=c.phone AND a.id=c.id
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `sp_sum`
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp_sum`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sum`(IN `a` integer,IN `b` integer,out`c` integer)
BEGIN
	set c =a +b;

END
;;
DELIMITER ;

-- ----------------------------
-- Event structure for `myjob`
-- ----------------------------
DROP EVENT IF EXISTS `myjob`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `myjob` ON SCHEDULE EVERY 1 SECOND STARTS '2019-01-11 15:02:00' ON COMPLETION NOT PRESERVE ENABLE DO CALL dadsa
;;
DELIMITER ;
