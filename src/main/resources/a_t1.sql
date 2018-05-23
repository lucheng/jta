/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.16
Source Server Version : 50628
Source Host           : 192.168.1.16:3306
Source Database       : a_t1

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-05-11 15:37:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for a_test1
-- ----------------------------
DROP TABLE IF EXISTS `a_test1`;
CREATE TABLE `a_test1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
