

create database  fescar_user default character set utf8mb4 collate utf8mb4_general_ci;
use fescar_user;
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
                         `id` int(11) NOT NULL PRIMARY KEY auto_increment COMMENT '用户id',
                         `user_name` varchar(255)  NOT NULL default '' COMMENT '昵称'
) ENGINE = InnoDB auto_increment=1  CHARACTER SET = utf8mb4 comment '用户信息';