-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootl595p
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springbootl595p`
--

/*!40000 DROP DATABASE IF EXISTS `springbootl595p`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootl595p` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootl595p`;

--
-- Table structure for table `bumenxinxi`
--

DROP TABLE IF EXISTS `bumenxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bumenxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bumenmingcheng` varchar(200) NOT NULL COMMENT '部门名称',
  `bumendizhi` varchar(200) NOT NULL COMMENT '部门地址',
  `fuzeren` varchar(200) DEFAULT NULL COMMENT '负责人',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522768886 DEFAULT CHARSET=utf8 COMMENT='部门信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bumenxinxi`
--

LOCK TABLES `bumenxinxi` WRITE;
/*!40000 ALTER TABLE `bumenxinxi` DISABLE KEYS */;
INSERT INTO `bumenxinxi` VALUES (21,'2022-01-07 02:29:31','部门名称1','部门地址1','负责人1','13823888881','2022-01-07'),(22,'2022-01-07 02:29:31','部门名称2','部门地址2','负责人2','13823888882','2022-01-07'),(23,'2022-01-07 02:29:31','部门名称3','部门地址3','负责人3','13823888883','2022-01-07'),(24,'2022-01-07 02:29:31','部门名称4','部门地址4','负责人4','13823888884','2022-01-07'),(25,'2022-01-07 02:29:31','部门名称5','部门地址5','负责人5','13823888885','2022-01-07'),(26,'2022-01-07 02:29:31','部门名称6','部门地址6','负责人6','13823888886','2022-01-07'),(1641522768885,'2022-01-07 02:32:48','打手部门','公司一楼大厅','小黑','13666666666','2022-01-07');
/*!40000 ALTER TABLE `bumenxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) NOT NULL COMMENT '信息编号',
  `gonggaobiaoti` varchar(200) NOT NULL COMMENT '公告标题',
  `gonggaojianjie` longtext COMMENT '公告简介',
  `xiangguantupian` varchar(200) DEFAULT NULL COMMENT '相关图片',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xinxibianhao` (`xinxibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522878878 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (81,'2022-01-07 02:29:31','1111111111','公告标题1','公告简介1','upload/gonggaoxinxi_xiangguantupian1.jpg','公告内容1','2022-01-07'),(82,'2022-01-07 02:29:31','2222222222','公告标题2','公告简介2','upload/gonggaoxinxi_xiangguantupian2.jpg','公告内容2','2022-01-07'),(83,'2022-01-07 02:29:31','3333333333','公告标题3','公告简介3','upload/gonggaoxinxi_xiangguantupian3.jpg','<p>用户是无法更改自己的部门跟职称的，只能是管理员进行更改</p>','2022-01-07'),(84,'2022-01-07 02:29:31','4444444444','公告标题4','公告简介4','upload/gonggaoxinxi_xiangguantupian4.jpg','公告内容4','2022-01-07'),(85,'2022-01-07 02:29:31','5555555555','公告标题5','公告简介5','upload/gonggaoxinxi_xiangguantupian5.jpg','公告内容5','2022-01-07'),(1641522878877,'2022-01-07 02:34:38','1641522936579','这里发布公告给公司内部人员','公告的简介','upload/1641522861522.jpg','<p>公告的内容，还可以适当的插入图片</p><p><img src=\"http://localhost:8080/springbootl595p/upload/1641522877487.jpg\"></p>','2022-01-07');
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzixinxi`
--

DROP TABLE IF EXISTS `gongzixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) NOT NULL COMMENT '信息编号',
  `gongzimingcheng` varchar(200) NOT NULL COMMENT '工资名称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `gerenkahao` varchar(200) DEFAULT NULL COMMENT '个人卡号',
  `kaihuxing` varchar(200) DEFAULT NULL COMMENT '开户行',
  `jibengongzi` int(11) DEFAULT NULL COMMENT '基本工资',
  `jiabanbuzhu` int(11) DEFAULT NULL COMMENT '加班补助',
  `yingkoujine` int(11) DEFAULT NULL COMMENT '应扣金额',
  `shijigongzi` int(11) DEFAULT NULL COMMENT '实际工资',
  `beizhu` longtext COMMENT '备注',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xinxibianhao` (`xinxibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1641523071395 DEFAULT CHARSET=utf8 COMMENT='工资信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzixinxi`
--

LOCK TABLES `gongzixinxi` WRITE;
/*!40000 ALTER TABLE `gongzixinxi` DISABLE KEYS */;
INSERT INTO `gongzixinxi` VALUES (71,'2022-01-07 02:29:31','1111111111','工资名称1','工号1','姓名1','个人卡号1','开户行1',1,1,1,1,'备注1','2022-01-07'),(72,'2022-01-07 02:29:31','2222222222','工资名称2','工号2','姓名2','个人卡号2','开户行2',2,2,2,2,'备注2','2022-01-07'),(73,'2022-01-07 02:29:31','3333333333','工资名称3','工号3','姓名3','个人卡号3','开户行3',3,3,3,3,'备注3','2022-01-07'),(74,'2022-01-07 02:29:31','4444444444','工资名称4','工号4','姓名4','个人卡号4','开户行4',4,4,4,4,'备注4','2022-01-07'),(75,'2022-01-07 02:29:31','5555555555','工资名称5','工号5','姓名5','个人卡号5','开户行5',5,5,5,5,'备注5','2022-01-07'),(76,'2022-01-07 02:29:31','6666666666','工资名称6','工号6','姓名6','个人卡号6','开户行6',6,6,6,6,'备注6','2022-01-07'),(1641523071394,'2022-01-07 02:37:50','1641523138868','12月份工资','11','张三','123456789','工号上海开户行',500,100,200,400,'请假扣200','2022-01-07');
/*!40000 ALTER TABLE `gongzixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzizhanghao`
--

DROP TABLE IF EXISTS `gongzizhanghao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzizhanghao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `zhiweimingcheng` varchar(200) DEFAULT NULL COMMENT '职位名称',
  `zhichengmingcheng` varchar(200) DEFAULT NULL COMMENT '职称名称',
  `gerenkahao` int(11) DEFAULT NULL COMMENT '个人卡号',
  `kaihuxing` varchar(200) DEFAULT NULL COMMENT '开户行',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522983317 DEFAULT CHARSET=utf8 COMMENT='工资账号';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzizhanghao`
--

LOCK TABLES `gongzizhanghao` WRITE;
/*!40000 ALTER TABLE `gongzizhanghao` DISABLE KEYS */;
INSERT INTO `gongzizhanghao` VALUES (61,'2022-01-07 02:29:31','工号1','姓名1','部门名称1','职位名称1','职称名称1',1,'开户行1','2022-01-07'),(62,'2022-01-07 02:29:31','工号2','姓名2','部门名称2','职位名称2','职称名称2',2,'开户行2','2022-01-07'),(63,'2022-01-07 02:29:31','工号3','姓名3','部门名称3','职位名称3','职称名称3',3,'开户行3','2022-01-07'),(64,'2022-01-07 02:29:31','工号4','姓名4','部门名称4','职位名称4','职称名称4',4,'开户行4','2022-01-07'),(65,'2022-01-07 02:29:31','工号5','姓名5','部门名称5','职位名称5','职称名称5',5,'开户行5','2022-01-07'),(66,'2022-01-07 02:29:31','工号6','姓名6','部门名称6','职位名称6','职称名称6',6,'开户行6','2022-01-07'),(1641522983316,'2022-01-07 02:36:22','11','张三','打手部门','职业打手','金牌打手',123456789,'工号上海开户行','2022-01-07');
/*!40000 ALTER TABLE `gongzizhanghao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qingjiaxinxi`
--

DROP TABLE IF EXISTS `qingjiaxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qingjiaxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) NOT NULL COMMENT '信息编号',
  `qingjiayuanyin` varchar(200) NOT NULL COMMENT '请假原因',
  `qingjiatianshu` int(11) DEFAULT NULL COMMENT '请假天数',
  `jutineirong` longtext COMMENT '具体内容',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `zhiweimingcheng` varchar(200) DEFAULT NULL COMMENT '职位名称',
  `zhichengmingcheng` varchar(200) DEFAULT NULL COMMENT '职称名称',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xinxibianhao` (`xinxibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522941948 DEFAULT CHARSET=utf8 COMMENT='请假信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qingjiaxinxi`
--

LOCK TABLES `qingjiaxinxi` WRITE;
/*!40000 ALTER TABLE `qingjiaxinxi` DISABLE KEYS */;
INSERT INTO `qingjiaxinxi` VALUES (51,'2022-01-07 02:29:31','1111111111','请假原因1',1,'具体内容1','工号1','姓名1','部门名称1','职位名称1','职称名称1','2022-01-07','是',''),(52,'2022-01-07 02:29:31','2222222222','请假原因2',2,'具体内容2','工号2','姓名2','部门名称2','职位名称2','职称名称2','2022-01-07','是',''),(53,'2022-01-07 02:29:31','3333333333','请假原因3',3,'具体内容3','工号3','姓名3','部门名称3','职位名称3','职称名称3','2022-01-07','是',''),(54,'2022-01-07 02:29:31','4444444444','请假原因4',4,'具体内容4','工号4','姓名4','部门名称4','职位名称4','职称名称4','2022-01-07','是',''),(55,'2022-01-07 02:29:31','5555555555','请假原因5',5,'具体内容5','工号5','姓名5','部门名称5','职位名称5','职称名称5','2022-01-07','是',''),(56,'2022-01-07 02:29:31','6666666666','请假原因6',6,'具体内容6','工号6','姓名6','部门名称6','职位名称6','职称名称6','2022-01-07','是',''),(1641522941947,'2022-01-07 02:35:41','1641523002955','我想回家',5,'昨晚没睡好，想请假回家','11','张三','打手部门','职业打手','金牌打手','2022-01-07','是','这里是审核用户的请假');
/*!40000 ALTER TABLE `qingjiaxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','rd9ccekmgmne7zywvqk6akvvezag8a1h','2022-01-07 02:32:25','2022-01-07 03:36:55'),(2,1641522738741,'11','yonghu','用户','6vj4wxm7wpng9illcgxg3ond5misimpl','2022-01-07 02:34:45','2022-01-07 03:38:01');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-01-07 02:29:31');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  `bumenmingcheng` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `zhiweimingcheng` varchar(200) DEFAULT NULL COMMENT '职位名称',
  `zhichengmingcheng` varchar(200) DEFAULT NULL COMMENT '职称名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522738742 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-01-07 02:29:31','工号1','123456','姓名1','男','773890001@qq.com','13823888881','upload/yonghu_xiangpian1.jpg','部门名称1','职位名称1','职称名称1'),(12,'2022-01-07 02:29:31','工号2','123456','姓名2','男','773890002@qq.com','13823888882','upload/yonghu_xiangpian2.jpg','部门名称2','职位名称2','职称名称2'),(13,'2022-01-07 02:29:31','工号3','123456','姓名3','男','773890003@qq.com','13823888883','upload/yonghu_xiangpian3.jpg','部门名称3','职位名称3','职称名称3'),(14,'2022-01-07 02:29:31','工号4','123456','姓名4','男','773890004@qq.com','13823888884','upload/yonghu_xiangpian4.jpg','部门名称4','职位名称4','职称名称4'),(15,'2022-01-07 02:29:31','工号5','123456','姓名5','男','773890005@qq.com','13823888885','upload/yonghu_xiangpian5.jpg','部门名称5','职位名称5','职称名称5'),(16,'2022-01-07 02:29:31','工号6','123456','姓名6','男','773890006@qq.com','13823888886','upload/yonghu_xiangpian6.jpg','部门名称6','职位名称6','职称名称6'),(1641522738741,'2022-01-07 02:32:18','11','11','张三','男','132@163.com','13222222222','upload/1641522896899.jpg','打手部门','职业打手','金牌打手');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhichengxinxi`
--

DROP TABLE IF EXISTS `zhichengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhichengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhichengmingcheng` varchar(200) NOT NULL COMMENT '职称名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522803676 DEFAULT CHARSET=utf8 COMMENT='职称信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhichengxinxi`
--

LOCK TABLES `zhichengxinxi` WRITE;
/*!40000 ALTER TABLE `zhichengxinxi` DISABLE KEYS */;
INSERT INTO `zhichengxinxi` VALUES (41,'2022-01-07 02:29:31','职称名称1'),(42,'2022-01-07 02:29:31','职称名称2'),(43,'2022-01-07 02:29:31','职称名称3'),(44,'2022-01-07 02:29:31','职称名称4'),(45,'2022-01-07 02:29:31','职称名称5'),(46,'2022-01-07 02:29:31','职称名称6'),(1641522803675,'2022-01-07 02:33:23','金牌打手');
/*!40000 ALTER TABLE `zhichengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiweixinxi`
--

DROP TABLE IF EXISTS `zhiweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiweimingcheng` varchar(200) NOT NULL COMMENT '职位名称',
  `zhiweixinchou` int(11) DEFAULT NULL COMMENT '职位薪酬',
  `zhiweizhize` longtext COMMENT '职位职责',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1641522796104 DEFAULT CHARSET=utf8 COMMENT='职位信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiweixinxi`
--

LOCK TABLES `zhiweixinxi` WRITE;
/*!40000 ALTER TABLE `zhiweixinxi` DISABLE KEYS */;
INSERT INTO `zhiweixinxi` VALUES (31,'2022-01-07 02:29:31','职位名称1',1,'职位职责1'),(32,'2022-01-07 02:29:31','职位名称2',2,'职位职责2'),(33,'2022-01-07 02:29:31','职位名称3',3,'职位职责3'),(34,'2022-01-07 02:29:31','职位名称4',4,'职位职责4'),(35,'2022-01-07 02:29:31','职位名称5',5,'职位职责5'),(36,'2022-01-07 02:29:31','职位名称6',6,'职位职责6'),(1641522796103,'2022-01-07 02:33:15','职业打手',600,'负责保护公司的安全');
/*!40000 ALTER TABLE `zhiweixinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-12 18:54:10
