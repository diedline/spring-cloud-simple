/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : back

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/06/2019 12:33:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account_inf
-- ----------------------------
DROP TABLE IF EXISTS `account_inf`;
CREATE TABLE `account_inf`  (
  `id` int(11) NOT NULL,
  `headimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `weixingAccount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zhifubaoAccount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zhifubaoname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` int(11) NULL DEFAULT NULL,
  `Superior` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `level` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_inf
-- ----------------------------
INSERT INTO `account_inf` VALUES (1, 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2735633715,2749454924&fm=27&gp=0.jpg', '张三', '12345', '123', 123, '01,', 1);
INSERT INTO `account_inf` VALUES (2, 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4109715124,101168126&fm=27&gp=0.jpg', '大熊', '12345', '123444', 3333, '02,', 1);
INSERT INTO `account_inf` VALUES (3, 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=873265023,1618187578&fm=27&gp=0.jpg', '米奇', '1312314', '123', 123, '03,', 1);
INSERT INTO `account_inf` VALUES (4, 'a.jpg', 'aaa', '12345', '123', 123, '01,01,01', 3);
INSERT INTO `account_inf` VALUES (5, 'a.jpg', 'bbb', '12345', '123444', 3333, '01,01,02', 3);
INSERT INTO `account_inf` VALUES (6, 'a.jpg', 'ccc', '1312314', '123', 123, '01,03,', 2);
INSERT INTO `account_inf` VALUES (7, 'a.jpg', 'ddd', '120347', '949573', 1394357, '01,04', 2);
INSERT INTO `account_inf` VALUES (8, 'a.jpg', 'eee', '2567', '934673', 1325457, '02,01,', 2);
INSERT INTO `account_inf` VALUES (9, 'a.jpg', 'fff', '125467', '35773', 23553, '02,02,', 2);
INSERT INTO `account_inf` VALUES (10, 'a.jpg', 'ggg', '2546', '5767', 235354, '02,03,', 2);
INSERT INTO `account_inf` VALUES (11, 'a.jpg', 'hhh', '346547', '3469573', 34663, '03,01,', 2);
INSERT INTO `account_inf` VALUES (12, 'a.jpg', 'iii', '15546', '949573', 346346, '03,02,', 2);
INSERT INTO `account_inf` VALUES (13, 'a.jpg', 'jjj', '24657', '8565', 363463, '03,03,', 2);

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_pwd` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES (28, 'admin', '123');
INSERT INTO `administrator` VALUES (29, '123123', '123');
INSERT INTO `administrator` VALUES (31, '1234', '123');
INSERT INTO `administrator` VALUES (32, '1234', '123');
INSERT INTO `administrator` VALUES (33, '1234', '123');
INSERT INTO `administrator` VALUES (34, '1234444123', '123');
INSERT INTO `administrator` VALUES (35, 'xxxx', '123');
INSERT INTO `administrator` VALUES (36, 'xxxxxxxxxx', '123');
INSERT INTO `administrator` VALUES (37, 'ppppppppppp', '123');
INSERT INTO `administrator` VALUES (38, '1234', '123');
INSERT INTO `administrator` VALUES (39, '1234', '123');
INSERT INTO `administrator` VALUES (40, '1234', '123');
INSERT INTO `administrator` VALUES (41, '1234444123', '123');
INSERT INTO `administrator` VALUES (42, '1234', '123');
INSERT INTO `administrator` VALUES (43, '1123', '123');

-- ----------------------------
-- Table structure for commodity_types
-- ----------------------------
DROP TABLE IF EXISTS `commodity_types`;
CREATE TABLE `commodity_types`  (
  `commodit_id` int(11) NOT NULL,
  `Trade_name` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `type` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`commodit_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity_types
-- ----------------------------
INSERT INTO `commodity_types` VALUES (1, '苹果', '手机');
INSERT INTO `commodity_types` VALUES (2, '栗子', '水果');
INSERT INTO `commodity_types` VALUES (11, 'njgctl', 'shrnnb');
INSERT INTO `commodity_types` VALUES (12, 'smfqmp', 'ozesze');
INSERT INTO `commodity_types` VALUES (13, 'annanp', 'mncbyo');
INSERT INTO `commodity_types` VALUES (14, 'yzbmce', 'msbqza');
INSERT INTO `commodity_types` VALUES (15, 'cjqcps', 'smhahg');
INSERT INTO `commodity_types` VALUES (16, 'llzlii', 'rkawfl');
INSERT INTO `commodity_types` VALUES (17, 'onzirl', 'djkzrl');
INSERT INTO `commodity_types` VALUES (18, 'gwoegt', 'avcsiv');
INSERT INTO `commodity_types` VALUES (19, 'gtatto', 'nsybks');
INSERT INTO `commodity_types` VALUES (20, 'fjhhqg', 'ivfphq');
INSERT INTO `commodity_types` VALUES (21, 'isqbjp', 'zcmekn');
INSERT INTO `commodity_types` VALUES (22, 'lonwwr', 'tsiotb');
INSERT INTO `commodity_types` VALUES (23, 'bdmcsg', 'ocuryt');
INSERT INTO `commodity_types` VALUES (24, 'sfhyvh', 'yvhagf');
INSERT INTO `commodity_types` VALUES (25, 'hvenzj', 'weidsf');
INSERT INTO `commodity_types` VALUES (26, 'wswhue', 'jkwcse');
INSERT INTO `commodity_types` VALUES (27, 'dfrqhm', 'ncasor');
INSERT INTO `commodity_types` VALUES (28, 'paipzc', 'pqlhcp');
INSERT INTO `commodity_types` VALUES (29, 'qmmsbr', 'evojfy');
INSERT INTO `commodity_types` VALUES (30, 'cpswbs', 'menzlh');
INSERT INTO `commodity_types` VALUES (31, 'bjsmgw', 'nygiyq');
INSERT INTO `commodity_types` VALUES (32, 'lihlhd', 'wwuihm');
INSERT INTO `commodity_types` VALUES (33, 'lsbrfb', 'qbjpyy');
INSERT INTO `commodity_types` VALUES (34, 'sphspw', 'naouhz');
INSERT INTO `commodity_types` VALUES (35, 'bkvvtf', 'uhcqyu');
INSERT INTO `commodity_types` VALUES (36, 'didrad', 'olojes');
INSERT INTO `commodity_types` VALUES (37, 'dpmpqi', 'tvwthd');
INSERT INTO `commodity_types` VALUES (38, 'vtgzcq', 'wmraad');
INSERT INTO `commodity_types` VALUES (39, 'oiabhg', 'lktnkl');
INSERT INTO `commodity_types` VALUES (40, 'ykhcqy', 'strcjr');
INSERT INTO `commodity_types` VALUES (41, 'famige', 'fpfizz');
INSERT INTO `commodity_types` VALUES (42, 'zvidsd', 'nehzbj');
INSERT INTO `commodity_types` VALUES (43, 'rfcsdb', 'utkvwy');
INSERT INTO `commodity_types` VALUES (44, 'ahlgaj', 'rjtrdp');
INSERT INTO `commodity_types` VALUES (45, 'phosvl', 'shhqir');
INSERT INTO `commodity_types` VALUES (46, 'jvcsfl', 'nfpgob');
INSERT INTO `commodity_types` VALUES (47, 'pvjged', 'gswczo');
INSERT INTO `commodity_types` VALUES (48, 'yyvkps', 'trckwz');
INSERT INTO `commodity_types` VALUES (49, 'iqhntf', 'uihnpm');
INSERT INTO `commodity_types` VALUES (50, 'rystqy', 'ssmems');
INSERT INTO `commodity_types` VALUES (51, 'alcgwo', 'fjfydv');
INSERT INTO `commodity_types` VALUES (52, 'rzvgrr', 'jsoqli');
INSERT INTO `commodity_types` VALUES (53, 'hnqtto', 'ocvulv');
INSERT INTO `commodity_types` VALUES (54, 'wwtdii', 'snklzo');
INSERT INTO `commodity_types` VALUES (55, 'zcqvgs', 'vbuvqv');
INSERT INTO `commodity_types` VALUES (56, 'dguems', 'dapwpj');
INSERT INTO `commodity_types` VALUES (57, 'bgbnmt', 'ksipyw');
INSERT INTO `commodity_types` VALUES (58, 'mupqhn', 'thdtku');
INSERT INTO `commodity_types` VALUES (59, 'qvhsss', 'godyiv');
INSERT INTO `commodity_types` VALUES (60, 'bvbrgh', 'rkchdv');
INSERT INTO `commodity_types` VALUES (61, 'qsslby', 'mojfss');
INSERT INTO `commodity_types` VALUES (62, 'wqpcpr', 'rkwegv');
INSERT INTO `commodity_types` VALUES (63, 'hyysof', 'hwknhw');
INSERT INTO `commodity_types` VALUES (64, 'nbrfzi', 'spvhsu');
INSERT INTO `commodity_types` VALUES (65, 'elrdqt', 'yiyqit');
INSERT INTO `commodity_types` VALUES (66, 'vwsvnc', 'ylksjp');
INSERT INTO `commodity_types` VALUES (67, 'sugwqn', 'tenegu');
INSERT INTO `commodity_types` VALUES (68, 'eluqrp', 'vlsetf');
INSERT INTO `commodity_types` VALUES (69, 'wsslly', 'keqqiq');
INSERT INTO `commodity_types` VALUES (70, 'fdbwgp', 'ffnyea');
INSERT INTO `commodity_types` VALUES (71, 'pwognv', 'oizzzw');
INSERT INTO `commodity_types` VALUES (72, 'jfamkm', 'djipyz');
INSERT INTO `commodity_types` VALUES (73, 'adrsoa', 'mkmemv');
INSERT INTO `commodity_types` VALUES (74, 'qucawf', 'lqucem');
INSERT INTO `commodity_types` VALUES (75, 'sdsffm', 'tileoh');
INSERT INTO `commodity_types` VALUES (76, 'vfqnqq', 'hnszub');
INSERT INTO `commodity_types` VALUES (77, 'wdccdk', 'ptskgc');
INSERT INTO `commodity_types` VALUES (78, 'sfajsp', 'svcwbs');
INSERT INTO `commodity_types` VALUES (79, 'jslcen', 'burdni');
INSERT INTO `commodity_types` VALUES (80, 'zaesaz', 'wiaevo');
INSERT INTO `commodity_types` VALUES (81, 'kfsyza', 'falena');
INSERT INTO `commodity_types` VALUES (82, 'npmneh', 'spjabg');
INSERT INTO `commodity_types` VALUES (83, 'akshua', 'vbvzjw');
INSERT INTO `commodity_types` VALUES (84, 'hwmtil', 'dighqh');
INSERT INTO `commodity_types` VALUES (85, 'nujmif', 'aorqhk');
INSERT INTO `commodity_types` VALUES (86, 'fswphu', 'bshvej');
INSERT INTO `commodity_types` VALUES (87, 'kvygjb', 'hecyjz');
INSERT INTO `commodity_types` VALUES (88, 'vdhyvj', 'jrhjzu');
INSERT INTO `commodity_types` VALUES (89, 'yljopi', 'vcdigi');
INSERT INTO `commodity_types` VALUES (90, 'ubwgnz', 'gjzysr');
INSERT INTO `commodity_types` VALUES (91, 'giubwf', 'lolpob');
INSERT INTO `commodity_types` VALUES (92, 'qadrwj', 'fzfcuu');
INSERT INTO `commodity_types` VALUES (93, 'poybla', 'wdelqv');
INSERT INTO `commodity_types` VALUES (94, 'foegrs', 'nknidr');
INSERT INTO `commodity_types` VALUES (95, 'ytsgms', 'chghua');
INSERT INTO `commodity_types` VALUES (96, 'uvthgk', 'fvpjdq');
INSERT INTO `commodity_types` VALUES (97, 'rmiezh', 'pcsfsw');
INSERT INTO `commodity_types` VALUES (98, 'plmyjy', 'oakbyq');
INSERT INTO `commodity_types` VALUES (99, 'gjbgct', 'mdeofk');
INSERT INTO `commodity_types` VALUES (100, 'kwbqcp', 'qitvun');
INSERT INTO `commodity_types` VALUES (101, 'eibktp', 'tsiyqk');
INSERT INTO `commodity_types` VALUES (102, 'eqpcqy', 'tzsmjj');
INSERT INTO `commodity_types` VALUES (103, 'uurwkk', 'vwwrtt');
INSERT INTO `commodity_types` VALUES (104, 'omtiju', 'wyfflo');
INSERT INTO `commodity_types` VALUES (105, 'kjpvlr', 'cmbwgn');
INSERT INTO `commodity_types` VALUES (106, 'sahkfu', 'iiouhb');
INSERT INTO `commodity_types` VALUES (107, 'niconw', 'tgyywl');
INSERT INTO `commodity_types` VALUES (108, 'rdngsv', 'yhoyzc');
INSERT INTO `commodity_types` VALUES (109, 'niaeti', 'itrdrs');
INSERT INTO `commodity_types` VALUES (110, 'phowuh', 'dtikcf');

-- ----------------------------
-- Table structure for django_content_type
-- ----------------------------
DROP TABLE IF EXISTS `django_content_type`;
CREATE TABLE `django_content_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `model` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `django_content_type_app_label_model_76bd3d3b_uniq`(`app_label`, `model`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of django_content_type
-- ----------------------------
INSERT INTO `django_content_type` VALUES (1, 'admin', 'logentry');
INSERT INTO `django_content_type` VALUES (8, 'app01', 'account_inf');
INSERT INTO `django_content_type` VALUES (7, 'app01', 'administrator');
INSERT INTO `django_content_type` VALUES (10, 'app01', 'commodity_types');
INSERT INTO `django_content_type` VALUES (9, 'app01', 'order_details');
INSERT INTO `django_content_type` VALUES (11, 'app01', 'statistics');
INSERT INTO `django_content_type` VALUES (3, 'auth', 'group');
INSERT INTO `django_content_type` VALUES (2, 'auth', 'permission');
INSERT INTO `django_content_type` VALUES (4, 'auth', 'user');
INSERT INTO `django_content_type` VALUES (5, 'contenttypes', 'contenttype');
INSERT INTO `django_content_type` VALUES (6, 'sessions', 'session');

-- ----------------------------
-- Table structure for order_details
-- ----------------------------
DROP TABLE IF EXISTS `order_details`;
CREATE TABLE `order_details`  (
  `order_number` int(11) NOT NULL,
  `commodit_id` int(11) NULL DEFAULT NULL,
  `number` int(11) NULL DEFAULT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`order_number`) USING BTREE,
  INDEX `commodit_id`(`commodit_id`) USING BTREE,
  INDEX `id`(`id`) USING BTREE,
  CONSTRAINT `order_details_ibfk_1` FOREIGN KEY (`commodit_id`) REFERENCES `commodity_types` (`commodit_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_details_ibfk_2` FOREIGN KEY (`id`) REFERENCES `account_inf` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_details
-- ----------------------------
INSERT INTO `order_details` VALUES (1, 1, 1, 1);
INSERT INTO `order_details` VALUES (2, 2, 99, 2);
INSERT INTO `order_details` VALUES (3, 2, 1, 3);
INSERT INTO `order_details` VALUES (4, 11, 1, 2);
INSERT INTO `order_details` VALUES (5, 12, 1, 4);
INSERT INTO `order_details` VALUES (6, 12, 1, 4);

-- ----------------------------
-- Table structure for t_statistics
-- ----------------------------
DROP TABLE IF EXISTS `t_statistics`;
CREATE TABLE `t_statistics`  (
  `id` int(10) NOT NULL,
  `one` int(10) NULL DEFAULT NULL,
  `two` int(10) NULL DEFAULT NULL,
  `three` int(10) NULL DEFAULT NULL,
  `one_order` int(10) NULL DEFAULT NULL,
  `two_order` int(10) NULL DEFAULT NULL,
  `three_order` int(10) NULL DEFAULT NULL,
  `a_id` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_statistics
-- ----------------------------
INSERT INTO `t_statistics` VALUES (1, 10, 15, 30, 100, 890, 2233, 1);
INSERT INTO `t_statistics` VALUES (2, 100, 10000, 10000, 120, 222222, 22222, 2);
INSERT INTO `t_statistics` VALUES (3, 50, 100, 300, 100, 200, 300, 3);

-- ----------------------------
-- View structure for view_account
-- ----------------------------
DROP VIEW IF EXISTS `view_account`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_account` AS select `app01_account_inf`.`id` AS `用户名`,`app01_account_inf`.`headimg` AS `头像地址`,`app01_account_inf`.`weixingAccount` AS `微信账号`,`app01_account_inf`.`zhifubaoAccount` AS `支付宝账号`,`app01_account_inf`.`zhifubaoname` AS `支付宝实名`,`app01_account_inf`.`tel` AS `联系电话`,`app01_account_inf`.`Superior` AS `推广id` from `app01_account_inf`;

-- ----------------------------
-- View structure for view_count
-- ----------------------------
DROP VIEW IF EXISTS `view_count`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_count` AS select `statistics`.`id` AS `用户名`,`statistics`.`one` AS `一级人数`,`statistics`.`two` AS `二级人数`,`statistics`.`three` AS `三级人数`,`statistics`.`one_order` AS `一级订单号`,`statistics`.`two_order` AS `二级订单号`,`statistics`.`three_order` AS `三级订单号`,`statistics`.`a_id` AS `等级` from `statistics`;

-- ----------------------------
-- View structure for view_goods
-- ----------------------------
DROP VIEW IF EXISTS `view_goods`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_goods` AS select `commodity_types`.`commodit_id` AS `商品id`,`commodity_types`.`Trade_name` AS `商品名字`,`commodity_types`.`type` AS `类型` from `commodity_types`;

-- ----------------------------
-- View structure for view_order
-- ----------------------------
DROP VIEW IF EXISTS `view_order`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_order` AS select `a`.`order_number` AS `订单号`,`b`.`Trade_name` AS `商品名字`,`a`.`number` AS `数量`,`a`.`id` AS `用户id` from (`order_details` `a` join `commodity_types` `b` on((`a`.`commodit_id` = `b`.`commodit_id`)));

-- ----------------------------
-- View structure for view_order_detail
-- ----------------------------
DROP VIEW IF EXISTS `view_order_detail`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_order_detail` AS select `c`.`id` AS `用户id`,`c`.`weixingAccount` AS `微信名字`,`a`.`order_number` AS `订单号`,`b`.`Trade_name` AS `商品名字`,`a`.`number` AS `数量` from ((`order_details` `a` join `commodity_types` `b`) join `account_inf` `c` on(((`a`.`commodit_id` = `b`.`commodit_id`) and (`a`.`id` = `c`.`id`))));

-- ----------------------------
-- Procedure structure for insert_goods
-- ----------------------------
DROP PROCEDURE IF EXISTS `insert_goods`;
delimiter ;;
CREATE PROCEDURE `insert_goods`(IN start_no INT(10),IN max_num INT(10))
BEGIN
DECLARE i INT DEFAULT 0;
SET autocommit=0;
REPEAT
SET i=i+1;
INSERT INTO app01_commodity_types VALUES((start_no+i),rand_string(6),rand_string(6));
UNTIL i=max_num
END REPEAT;
COMMIT;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for proc_order
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc_order`;
delimiter ;;
CREATE PROCEDURE `proc_order`()
BEGIN
DECLARE done INT DEFAULT 0;
DECLARE b INT;
DECLARE a INT;
DECLARE cur_user CURSOR FOR SELECT id FROM `app01_account_inf`;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done=1;
OPEN cur_user;
FETCH cur_user INTO b;
WHILE done=0 DO
SELECT COUNT(*) INTO a FROM app01_order_details WHERE id=b;
INSERT INTO statistics(id,num) VALUES(b,a);
FETCH cur_user INTO b;
END WHILE;
CLOSE cur_user;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
