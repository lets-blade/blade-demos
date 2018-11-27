CREATE TABLE `t_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `real_name` varchar(20) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

INSERT INTO `t_user` (`id`, `username`, `password`, `real_name`, `age`)
VALUES
	(1, 'jack', 'aaa', '杰克', 32),
	(2, 'rose', '999', '螺丝', 29),
	(3, 'biezhi', '123556', '魔王不造反', 19),
	(4, 'codesofun', '123556', '代码真香', 20);
