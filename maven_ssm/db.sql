
/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-09-14 15:22:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '梁世杰', '123');
INSERT INTO `member` VALUES ('2', '刘德华', '456');

/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-09-14 15:22:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'zhangsan', '男', '21');
INSERT INTO `user` VALUES ('3', 'zhangsan', '男', '21');
INSERT INTO `user` VALUES ('5', 'zhangsan3', '男', '23');
INSERT INTO `user` VALUES ('6', 'zhangsan4', '男', '24');
INSERT INTO `user` VALUES ('7', 'zhangsan5', '男', '25');
INSERT INTO `user` VALUES ('8', 'zhangsan6', '男', '26');
INSERT INTO `user` VALUES ('9', 'lihai', '男', '33');
INSERT INTO `user` VALUES ('10', 'lihai2', '男', '33');
INSERT INTO `user` VALUES ('11', 'lihai3', '男', '35');
