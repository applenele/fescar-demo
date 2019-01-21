create database  fescar_pay default character set utf8mb4 collate utf8mb4_general_ci;

use fescar_pay;
DROP TABLE IF EXISTS `t_pay`;
CREATE TABLE `t_pay`  (
                        `id` int(11) NOT NULL PRIMARY KEY auto_increment  COMMENT '用户id',
                        `user_name` varchar(255)  NOT NULL default '' COMMENT '昵称'
) ENGINE = InnoDB auto_increment=1  CHARACTER SET = utf8mb4 comment '支付信息';