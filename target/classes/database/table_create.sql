-- ----------------------------
-- Table structure for `t1001`
-- ----------------------------
DROP TABLE IF EXISTS `t1001`;
CREATE TABLE `t1001` (
  `id` varchar(255) NOT NULL DEFAULT '' COMMENT '编号',
  `work_date` varchar(255) DEFAULT NULL COMMENT '日期',
  `work_shift` varchar(255) DEFAULT NULL COMMENT '班次',
  `dept` varchar(255) DEFAULT NULL COMMENT '系别',
  `foreman` varchar(255) DEFAULT NULL COMMENT '班长',
  `operator` varchar(255) DEFAULT NULL COMMENT '作业员',
  `time_plan` varchar(255) DEFAULT NULL COMMENT '计划出勤',
  `time_actual` varchar(255) DEFAULT NULL COMMENT '实际出勤',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `input_user` varchar(255) DEFAULT NULL COMMENT '录入人',
  `input_date` varchar(255) DEFAULT NULL COMMENT '录入时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t1002`
-- ----------------------------
DROP TABLE IF EXISTS `t1002`;
CREATE TABLE `t1002` (
  `id` varchar(255) NOT NULL DEFAULT '' COMMENT '编号',
  `customer` varchar(255) DEFAULT NULL COMMENT '客户',
  `product` varchar(255) DEFAULT NULL COMMENT '产品型号',
  `ring_side` varchar(255) DEFAULT NULL COMMENT '内外圈',
  `sealing` varchar(255) DEFAULT NULL COMMENT '密封特性',
  `production_plan` varchar(255) DEFAULT NULL COMMENT '计划产量',
  `raw` varchar(255) DEFAULT NULL COMMENT '材质',
  `bundle` varchar(255) DEFAULT NULL COMMENT '捆号',
  `batch` varchar(255) DEFAULT NULL COMMENT '炉号',
  `line` varchar(255) DEFAULT NULL COMMENT '线号',
  `time` varchar(255) DEFAULT NULL COMMENT '加工用时',
  `yield` varchar(255) DEFAULT NULL COMMENT '良品数',
  `bad` varchar(255) DEFAULT NULL COMMENT '不良品数',
  `repair` varchar(255) DEFAULT NULL COMMENT '修检品数',
  `machine_anomaly` varchar(255) DEFAULT NULL COMMENT '设备异常',
  `tool_anomaly` varchar(255) DEFAULT NULL COMMENT '工装异常',
  `model_switch_plan` varchar(255) DEFAULT NULL COMMENT '计划型号切换',
  `model_switch_actual` varchar(255) DEFAULT NULL COMMENT '实际型号切换',
  `quality_deviation` varchar(255) DEFAULT NULL COMMENT '品质异常',
  `not_overtime` varchar(255) DEFAULT NULL COMMENT '未加班',
  `staff_leave` varchar(255) DEFAULT NULL COMMENT '人员离岗',
  `stop_plan` varchar(255) DEFAULT NULL COMMENT '计划停机',
  `fives_plan` varchar(255) DEFAULT NULL COMMENT '计划5S',
  `fore_anomaly` varchar(255) DEFAULT NULL COMMENT '前工程异常',
  `power_anomaly` varchar(255) DEFAULT NULL COMMENT '动力异常',
  `training` varchar(255) DEFAULT NULL COMMENT '会议培训',
  `outs_box` varchar(255) DEFAULT NULL COMMENT '待料箱',
  `wait_raw` varchar(255) DEFAULT NULL COMMENT '待原辅料',
  `try_work` varchar(255) DEFAULT NULL COMMENT '试做',
  `wheel_truing` varchar(255) DEFAULT NULL COMMENT '砂轮整形',
  `other` varchar(255) DEFAULT NULL COMMENT '其他',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `t1003`
-- ----------------------------
DROP TABLE IF EXISTS `t1003`;
CREATE TABLE `t1003` (
  `id` varchar(255) NOT NULL DEFAULT '' COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名字',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `login_time` varchar(255) DEFAULT NULL COMMENT '登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;