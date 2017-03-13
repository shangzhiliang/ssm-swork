-- --------------------------------------------------------
-- 主机:                           192.168.1.160
-- 服务器版本:                        10.0.20-MariaDB-log - MariaDB Server
-- 服务器操作系统:                      Linux
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

-- 导出 pdms_base 的数据库结构
CREATE DATABASE IF NOT EXISTS `pdms_base_temp`;
USE `pdms_base_temp`;


-- 导出  表 pdms_base.pdms_dictionary 结构
CREATE TABLE IF NOT EXISTS `pdms_dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_code` varchar(50) DEFAULT '0',
  `code` varchar(50) DEFAULT '0',
  `value` varchar(50) DEFAULT '0',
  `seq_no` tinyint(4) DEFAULT '0',
  `is_deleted` tinyint(4) DEFAULT '0',
  `c_t` int(11) DEFAULT '0',
  `u_t` int(11) DEFAULT '0',
  `create_user` bigint(20) DEFAULT '0',
  `update_user` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- 导出  表 pdms_base.pdms_parameter 结构
CREATE TABLE IF NOT EXISTS `pdms_parameter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `f_wms_warehouse` bigint(20) NOT NULL DEFAULT '0' COMMENT '仓库id',
  `f_wms_parameter` bigint(20) NOT NULL DEFAULT '0' COMMENT '参数配置id',
  `parameter_code` varchar(55) NOT NULL DEFAULT '''''' COMMENT '参数编码',
  `parameter_value` varchar(200) NOT NULL DEFAULT '''''' COMMENT '参数值',
  `creater` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
  `c_t` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updater` bigint(20) NOT NULL DEFAULT '0' COMMENT '更新人',
  `u_t` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `i_warehouse_parameter` (`f_wms_warehouse`,`f_wms_parameter`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 导出  表 pdms_base.pdms_shipping_line 结构
CREATE TABLE IF NOT EXISTS `pdms_shipping_line` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sys_code` varchar(20) DEFAULT '' COMMENT '系统编码',
  `code` varchar(50) NOT NULL DEFAULT '0' COMMENT '集货排顺序号',
  `show_code` varchar(30) NOT NULL DEFAULT '' COMMENT '显示集货排号',
  `sorting_center_area_show_code` varchar(20) NOT NULL DEFAULT '' COMMENT '分拣中心区域显示编码',
  `sorting_center_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '分拣中心id',
  `region_code` varchar(15) NOT NULL DEFAULT '0' COMMENT '库(大区)',
  `sorting_center_area_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '分拣中心区域id',
  `f_loc` bigint(20) NOT NULL DEFAULT '0' COMMENT '默认发货位',
  `type` tinyint(11) NOT NULL DEFAULT '1' COMMENT '货位类型，1 分拣 2.退货 3，收货',
  `loc_num` int(11) NOT NULL DEFAULT '0' COMMENT '货位数量',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '可用状态0：禁用1：启用；2：占用',
  `c_t` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `creater` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
  `u_t` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  `updater` bigint(20) NOT NULL DEFAULT '0' COMMENT '更新人',
  `updaterName` varchar(50) NOT NULL DEFAULT '' COMMENT '更新人名称',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除标识 0-否, 1-是',
  PRIMARY KEY (`id`),
  UNIQUE KEY `AK_UDX_PASSAGEWAY_001_PDMS_SHI` (`show_code`,`sorting_center_id`,`code`,`sorting_center_area_id`,`is_deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='集货排表';

alter table pdms_shipping_line 
add index `i_center_region_code` (`sorting_center_id`,`region_code`);

-- 导出  表 pdms_base.pdms_shipping_location 结构
CREATE TABLE `pdms_shipping_location` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
	`sys_code` VARCHAR(30) NULL DEFAULT '' COMMENT '系统编码',
	`code` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '货位编号',
	`sorting_center_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '归属分拣中心id',
	`show_code` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '显示编码',
	`region_code` VARCHAR(15) NOT NULL DEFAULT '' COMMENT '大区编号',
	`shipping_line_id` BIGINT(11) NOT NULL DEFAULT '0' COMMENT '集货排id',
	`sorting_center_area_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '分拣区域id',
	`layer` VARCHAR(4) NOT NULL DEFAULT '0' COMMENT '层',
	`line` VARCHAR(4) NOT NULL DEFAULT '0' COMMENT '列',
	`deep` VARCHAR(20) NULL DEFAULT '0' COMMENT '纵深(保留位)',
	`sorting_order` INT(11) NOT NULL DEFAULT '0' COMMENT '货位顺序',
	`specification` VARCHAR(30) NULL DEFAULT '1000*1200*1500' COMMENT '规格：长*宽*高',
	`bearing_weight` INT(11) NOT NULL DEFAULT '1000' COMMENT '承重KG',
	`status` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '可用状态(0：禁用1：启用；2：占用)',
	`type` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '货位类型（1：分拣 2 退货 3 收货）',
	`volume_limit` TINYINT(4) NULL DEFAULT '1' COMMENT '是否限制体积 0：限制；1：不限制',
	`weight_limit` DECIMAL(11,2) NULL DEFAULT '0.00' COMMENT '是否限制重量 0：不限制;其他：具体限制值',
	`quantity_limit` INT(11) NULL DEFAULT '0' COMMENT '是否限制数量 0：不限制;其他:具体限制值',
	`length` INT(11) NOT NULL DEFAULT '1000' COMMENT '长度',
	`width` INT(11) NOT NULL DEFAULT '1200' COMMENT '宽度',
	`height` INT(11) NOT NULL DEFAULT '1500' COMMENT '高度',
	`c_t` INT(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
	`creater` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '创建人',
	`u_t` INT(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
	`updater` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '更新人',
	`updaterName` VARCHAR(50) NOT NULL DEFAULT '0' COMMENT '更新人名称',
	`is_deleted` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '是否删除标识 0-否, 1-是',
	PRIMARY KEY (`id`),
	UNIQUE INDEX `AK_UDX_LOCATION_001_PDMS_SHI` (`sorting_center_id`, `show_code`, `sorting_center_area_id`, `is_deleted`)
)
COMMENT='集货位表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1;

ALTER TABLE `pdms_shipping_location`
ADD INDEX `i_shippingline` (`shipping_line_id`) ;


-- 导出  表 pdms_base.pdms_sorting_center_area 结构
CREATE TABLE IF NOT EXISTS `pdms_sorting_center_area` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sys_code` varchar(20) DEFAULT '' COMMENT '系统编码',
  `code` varchar(10) NOT NULL DEFAULT '' COMMENT '储区代码(A-Z)',
  `show_code` varchar(20) NOT NULL COMMENT '显示编码',
  `region_code` varchar(15) NOT NULL DEFAULT '0' COMMENT '库(大区)储区代码A-Z',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '储区名称',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '7：分拣区 12 :退获区 3 收货区',
  `is_throw_line` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否投线(0 否 1 是)',
  `temperature_layer` tinyint(4) NOT NULL DEFAULT '0' COMMENT '1：常温 2：冷冻 3：冷藏 4：恒温',
  `sorting_center_id` bigint(20) NOT NULL DEFAULT '1' COMMENT '分拣中心id',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '可用状态0：禁用1：启用；2：占用',
  `creater` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
  `c_t` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updater` bigint(20) NOT NULL DEFAULT '0' COMMENT '编辑人',
  `u_t` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  `updaterName` varchar(50) NOT NULL DEFAULT '0' COMMENT '更新人名称',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标识0：否，1：是',
  PRIMARY KEY (`id`),
  UNIQUE KEY `AK_UQE_ON_STORAGE_ARE_PDMS_SOR` (`show_code`,`sorting_center_id`,`is_deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='集货区域表';





-- 导出  表 pdms_base.pdms_sorting_center_area_class1_ref 结构
CREATE TABLE IF NOT EXISTS `pdms_sorting_center_area_class1_ref` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class1id` bigint(20) NOT NULL COMMENT '一级分类id',
  `sorting_center_id` bigint(20) NOT NULL COMMENT '分拣中心id',
  `sorting_center_area_id` bigint(20) DEFAULT NULL COMMENT '发货区id',
  `creater` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
  `c_t` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updater` bigint(20) NOT NULL DEFAULT '0' COMMENT '编辑人',
  `u_t` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  `update_name` varchar(50) NOT NULL DEFAULT '0' COMMENT '更新人名称',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标识0：否，1：是',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unx_index_001` (`class1id`,`sorting_center_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='按商品一级分类配置的发货区id关系表';



-- 导出  表 pdms_base.pdms_sorting_center_area_sku_ref 结构
CREATE TABLE IF NOT EXISTS `pdms_sorting_center_area_sku_ref` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sku_id` bigint(20) NOT NULL COMMENT '商品id',
  `sku_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `sku_format` varchar(255) DEFAULT NULL COMMENT '规格',
  `sku_level` varchar(255) DEFAULT NULL COMMENT '等级',
  `class1_id` bigint(20) NOT NULL COMMENT '一级分类',
  `class1_name` varchar(125) DEFAULT NULL COMMENT '一级分类名称',
  `sorting_center_area_id` bigint(20) DEFAULT NULL COMMENT '所属发货区id',
  `sorting_center_id` bigint(20) NOT NULL COMMENT '分拣中心id',
  `is_throw_line` tinyint(4) NOT NULL COMMENT '分拣类型 0 投框，1投线',
  `process_flag` tinyint(4) DEFAULT NULL COMMENT '加工类型，需同步',
  `creater` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人',
  `c_t` int(11) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updater` bigint(20) NOT NULL DEFAULT '0' COMMENT '编辑人',
  `update_name` varchar(50) NOT NULL DEFAULT '0',
  `u_t` int(11) NOT NULL DEFAULT '0' COMMENT '更新时间',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除标识0：否，1：是',
  PRIMARY KEY (`id`,`sku_id`,`sorting_center_id`,`class1_id`),
  UNIQUE KEY `UN_INDEX_001` (`sku_id`,`sorting_center_id`,`class1_id`,`sku_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='按商品id配置的发货区关联关系表';




