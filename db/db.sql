-- --------------------------------------------------------
-- 主机:                           localhost
-- 服务器版本:                        5.6.12 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 eshopdemo 的数据库结构
CREATE DATABASE IF NOT EXISTS `eshopdemo` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `eshopdemo`;


-- 导出  表 eshopdemo.catalog 结构
CREATE TABLE IF NOT EXISTS `catalog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.catalog 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `catalog` DISABLE KEYS */;
INSERT INTO `catalog` (`id`, `name`) VALUES
	(1, 'car');
/*!40000 ALTER TABLE `catalog` ENABLE KEYS */;


-- 导出  表 eshopdemo.customer_comment 结构
CREATE TABLE IF NOT EXISTS `customer_comment` (
  `pro_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `rate` int(10) DEFAULT NULL,
  `comment` varchar(9999) DEFAULT NULL,
  KEY `FK_customer_comment_product_detail` (`pro_id`),
  KEY `FK_customer_comment_userinfo` (`user_id`),
  CONSTRAINT `FK_customer_comment_userinfo` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`),
  CONSTRAINT `FK_customer_comment_product_detail` FOREIGN KEY (`pro_id`) REFERENCES `product_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.customer_comment 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `customer_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_comment` ENABLE KEYS */;


-- 导出  表 eshopdemo.offer 结构
CREATE TABLE IF NOT EXISTS `offer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.offer 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `offer` ENABLE KEYS */;


-- 导出  表 eshopdemo.order 结构
CREATE TABLE IF NOT EXISTS `order` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `payway` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_order_userinfo` (`user_id`),
  CONSTRAINT `FK_order_userinfo` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.order 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;


-- 导出  表 eshopdemo.order_items 结构
CREATE TABLE IF NOT EXISTS `order_items` (
  `order_id` int(10) DEFAULT NULL,
  `product_id` int(10) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `quality` int(10) DEFAULT '1',
  KEY `FK_order_items_order` (`order_id`),
  KEY `FK_order_items_productinfo` (`product_id`),
  CONSTRAINT `FK_order_items_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`),
  CONSTRAINT `FK_order_items_productinfo` FOREIGN KEY (`product_id`) REFERENCES `product_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.order_items 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;


-- 导出  表 eshopdemo.payways 结构
CREATE TABLE IF NOT EXISTS `payways` (
  `way` varchar(50) NOT NULL,
  PRIMARY KEY (`way`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.payways 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `payways` DISABLE KEYS */;
INSERT INTO `payways` (`way`) VALUES
	('cash on delivery'),
	('with credit card'),
	('with credits');
/*!40000 ALTER TABLE `payways` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_catalog 结构
CREATE TABLE IF NOT EXISTS `product_catalog` (
  `product_id` int(10) DEFAULT NULL,
  `catalog_id` int(10) DEFAULT NULL,
  KEY `FK__productinfo` (`product_id`),
  KEY `FK__catalog` (`catalog_id`),
  CONSTRAINT `FK__catalog` FOREIGN KEY (`catalog_id`) REFERENCES `catalog` (`id`),
  CONSTRAINT `FK__productinfo` FOREIGN KEY (`product_id`) REFERENCES `product_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.product_catalog 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `product_catalog` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_catalog` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_detail 结构
CREATE TABLE IF NOT EXISTS `product_detail` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `price` float unsigned NOT NULL DEFAULT '0',
  `quantity` int(255) unsigned DEFAULT '20',
  `description` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.product_detail 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` (`id`, `title`, `price`, `quantity`, `description`) VALUES
	(1, 'Nissan Tiida 18G H/Back 2005', 4000, 9999, '# No cambelt - Chain driven \r\n# 4 Cylinder DOHC 16V EFI engine \r\n# CVT transmission - Save fuel \r\n# Navigation/GPS \r\n# Reversing camera \r\n# Power windows \r\n# Power mirrors \r\n# Anti lock brakes \r\n# Adjustable steering \r\n# Electric seats \r\n# Electric seat lifter \r\n# Tinted glass \r\n# Rear wiper \r\n# Overdrive and sport setting \r\n# B-platform wide wheelbase \r\n# Half leather half trim \r\n# HID headlights \r\n# Split fold rear seat \r\n# 4 Near brand new tyres \r\n\r\nBUY WITH CONFIDENCE \r\n\r\nSuperb clean condition inside and out. \r\nDrives smooth and very well no mechanical issues. \r\n\r\nThis is a fresh import inspected and complied by VINZ. \r\nOdometer is certified by AA. \r\n\r\nThis vehicle has an annual fuel cost of $1900 and a fuel economy rating of 4.5 out of 6. Fuel saver. \r\n\r\nIf you wish to inspect this vehicle it has to be done prior the auction finishes, payment must be made within 3 days of the close of the auction, happy bidding.'),
	(2, 'Nissan Tiida Latio LOW KM 2006', 7299, 9999, '* 2004 Nissan Tiida Latio 1.5L * \r\n\r\nTHIS IS YEAR 2004 NOT 2006 \r\nTHIS IS YEAR 2004 NOT 2006 \r\nTHIS IS YEAR 2004 NOT 2006 \r\n\r\nGeneral: \r\n-Genuine LOW 70,000km\'s \r\n-Japan Odometer Certified \r\n-NZ AA Odometer Certified \r\n-PASSED Japan Radiation Check \r\n-Import Grade 4 out of 5 \r\n-Fresh Import Car : No NZ owner \r\n-New VINZ WOF \r\n-NOT a Water Damage Car \r\n-NOT a Damage Vehicle \r\n-NO Money Owing on the car \r\n-Excellent Condition In and Out \r\n-30 Days Mechanical Warranty \r\n-Camchain Drive, Don\'t need to change \r\n- $300.00 on road cost apply (Include a new number plate and 6 months registration) \r\n\r\nFeatures: \r\n-Dual Air bags \r\n-ABS brakes \r\n-Air conditioning \r\n-Central locking \r\n-Electric windows \r\n-Power steering \r\n\r\nAll inspection is welcome at your own cost \r\n\r\nTest drive is welcome by appointment only \r\n\r\nPlease contact 021 198 9913 to arrange a time. \r\n\r\n@ Viewing times @ \r\nMonday-Saturday 10am - 5pm \r\nSunday CLOSED \r\n\r\nIf you require transportation for the vehicle. Please click the lin');
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_offer 结构
CREATE TABLE IF NOT EXISTS `product_offer` (
  `pro_id` int(10) DEFAULT NULL,
  `offer_id` int(10) DEFAULT NULL,
  KEY `FK__product_detail` (`pro_id`),
  KEY `FK__offer` (`offer_id`),
  CONSTRAINT `FK__product_detail` FOREIGN KEY (`pro_id`) REFERENCES `product_detail` (`id`),
  CONSTRAINT `FK__offer` FOREIGN KEY (`offer_id`) REFERENCES `offer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.product_offer 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `product_offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_offer` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_property 结构
CREATE TABLE IF NOT EXISTS `product_property` (
  `pro_id` int(10) DEFAULT NULL,
  `key` varchar(50) DEFAULT NULL,
  `value` varchar(500) DEFAULT NULL,
  KEY `FK_product_property_product_detail` (`pro_id`),
  CONSTRAINT `FK_product_property_product_detail` FOREIGN KEY (`pro_id`) REFERENCES `product_detail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.product_property 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `product_property` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_property` ENABLE KEYS */;


-- 导出  表 eshopdemo.userinfo 结构
CREATE TABLE IF NOT EXISTS `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `secondname` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `postcode` varchar(100) NOT NULL,
  `phone` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.userinfo 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
