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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.catalog 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `catalog` DISABLE KEYS */;
INSERT INTO `catalog` (`id`, `name`) VALUES
	(1, 'book'),
	(2, 'movie'),
	(3, 'phone');
/*!40000 ALTER TABLE `catalog` ENABLE KEYS */;


-- 导出  表 eshopdemo.customer_comment 结构
CREATE TABLE IF NOT EXISTS `customer_comment` (
  `pro_id` int(10) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `rate` int(10) DEFAULT NULL,
  `comment` varchar(9999) DEFAULT NULL,
  KEY `FK_customer_comment_product_detail` (`pro_id`),
  KEY `FK_customer_comment_userinfo` (`user_id`),
  CONSTRAINT `FK_customer_comment_product_detail` FOREIGN KEY (`pro_id`) REFERENCES `product_detail` (`id`),
  CONSTRAINT `FK_customer_comment_userinfo` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`)
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

-- 正在导出表  eshopdemo.product_catalog 的数据：~15 rows (大约)
/*!40000 ALTER TABLE `product_catalog` DISABLE KEYS */;
INSERT INTO `product_catalog` (`product_id`, `catalog_id`) VALUES
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 2),
	(7, 2),
	(8, 2),
	(9, 2),
	(10, 2),
	(11, 3),
	(12, 3),
	(13, 3),
	(14, 3),
	(15, 3);
/*!40000 ALTER TABLE `product_catalog` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_detail 结构
CREATE TABLE IF NOT EXISTS `product_detail` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `price` float unsigned NOT NULL DEFAULT '0',
  `quantity` int(255) unsigned DEFAULT '20',
  `description` mediumtext,
  `picnum` int(10) DEFAULT '1',
  `rate` int(10) DEFAULT '5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

-- 正在导出表  eshopdemo.product_detail 的数据：~15 rows (大约)
/*!40000 ALTER TABLE `product_detail` DISABLE KEYS */;
INSERT INTO `product_detail` (`id`, `title`, `price`, `quantity`, `description`, `picnum`, `rate`) VALUES
	(1, 'Publication Manual of the American Ps...', 19.86, 9999, 'Publication Date: July 15, 2009 | ISBN-10: 1433805618 | ISBN-13: 978-1433805615 | Edition: 6th\r\nThe "Publication Manual" is the style manual of choice for writers, editors, students, and educators. Although it is specifically designed to help writers in the behavioral sciences and social sciences, anyone who writes non-fiction prose can benefit from its guidance. The newly-revised Sixth Edition has not only been rewritten. It has also been thoroughly rethought and reorganized, making it the most user-friendly "Publication Manual" the APA has ever produced. You will be able to find answers to your questions faster than ever before. When you need advice on how to present information, including text, data, and graphics, for publication in any type of format--such as college and university papers, professional journals, presentations for colleagues, and online publication--you will find the advice you\'re looking for in the "Publication Manual."', 6, 5),
	(2, 'Good Housekeeping (1-year auto-renewal)', 88.22, 9999, 'Publication Date: May 27, 2013 | ISBN-10: 0890425558 | ISBN-13: 978-0890425558 | Edition: 5\r\nThis new edition of the American Psychiatric Association\'s Diagnostic and Statistical Manual of Mental Disorders (DSM-5), used by clinicians and researchers to diagnose and classify mental disorders, is the product of more than 10 years of effort by hundreds of international experts in all aspects of mental health. Their dedication and hard work have yielded an authoritative volume that defines and classifies mental disorders in order to improve diagnoses, treatment, and research. This manual, which creates a common language for clinicians involved in the diagnosis of mental disorders, includes concise and specific criteria intended to facilitate an objective assessment of symptom presentations in a variety of clinical settings inpatient, outpatient, partial hospital, consultation-liaison, clinical, private practice, and primary care. The Diagnostic and Statistical Manual of Mental Disorders, Fifth Edition, is the most comprehensive, current, and critical resource for clinical practice available to today\'s mental health clinicians and researchers of all orientations. The information contained in the manual is also valuable to other physicians and health professionals, including psychologists, counselors, nurses, and occupational and rehabilitation therapists, as well as social workers and forensic and legal specialists. DSM-5 is the most definitive resource for the diagnosis and classification of mental disorders.', 6, 5),
	(3, 'Esquire (1-year auto-renewal)', 13.21, 20, 'You know him from the hit A&E show Duck Dynasty—now you can enjoy Uncle Si’s tall tales, crazy exploits, and quirky one-liners in one raucous collection!', 6, 5),
	(4, 'Popular Mechanics (6-month introducto...', 15.8, 20, 'Never go back—but Jack Reacher does, and the past finally catches up with him. . . . Never Go Back is #1 New York Times bestselling author Lee Child’s new novel of action-charged suspense starring “one of the best thriller characters at work today” (Newsweek).', 6, 5),
	(5, 'King and Maxwell (King & Maxwell) Hardcover', 11.29, 20, 'At the conclusion of The Mark of Athena, Annabeth and Percy tumble into a pit leading straight to the Underworld. The other five demigods have to put aside their grief and follow Percy\'s instructions to find the mortal side of the Doors of Death. If they can fight their way through the Gaea\'s forces, and Percy and Annabeth can survive the House of Hades, then the Seven will be able to seal the Doors both sides and prevent the giants from raising Gaea. But, Leo wonders, if the Doors are sealed, how will Percy and Annabeth be able to escape?', 1, 5),
	(6, 'Breaking Bad: The Complete First Seas...', 34.96, 20, 'No one would confuse the desperate dad Bryan Cranston plays in this character-driven drama with the fun-loving Hal from Malcolm in the Middle. In AMC\'s Breaking Bad, Walter White lives in the suburbs with his wife--and wears tighty-whiteys--but the similarities end there. During the pilot, the cash-strapped chemistry teacher finds out he has inoperable lung cancer. He and Skyler (Deadwood\'s Anna Gunn) have one son, Walter Jr. (R.J. Mitte), and a daughter on the way. With two years to get his affairs in order, Walter comes up with a wild plan: he and former student Jesse (Aaron Paul), a drug dealer, will open a meth lab.', 2, 5),
	(7, 'Quantum of Solace (2008)', 13.19, 20, 'Daniel Craig returns as James Bond in this thrilling, action-packed adventure that picks up where Casino Royale left off. Betrayed by the woman he loved, 007 fights the urge to make his latest mission personal. On a nonstop quest for justice that crisscrosses the globe, Bond meets the beautiful but feisty Camille (Olga Kurylenko), who leads him to Dominic Greene (Mathieu Amalric), a ruthless businessman and major force within the mysterious Quantum organization. When Bond uncovers a conspiracy to take control of one of the world’s most important natural resources, he must navigate a minefield of treachery, deception and murder to neutralize Greene before it’s too late!', 6, 5),
	(8, 'The Walking Dead: The Complete Third ...', 34.96, 20, 'In this uncertain world, Rick Grimes (Andrew Lincoln) and his band of survivors must not only fight the dead, but also face a whole new fear: the living. In this 16 episode season, the series Entertainment Weekly called the “greatest thriller ever produced for television”, Rick and his fellow survivors continue to seek refuge in a desolate and post-apocalyptic world and soon discover that there are greater forces to fear than just the walking dead. The struggle to survive has never been so perilous. This season also introduces new characters, including the Governor (David Morrissey) and fan-favorite Michonne (Danai Gurira), along with her zombie pets.', 2, 5),
	(9, 'The Dark Knight Rises (Blu-ray/DVD Co...', 12.49, 20, 'Of all the "most anticipated" movies ever claiming that title, it\'s hard to imagine one that has caused so much speculation and breathless expectation as Christopher Nolan\'s final chapter to his magnificently brooding Batman trilogy, The Dark Knight Rises. Though it may not rise to the level of the mythic grandeur of its predecessor, The Dark Knight Rises is a truly magnificent work of cinematic brilliance that commandingly completes the cycle and is as heavy with literary resonance as it is of-the-moment insight into the political and social affairs unfolding on the world stage. That it is also a full-blown and fully realized epic crime drama packed with state-of-the-art action relying equally on immaculate CGI fakery and heart-stopping practical effects and stunt work makes its entrée into blockbuster history worthy of all the anticipation and more. It deserves all the accolades it will get for bringing an opulently baroque view of a comic book universe to life with sinister effectiveness.', 2, 5),
	(10, 'The Big Bang Theory: The Complete Fifth Season (2011)', 16.99, 20, 'The fifth season of The Big Bang Theory settles into a solid, enjoyable groove. The original quintet of four nerds and a pretty girl has been complemented by two nerd girls, creating a dynamic social world that retains all the social awkwardness needed for comic effect. Much of the season revolves around relationships: Howard (Simon Helberg) is engaged to Bernadette (Melissa Rauch), though that bond is tested by everything from Howard getting commissioned to be an astronaut to online revelations of Howard\'s former sleaziness; Leonard (Johnny Galecki) and Penny (Kaley Cuoco) start dating again, this time as "Leonard & Penny 2.0," promising to treat problems as bugs that can be reported and fixed; and Sheldon (Jim Parsons) and Amy (Mayim Bialik) formalize their relationship with--what else?--a contract, though a dissatisfied Amy later decides to make Sheldon a better boyfriend through sneaky behavior modification.', 5, 5),
	(11, 'BlackBerry Z10 (Verizon Wireless)', 539.99, 20, 'Faster, smarter, and smoother... BlackBerry is reinvented with the BlackBerry Z10 all-touch smartphone, powered by the robust and responsive BlackBerry 10 operating system.', 5, 5),
	(12, 'Motorola DROID MAXX (Verizon Wireless)', 699.99, 20, 'Order now and we\'ll deliver when available. We\'ll e-mail you with an estimated delivery date as soon as we have more information. Your account will only be charged when we ship the item.', 3, 5),
	(13, 'Samsung Galaxy S4, White (Verizon Wir...', 699.99, 20, 'The Galaxy S4 does what you want and what you didn\'t know was even possible. Erase a photo\'s background distractions with just a touch, catch every part of your child\'s somersault, or capture your view of the city skyline. Preview photos and files or read a news article without ever touching the screen. Use one screen to check Facebook as you catch up on email.', 5, 5),
	(14, 'Nokia Lumia 928, Black (Verizon Wireless)', 499.99, 20, 'Featuring advanced photo technology that can capture, edit, and share epic moments better than ever before, the 4G LTE-enabled Nokia Lumia 928 from Verizon Wireless enables you to snap bright, blur-free photos and videos -- even in low light conditions such as indoors or at night. Powered by the Windows Phone 8 operating system, the stunning Lumia 928 feels sleek, solid and fits perfectly in your hand. And the 4.5-inch PureMotion HD+ OLED display delivers crystal clear bright content with great outdoor visibility and a fast, responsive touchscreen.', 5, 5),
	(15, 'HTC DROID DNA (Verizon Wireless)', 649.99, 20, 'The DROID DNA by HTC features a sleek design and powerful features, all on Verizon\'s 4G LTE network. Running Android 4.1 (Jelly Bean) with HTC Sense, the DROID DNA boasts a Qualcomm quad-core 1.5 GHz processor, 2 GB of RAM, and more.', 4, 5);
/*!40000 ALTER TABLE `product_detail` ENABLE KEYS */;


-- 导出  表 eshopdemo.product_offer 结构
CREATE TABLE IF NOT EXISTS `product_offer` (
  `pro_id` int(10) DEFAULT NULL,
  `offer_id` int(10) DEFAULT NULL,
  KEY `FK__product_detail` (`pro_id`),
  KEY `FK__offer` (`offer_id`),
  CONSTRAINT `FK__offer` FOREIGN KEY (`offer_id`) REFERENCES `offer` (`id`),
  CONSTRAINT `FK__product_detail` FOREIGN KEY (`pro_id`) REFERENCES `product_detail` (`id`)
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
