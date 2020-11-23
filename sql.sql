
USE ocp;

#事业部表
DROP TABLE `t_department`;

CREATE TABLE `t_department` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_name` VARCHAR(128) NOT NULL COMMENT '事业部名称',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',  
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',  
  PRIMARY KEY (`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;





#仓库表
DROP TABLE `t_warehouse`;

CREATE TABLE `t_warehouse` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_name` VARCHAR(128) NOT NULL COMMENT '仓库名称',
  `f_address` VARCHAR(128) NOT NULL COMMENT '地址',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


#库存产品表
DROP TABLE `t_warehouse_product`;

CREATE TABLE `t_warehouse_product` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_code` VARCHAR(128) NOT NULL COMMENT '库存产品编码',
  `f_name` VARCHAR(128) NOT NULL COMMENT '库存产品名称',
  `f_model_number` VARCHAR(128) NOT NULL COMMENT '产品型号',
  `f_type` VARCHAR(128) NOT NULL COMMENT '品类',
  `f_remain_number` INT(16) NOT NULL DEFAULT '0' COMMENT '剩余数量',
  `f_price` INT(16) NOT NULL COMMENT '开票价格',
  `f_warehouse_id` INT(10) NOT NULL COMMENT '仓库id',
   `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`),
  CONSTRAINT `fk_warehouse_product` FOREIGN KEY(`f_warehouse_id`) REFERENCES `t_warehouse`(`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


#经销商用户表
DROP TABLE `t_agent_user`;

CREATE TABLE `t_agent_user` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_name` VARCHAR(128) NOT NULL COMMENT '经销商名称',
  `f_role_type` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '经销商类型：0经销商子用户，1经销商总用户',
  `f_code` VARCHAR(128) NOT NULL COMMENT '经销商编码',
  `f_zone` VARCHAR(64) NOT NULL COMMENT '区域',
  `f_password` VARCHAR(128) NOT NULL COMMENT '登录密码',
  `f_warehouse_id` INT(10) NOT NULL COMMENT '仓库id',
  `f_department_id` INT(10) NOT NULL COMMENT '事业部id',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`),
  CONSTRAINT `fk_warehouse_agent_user` FOREIGN KEY(`f_warehouse_id`) REFERENCES `t_warehouse`(`f_id`),
  CONSTRAINT `fk_department_agent_user` FOREIGN KEY(`f_department_id`) REFERENCES `t_department`(`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


#店铺表
DROP TABLE `t_shop`;

CREATE TABLE `t_shop` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_name` VARCHAR(128) NOT NULL COMMENT '店铺名称',
  `f_agent_user_id` INT(10) NOT NULL  COMMENT '经销商id',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`),
  CONSTRAINT `fk_agent_user_shop` FOREIGN KEY(`f_agent_user_id`) REFERENCES `t_agent_user`(`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;


#运营用户表
DROP TABLE `t_operator_user`

CREATE TABLE `t_operator_user` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_name` VARCHAR(128) NOT NULL COMMENT '经销商名称',
  `f_password` VARCHAR(128) NOT NULL COMMENT '登录密码',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;



#订单表
DROP TABLE `t_order`;

CREATE TABLE `t_order` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `f_flag` INT(4) NOT NULL COMMENT '订单状态：0待审核、1已审核、2审核驳回、3取消、4待上传附件、5待复核、6复核驳回、7已复核、8成功',
  `f_remarks` VARCHAR(128) COMMENT '审核信息备注',
  `f_appendix` VARCHAR(128) COMMENT '附件地址',
  `f_first_operator_id` INT(10) NOT NULL COMMENT '初审运营人员id',
  `f_second_operator_id` INT(10) NOT NULL COMMENT '复审运营人员id',
  `f_agent_user_id` INT(10) NOT NULL COMMENT '经销商id',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`),
  CONSTRAINT `fk_first_operator_order` FOREIGN KEY(`f_first_operator_id`) REFERENCES `t_operator_user`(`f_id`),
  CONSTRAINT `fk_second_operator_order` FOREIGN KEY(`f_second_operator_id`) REFERENCES `t_operator_user`(`f_id`),
  CONSTRAINT `fk_agent_user_order` FOREIGN KEY(`f_agent_user_id`) REFERENCES `t_agent_user`(`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;



#订单产品表
DROP TABLE `t_order_product`;

CREATE TABLE `t_order_product` (
  `f_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `f_ready_number` INT(16) NOT NULL  COMMENT '备货数量',
  `f_total` INT(16) NOT NULL COMMENT '开票价格',
  `f_order_id` INT(10) NOT NULL COMMENT '订单id',
  `f_warehouse_product_id` INT(10) NOT NULL COMMENT '库存产品id',
  `f_del_flag` TINYINT(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志：0正常，1 删除',
  `f_create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `f_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`f_id`),
  CONSTRAINT `fk_order_product` FOREIGN KEY(`f_order_id`) REFERENCES `t_order`(`f_id`),
  CONSTRAINT `fk_warehouse_product_order_product` FOREIGN KEY(`f_warehouse_product_id`) REFERENCES `t_warehouse_product`(`f_id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;





















