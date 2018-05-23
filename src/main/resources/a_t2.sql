/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.16
Source Server Version : 50628
Source Host           : 192.168.1.16:3306
Source Database       : a_t2

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-05-11 15:37:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for a_test2
-- ----------------------------
DROP TABLE IF EXISTS `a_test2`;
CREATE TABLE `a_test2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
