-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot4b942thb
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot4b942thb`
--

/*!40000 DROP DATABASE IF EXISTS `springboot4b942thb`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot4b942thb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot4b942thb`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地址',
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '收货人',
  `phone` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '电话',
  `isdefault` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2025-02-18 04:43:58',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2025-02-18 04:43:58',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2025-02-18 04:43:58',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2025-02-18 04:43:58',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2025-02-18 04:43:58',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2025-02-18 04:43:58',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2025-02-18 04:43:58',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2025-02-18 04:43:58',18,'宇宙银河系地球1号','地某','13823888888','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT 'yueyushangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`),
  KEY `price` (`price`),
  CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`price`) REFERENCES `yueyushangpin` (`price`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chargerecord`
--

DROP TABLE IF EXISTS `chargerecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chargerecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `role` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '角色',
  `amount` double NOT NULL COMMENT '金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='充值记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chargerecord`
--

LOCK TABLES `chargerecord` WRITE;
/*!40000 ALTER TABLE `chargerecord` DISABLE KEYS */;
INSERT INTO `chargerecord` VALUES (1,'2025-02-18 04:43:58',1,'用户名1','角色1',1),(2,'2025-02-18 04:43:58',2,'用户名2','角色2',2),(3,'2025-02-18 04:43:58',3,'用户名3','角色3',3),(4,'2025-02-18 04:43:58',4,'用户名4','角色4',4),(5,'2025-02-18 04:43:58',5,'用户名5','角色5',5),(6,'2025-02-18 04:43:58',6,'用户名6','角色6',6),(7,'2025-02-18 04:43:58',7,'用户名7','角色7',7),(8,'2025-02-18 04:43:58',8,'用户名8','角色8',8);
/*!40000 ALTER TABLE `chargerecord` ENABLE KEYS */;
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
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyinlexinxi`
--

DROP TABLE IF EXISTS `discussyinlexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyinlexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='音乐信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyinlexinxi`
--

LOCK TABLES `discussyinlexinxi` WRITE;
/*!40000 ALTER TABLE `discussyinlexinxi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyinlexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyuejuxinxi`
--

DROP TABLE IF EXISTS `discussyuejuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyuejuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤剧信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyuejuxinxi`
--

LOCK TABLES `discussyuejuxinxi` WRITE;
/*!40000 ALTER TABLE `discussyuejuxinxi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyuejuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyueyushangpin`
--

DROP TABLE IF EXISTS `discussyueyushangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyueyushangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyueyushangpin`
--

LOCK TABLES `discussyueyushangpin` WRITE;
/*!40000 ALTER TABLE `discussyueyushangpin` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyueyushangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyueyuwenhua`
--

DROP TABLE IF EXISTS `discussyueyuwenhua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyueyuwenhua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语文化评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyueyuwenhua`
--

LOCK TABLES `discussyueyuwenhua` WRITE;
/*!40000 ALTER TABLE `discussyueyuwenhua` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyueyuwenhua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyueyuyingshi`
--

DROP TABLE IF EXISTS `discussyueyuyingshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyueyuyingshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语影视评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyueyuyingshi`
--

LOCK TABLES `discussyueyuyingshi` WRITE;
/*!40000 ALTER TABLE `discussyueyuyingshi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussyueyuyingshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '帖子标题',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `isdone` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  `typename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分类名称',
  `cover` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `isanon` int(11) DEFAULT '0' COMMENT '是否匿名(1:是,0:否)',
  `delflag` int(11) DEFAULT '0' COMMENT '是否删除(1:是,0:否)',
  PRIMARY KEY (`id`),
  KEY `typename` (`typename`),
  CONSTRAINT `forum_ibfk_1` FOREIGN KEY (`typename`) REFERENCES `forumtype` (`typename`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='交流论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (1,'2025-02-18 04:43:57','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2025-02-18 12:43:57','分类名称1','upload/forum_cover1.jpg,upload/forum_cover2.jpg,upload/forum_cover3.jpg',1,0),(2,'2025-02-18 04:43:57','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2025-02-18 12:43:57','分类名称2','upload/forum_cover2.jpg,upload/forum_cover3.jpg,upload/forum_cover4.jpg',2,0),(3,'2025-02-18 04:43:57','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2025-02-18 12:43:57','分类名称3','upload/forum_cover3.jpg,upload/forum_cover4.jpg,upload/forum_cover5.jpg',3,0),(4,'2025-02-18 04:43:57','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2025-02-18 12:43:57','分类名称4','upload/forum_cover4.jpg,upload/forum_cover5.jpg,upload/forum_cover6.jpg',4,0),(5,'2025-02-18 04:43:57','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2025-02-18 12:43:57','分类名称5','upload/forum_cover5.jpg,upload/forum_cover6.jpg,upload/forum_cover7.jpg',5,0),(6,'2025-02-18 04:43:57','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2025-02-18 12:43:57','分类名称6','upload/forum_cover6.jpg,upload/forum_cover7.jpg,upload/forum_cover8.jpg',6,0),(7,'2025-02-18 04:43:57','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl1.jpg','开放',0,'2025-02-18 12:43:57','分类名称7','upload/forum_cover7.jpg,upload/forum_cover8.jpg,upload/forum_cover1.jpg',7,0),(8,'2025-02-18 04:43:57','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg','开放',0,'2025-02-18 12:43:57','分类名称8','upload/forum_cover8.jpg,upload/forum_cover1.jpg,upload/forum_cover2.jpg',8,0);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forumreport`
--

DROP TABLE IF EXISTS `forumreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forumreport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `forumid` bigint(20) DEFAULT NULL COMMENT '论坛id',
  `title` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '帖子标题',
  `userid` bigint(20) NOT NULL COMMENT '举报用户id',
  `username` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '举报用户名',
  `reporteduserid` bigint(20) NOT NULL COMMENT '被举报用户id',
  `reportedusername` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '被举报用户名',
  `reason` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '举报原因',
  `picture` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片补充',
  `handleadvise` longtext COLLATE utf8mb4_unicode_ci COMMENT '处理建议',
  `status` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '处理中' COMMENT '状态',
  `reporttype` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '主题帖举报' COMMENT '举报类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='交流论坛举报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forumreport`
--

LOCK TABLES `forumreport` WRITE;
/*!40000 ALTER TABLE `forumreport` DISABLE KEYS */;
INSERT INTO `forumreport` VALUES (1,'2025-02-18 04:43:57',1,'帖子标题1',1,'举报用户名1',1,'被举报用户名1','举报原因1','upload/forumreport_picture1.jpg,upload/forumreport_picture2.jpg,upload/forumreport_picture3.jpg','处理建议1','处理中','主题帖举报'),(2,'2025-02-18 04:43:57',2,'帖子标题2',2,'举报用户名2',2,'被举报用户名2','举报原因2','upload/forumreport_picture2.jpg,upload/forumreport_picture3.jpg,upload/forumreport_picture4.jpg','处理建议2','处理中','主题帖举报'),(3,'2025-02-18 04:43:58',3,'帖子标题3',3,'举报用户名3',3,'被举报用户名3','举报原因3','upload/forumreport_picture3.jpg,upload/forumreport_picture4.jpg,upload/forumreport_picture5.jpg','处理建议3','处理中','主题帖举报'),(4,'2025-02-18 04:43:58',4,'帖子标题4',4,'举报用户名4',4,'被举报用户名4','举报原因4','upload/forumreport_picture4.jpg,upload/forumreport_picture5.jpg,upload/forumreport_picture6.jpg','处理建议4','处理中','主题帖举报'),(5,'2025-02-18 04:43:58',5,'帖子标题5',5,'举报用户名5',5,'被举报用户名5','举报原因5','upload/forumreport_picture5.jpg,upload/forumreport_picture6.jpg,upload/forumreport_picture7.jpg','处理建议5','处理中','主题帖举报'),(6,'2025-02-18 04:43:58',6,'帖子标题6',6,'举报用户名6',6,'被举报用户名6','举报原因6','upload/forumreport_picture6.jpg,upload/forumreport_picture7.jpg,upload/forumreport_picture8.jpg','处理建议6','处理中','主题帖举报'),(7,'2025-02-18 04:43:58',7,'帖子标题7',7,'举报用户名7',7,'被举报用户名7','举报原因7','upload/forumreport_picture7.jpg,upload/forumreport_picture8.jpg,upload/forumreport_picture1.jpg','处理建议7','处理中','主题帖举报'),(8,'2025-02-18 04:43:58',8,'帖子标题8',8,'举报用户名8',8,'被举报用户名8','举报原因8','upload/forumreport_picture8.jpg,upload/forumreport_picture1.jpg,upload/forumreport_picture2.jpg','处理建议8','处理中','主题帖举报');
/*!40000 ALTER TABLE `forumreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forumtype`
--

DROP TABLE IF EXISTS `forumtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forumtype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `typename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`),
  KEY `forumtype_ox1y` (`typename`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='交流论坛类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forumtype`
--

LOCK TABLES `forumtype` WRITE;
/*!40000 ALTER TABLE `forumtype` DISABLE KEYS */;
INSERT INTO `forumtype` VALUES (1,'2025-02-18 04:43:57','分类名称1'),(2,'2025-02-18 04:43:57','分类名称2'),(3,'2025-02-18 04:43:57','分类名称3'),(4,'2025-02-18 04:43:57','分类名称4'),(5,'2025-02-18 04:43:57','分类名称5'),(6,'2025-02-18 04:43:57','分类名称6'),(7,'2025-02-18 04:43:57','分类名称7'),(8,'2025-02-18 04:43:57','分类名称8');
/*!40000 ALTER TABLE `forumtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT 'yueyushangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COLLATE utf8mb4_unicode_ci COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NOT NULL DEFAULT '0' COMMENT '价格',
  `total` double NOT NULL DEFAULT '0' COMMENT '总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '状态',
  `address` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '收货人',
  `logistics` longtext COLLATE utf8mb4_unicode_ci COMMENT '物流',
  `remark` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  `role` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户角色',
  `returnreason` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '退货原因',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shangpinfenlei`
--

DROP TABLE IF EXISTS `shangpinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shangpinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinfenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shangpinfenlei` (`shangpinfenlei`),
  KEY `shangpinfenlei_a619` (`shangpinfenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shangpinfenlei`
--

LOCK TABLES `shangpinfenlei` WRITE;
/*!40000 ALTER TABLE `shangpinfenlei` DISABLE KEYS */;
INSERT INTO `shangpinfenlei` VALUES (1,'2025-02-18 04:43:57','商品分类1'),(2,'2025-02-18 04:43:57','商品分类2'),(3,'2025-02-18 04:43:57','商品分类3'),(4,'2025-02-18 04:43:57','商品分类4'),(5,'2025-02-18 04:43:57','商品分类5'),(6,'2025-02-18 04:43:57','商品分类6'),(7,'2025-02-18 04:43:57','商品分类7'),(8,'2025-02-18 04:43:57','商品分类8');
/*!40000 ALTER TABLE `shangpinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '表名',
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `picture` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `type` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
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
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2025-02-18 04:43:58');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenhuafenlei`
--

DROP TABLE IF EXISTS `wenhuafenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenhuafenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenhuafenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '文化分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wenhuafenlei` (`wenhuafenlei`),
  KEY `wenhuafenlei_l203` (`wenhuafenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='文化分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenhuafenlei`
--

LOCK TABLES `wenhuafenlei` WRITE;
/*!40000 ALTER TABLE `wenhuafenlei` DISABLE KEYS */;
INSERT INTO `wenhuafenlei` VALUES (1,'2025-02-18 04:43:57','文化分类1'),(2,'2025-02-18 04:43:57','文化分类2'),(3,'2025-02-18 04:43:57','文化分类3'),(4,'2025-02-18 04:43:57','文化分类4'),(5,'2025-02-18 04:43:57','文化分类5'),(6,'2025-02-18 04:43:57','文化分类6'),(7,'2025-02-18 04:43:57','文化分类7'),(8,'2025-02-18 04:43:57','文化分类8');
/*!40000 ALTER TABLE `wenhuafenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yingshifenlei`
--

DROP TABLE IF EXISTS `yingshifenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yingshifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yingshifenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '影视分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yingshifenlei` (`yingshifenlei`),
  KEY `yingshifenlei_1nx6` (`yingshifenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='影视分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yingshifenlei`
--

LOCK TABLES `yingshifenlei` WRITE;
/*!40000 ALTER TABLE `yingshifenlei` DISABLE KEYS */;
INSERT INTO `yingshifenlei` VALUES (1,'2025-02-18 04:43:57','影视分类1'),(2,'2025-02-18 04:43:57','影视分类2'),(3,'2025-02-18 04:43:57','影视分类3'),(4,'2025-02-18 04:43:57','影视分类4'),(5,'2025-02-18 04:43:57','影视分类5'),(6,'2025-02-18 04:43:57','影视分类6'),(7,'2025-02-18 04:43:57','影视分类7'),(8,'2025-02-18 04:43:57','影视分类8');
/*!40000 ALTER TABLE `yingshifenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinlefenlei`
--

DROP TABLE IF EXISTS `yinlefenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinlefenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yinlefenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '音乐分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yinlefenlei` (`yinlefenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='音乐分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinlefenlei`
--

LOCK TABLES `yinlefenlei` WRITE;
/*!40000 ALTER TABLE `yinlefenlei` DISABLE KEYS */;
INSERT INTO `yinlefenlei` VALUES (1,'2025-02-18 04:43:57','音乐分类1'),(2,'2025-02-18 04:43:57','音乐分类2'),(3,'2025-02-18 04:43:57','音乐分类3'),(4,'2025-02-18 04:43:57','音乐分类4'),(5,'2025-02-18 04:43:57','音乐分类5'),(6,'2025-02-18 04:43:57','音乐分类6'),(7,'2025-02-18 04:43:57','音乐分类7'),(8,'2025-02-18 04:43:57','音乐分类8');
/*!40000 ALTER TABLE `yinlefenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinlexinxi`
--

DROP TABLE IF EXISTS `yinlexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinlexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `songname` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌名',
  `yinlefenlei` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '音乐分类',
  `bianqu` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编曲',
  `tianci` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '填词',
  `songfile` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '音乐文件',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `singer` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '歌手',
  `yuyan` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '语言',
  `zhuanji` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '专辑',
  `shizhang` double DEFAULT NULL COMMENT '时长',
  `faxingfang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发行方',
  `banquanfang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '版权方',
  `faxingriqi` date DEFAULT NULL COMMENT '发行日期',
  `lyric` longtext COLLATE utf8mb4_unicode_ci COMMENT '歌词',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='音乐信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinlexinxi`
--

LOCK TABLES `yinlexinxi` WRITE;
/*!40000 ALTER TABLE `yinlexinxi` DISABLE KEYS */;
INSERT INTO `yinlexinxi` VALUES (1,'2025-02-18 04:43:57','歌名1','音乐分类1','编曲1','填词1','','upload/yinlexinxi_fengmian1.jpg,upload/yinlexinxi_fengmian2.jpg,upload/yinlexinxi_fengmian3.jpg','歌手1','语言1','专辑1',1,'发行方1','版权方1','2025-02-18','歌词1',1,1,'2025-02-18 12:43:57',1,0,1),(2,'2025-02-18 04:43:57','歌名2','音乐分类2','编曲2','填词2','','upload/yinlexinxi_fengmian2.jpg,upload/yinlexinxi_fengmian3.jpg,upload/yinlexinxi_fengmian4.jpg','歌手2','语言2','专辑2',2,'发行方2','版权方2','2025-02-18','歌词2',2,2,'2025-02-18 12:43:57',2,0,2),(3,'2025-02-18 04:43:57','歌名3','音乐分类3','编曲3','填词3','','upload/yinlexinxi_fengmian3.jpg,upload/yinlexinxi_fengmian4.jpg,upload/yinlexinxi_fengmian5.jpg','歌手3','语言3','专辑3',3,'发行方3','版权方3','2025-02-18','歌词3',3,3,'2025-02-18 12:43:57',3,0,3),(4,'2025-02-18 04:43:57','歌名4','音乐分类4','编曲4','填词4','','upload/yinlexinxi_fengmian4.jpg,upload/yinlexinxi_fengmian5.jpg,upload/yinlexinxi_fengmian6.jpg','歌手4','语言4','专辑4',4,'发行方4','版权方4','2025-02-18','歌词4',4,4,'2025-02-18 12:43:57',4,0,4),(5,'2025-02-18 04:43:57','歌名5','音乐分类5','编曲5','填词5','','upload/yinlexinxi_fengmian5.jpg,upload/yinlexinxi_fengmian6.jpg,upload/yinlexinxi_fengmian7.jpg','歌手5','语言5','专辑5',5,'发行方5','版权方5','2025-02-18','歌词5',5,5,'2025-02-18 12:43:57',5,0,5),(6,'2025-02-18 04:43:57','歌名6','音乐分类6','编曲6','填词6','','upload/yinlexinxi_fengmian6.jpg,upload/yinlexinxi_fengmian7.jpg,upload/yinlexinxi_fengmian8.jpg','歌手6','语言6','专辑6',6,'发行方6','版权方6','2025-02-18','歌词6',6,6,'2025-02-18 12:43:57',6,0,6),(7,'2025-02-18 04:43:57','歌名7','音乐分类7','编曲7','填词7','','upload/yinlexinxi_fengmian7.jpg,upload/yinlexinxi_fengmian8.jpg,upload/yinlexinxi_fengmian1.jpg','歌手7','语言7','专辑7',7,'发行方7','版权方7','2025-02-18','歌词7',7,7,'2025-02-18 12:43:57',7,0,7),(8,'2025-02-18 04:43:57','歌名8','音乐分类8','编曲8','填词8','','upload/yinlexinxi_fengmian8.jpg,upload/yinlexinxi_fengmian1.jpg,upload/yinlexinxi_fengmian2.jpg','歌手8','语言8','专辑8',8,'发行方8','版权方8','2025-02-18','歌词8',8,8,'2025-02-18 12:43:57',8,0,8);
/*!40000 ALTER TABLE `yinlexinxi` ENABLE KEYS */;
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
  `zhanghao` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '账号',
  `mima` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `xingming` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机',
  `touxiang` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  `money` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2025-02-18 04:43:57','账号1','e10adc3949ba59abbe56e057f20f883e','姓名1','男','13823888881','upload/yonghu_touxiang1.jpg','是','',200),(12,'2025-02-18 04:43:57','账号2','e10adc3949ba59abbe56e057f20f883e','姓名2','男','13823888882','upload/yonghu_touxiang2.jpg','是','',200),(13,'2025-02-18 04:43:57','账号3','e10adc3949ba59abbe56e057f20f883e','姓名3','男','13823888883','upload/yonghu_touxiang3.jpg','是','',200),(14,'2025-02-18 04:43:57','账号4','e10adc3949ba59abbe56e057f20f883e','姓名4','男','13823888884','upload/yonghu_touxiang4.jpg','是','',200),(15,'2025-02-18 04:43:57','账号5','e10adc3949ba59abbe56e057f20f883e','姓名5','男','13823888885','upload/yonghu_touxiang5.jpg','是','',200),(16,'2025-02-18 04:43:57','账号6','e10adc3949ba59abbe56e057f20f883e','姓名6','男','13823888886','upload/yonghu_touxiang6.jpg','是','',200),(17,'2025-02-18 04:43:57','账号7','e10adc3949ba59abbe56e057f20f883e','姓名7','男','13823888887','upload/yonghu_touxiang7.jpg','是','',200),(18,'2025-02-18 04:43:57','账号8','e10adc3949ba59abbe56e057f20f883e','姓名8','男','13823888888','upload/yonghu_touxiang8.jpg','是','',200);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuejufenlei`
--

DROP TABLE IF EXISTS `yuejufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuejufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuejufenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '粤剧分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuejufenlei` (`yuejufenlei`),
  KEY `yuejufenlei_7992` (`yuejufenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤剧分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuejufenlei`
--

LOCK TABLES `yuejufenlei` WRITE;
/*!40000 ALTER TABLE `yuejufenlei` DISABLE KEYS */;
INSERT INTO `yuejufenlei` VALUES (1,'2025-02-18 04:43:57','粤剧分类1'),(2,'2025-02-18 04:43:57','粤剧分类2'),(3,'2025-02-18 04:43:57','粤剧分类3'),(4,'2025-02-18 04:43:57','粤剧分类4'),(5,'2025-02-18 04:43:57','粤剧分类5'),(6,'2025-02-18 04:43:57','粤剧分类6'),(7,'2025-02-18 04:43:57','粤剧分类7'),(8,'2025-02-18 04:43:57','粤剧分类8');
/*!40000 ALTER TABLE `yuejufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuejuxinxi`
--

DROP TABLE IF EXISTS `yuejuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuejuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuejumingcheng` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '粤剧名称',
  `yuejufenlei` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '粤剧分类',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `shipin` longtext COLLATE utf8mb4_unicode_ci COMMENT '视频',
  `daoyan` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '导演',
  `canyuyanyuan` longtext COLLATE utf8mb4_unicode_ci COMMENT '参与演员',
  `shangyingriqi` date DEFAULT NULL COMMENT '上映日期',
  `yuejujieshao` longtext COLLATE utf8mb4_unicode_ci COMMENT '粤剧介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  KEY `yuejufenlei` (`yuejufenlei`),
  CONSTRAINT `yuejuxinxi_ibfk_1` FOREIGN KEY (`yuejufenlei`) REFERENCES `yuejufenlei` (`yuejufenlei`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤剧信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuejuxinxi`
--

LOCK TABLES `yuejuxinxi` WRITE;
/*!40000 ALTER TABLE `yuejuxinxi` DISABLE KEYS */;
INSERT INTO `yuejuxinxi` VALUES (1,'2025-02-18 04:43:57','粤剧名称1','粤剧分类1','upload/yuejuxinxi_fengmian1.jpg,upload/yuejuxinxi_fengmian2.jpg,upload/yuejuxinxi_fengmian3.jpg','','导演1','参与演员1','2025-02-18','粤剧介绍1',1,1,'2025-02-18 12:43:57',1,0,1),(2,'2025-02-18 04:43:57','粤剧名称2','粤剧分类2','upload/yuejuxinxi_fengmian2.jpg,upload/yuejuxinxi_fengmian3.jpg,upload/yuejuxinxi_fengmian4.jpg','','导演2','参与演员2','2025-02-18','粤剧介绍2',2,2,'2025-02-18 12:43:57',2,0,2),(3,'2025-02-18 04:43:57','粤剧名称3','粤剧分类3','upload/yuejuxinxi_fengmian3.jpg,upload/yuejuxinxi_fengmian4.jpg,upload/yuejuxinxi_fengmian5.jpg','','导演3','参与演员3','2025-02-18','粤剧介绍3',3,3,'2025-02-18 12:43:57',3,0,3),(4,'2025-02-18 04:43:57','粤剧名称4','粤剧分类4','upload/yuejuxinxi_fengmian4.jpg,upload/yuejuxinxi_fengmian5.jpg,upload/yuejuxinxi_fengmian6.jpg','','导演4','参与演员4','2025-02-18','粤剧介绍4',4,4,'2025-02-18 12:43:57',4,0,4),(5,'2025-02-18 04:43:57','粤剧名称5','粤剧分类5','upload/yuejuxinxi_fengmian5.jpg,upload/yuejuxinxi_fengmian6.jpg,upload/yuejuxinxi_fengmian7.jpg','','导演5','参与演员5','2025-02-18','粤剧介绍5',5,5,'2025-02-18 12:43:57',5,0,5),(6,'2025-02-18 04:43:57','粤剧名称6','粤剧分类6','upload/yuejuxinxi_fengmian6.jpg,upload/yuejuxinxi_fengmian7.jpg,upload/yuejuxinxi_fengmian8.jpg','','导演6','参与演员6','2025-02-18','粤剧介绍6',6,6,'2025-02-18 12:43:57',6,0,6),(7,'2025-02-18 04:43:57','粤剧名称7','粤剧分类7','upload/yuejuxinxi_fengmian7.jpg,upload/yuejuxinxi_fengmian8.jpg,upload/yuejuxinxi_fengmian1.jpg','','导演7','参与演员7','2025-02-18','粤剧介绍7',7,7,'2025-02-18 12:43:57',7,0,7),(8,'2025-02-18 04:43:57','粤剧名称8','粤剧分类8','upload/yuejuxinxi_fengmian8.jpg,upload/yuejuxinxi_fengmian1.jpg,upload/yuejuxinxi_fengmian2.jpg','','导演8','参与演员8','2025-02-18','粤剧介绍8',8,8,'2025-02-18 12:43:57',8,0,8);
/*!40000 ALTER TABLE `yuejuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yueyushangpin`
--

DROP TABLE IF EXISTS `yueyushangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yueyushangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinmingcheng` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品名称',
  `shangpinfenlei` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品分类',
  `pinpai` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '品牌',
  `guige` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '规格',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `shangpinjieshao` longtext COLLATE utf8mb4_unicode_ci COMMENT '商品介绍',
  `onelimittimes` int(11) DEFAULT NULL COMMENT '单限',
  `alllimittimes` int(11) DEFAULT NULL COMMENT '库存',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `price` double NOT NULL COMMENT '价格',
  `onshelves` int(11) DEFAULT '1' COMMENT '是否上架(1:上架，0:下架)',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  KEY `yueyushangpin_price` (`price`),
  KEY `shangpinfenlei` (`shangpinfenlei`),
  CONSTRAINT `yueyushangpin_ibfk_1` FOREIGN KEY (`shangpinfenlei`) REFERENCES `shangpinfenlei` (`shangpinfenlei`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yueyushangpin`
--

LOCK TABLES `yueyushangpin` WRITE;
/*!40000 ALTER TABLE `yueyushangpin` DISABLE KEYS */;
INSERT INTO `yueyushangpin` VALUES (1,'2025-02-18 04:43:57','商品名称1','商品分类1','品牌1','规格1','upload/yueyushangpin_fengmian1.jpg,upload/yueyushangpin_fengmian2.jpg,upload/yueyushangpin_fengmian3.jpg','商品介绍1',1,99,1,1,'2025-02-18 12:43:57',1,0,99.9,1,1),(2,'2025-02-18 04:43:57','商品名称2','商品分类2','品牌2','规格2','upload/yueyushangpin_fengmian2.jpg,upload/yueyushangpin_fengmian3.jpg,upload/yueyushangpin_fengmian4.jpg','商品介绍2',2,99,2,2,'2025-02-18 12:43:57',2,0,99.9,1,2),(3,'2025-02-18 04:43:57','商品名称3','商品分类3','品牌3','规格3','upload/yueyushangpin_fengmian3.jpg,upload/yueyushangpin_fengmian4.jpg,upload/yueyushangpin_fengmian5.jpg','商品介绍3',3,99,3,3,'2025-02-18 12:43:57',3,0,99.9,1,3),(4,'2025-02-18 04:43:57','商品名称4','商品分类4','品牌4','规格4','upload/yueyushangpin_fengmian4.jpg,upload/yueyushangpin_fengmian5.jpg,upload/yueyushangpin_fengmian6.jpg','商品介绍4',4,99,4,4,'2025-02-18 12:43:57',4,0,99.9,1,4),(5,'2025-02-18 04:43:57','商品名称5','商品分类5','品牌5','规格5','upload/yueyushangpin_fengmian5.jpg,upload/yueyushangpin_fengmian6.jpg,upload/yueyushangpin_fengmian7.jpg','商品介绍5',5,99,5,5,'2025-02-18 12:43:57',5,0,99.9,1,5),(6,'2025-02-18 04:43:57','商品名称6','商品分类6','品牌6','规格6','upload/yueyushangpin_fengmian6.jpg,upload/yueyushangpin_fengmian7.jpg,upload/yueyushangpin_fengmian8.jpg','商品介绍6',6,99,6,6,'2025-02-18 12:43:57',6,0,99.9,1,6),(7,'2025-02-18 04:43:57','商品名称7','商品分类7','品牌7','规格7','upload/yueyushangpin_fengmian7.jpg,upload/yueyushangpin_fengmian8.jpg,upload/yueyushangpin_fengmian1.jpg','商品介绍7',7,99,7,7,'2025-02-18 12:43:57',7,0,99.9,1,7),(8,'2025-02-18 04:43:57','商品名称8','商品分类8','品牌8','规格8','upload/yueyushangpin_fengmian8.jpg,upload/yueyushangpin_fengmian1.jpg,upload/yueyushangpin_fengmian2.jpg','商品介绍8',8,99,8,8,'2025-02-18 12:43:57',8,0,99.9,1,8);
/*!40000 ALTER TABLE `yueyushangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yueyuwenhua`
--

DROP TABLE IF EXISTS `yueyuwenhua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yueyuwenhua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wenhuabiaoti` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '文化标题',
  `wenhuafenlei` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '文化分类',
  `wenhuajianjie` longtext COLLATE utf8mb4_unicode_ci COMMENT '文化简介',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `faburiqi` date DEFAULT NULL COMMENT '发布日期',
  `wenhuaneirong` longtext COLLATE utf8mb4_unicode_ci COMMENT '文化内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  KEY `wenhuafenlei` (`wenhuafenlei`),
  CONSTRAINT `yueyuwenhua_ibfk_1` FOREIGN KEY (`wenhuafenlei`) REFERENCES `wenhuafenlei` (`wenhuafenlei`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语文化';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yueyuwenhua`
--

LOCK TABLES `yueyuwenhua` WRITE;
/*!40000 ALTER TABLE `yueyuwenhua` DISABLE KEYS */;
INSERT INTO `yueyuwenhua` VALUES (1,'2025-02-18 04:43:57','文化标题1','文化分类1','文化简介1','upload/yueyuwenhua_fengmian1.jpg,upload/yueyuwenhua_fengmian2.jpg,upload/yueyuwenhua_fengmian3.jpg','2025-02-18','文化内容1',1,1,'2025-02-18 12:43:57',1,0,1),(2,'2025-02-18 04:43:57','文化标题2','文化分类2','文化简介2','upload/yueyuwenhua_fengmian2.jpg,upload/yueyuwenhua_fengmian3.jpg,upload/yueyuwenhua_fengmian4.jpg','2025-02-18','文化内容2',2,2,'2025-02-18 12:43:57',2,0,2),(3,'2025-02-18 04:43:57','文化标题3','文化分类3','文化简介3','upload/yueyuwenhua_fengmian3.jpg,upload/yueyuwenhua_fengmian4.jpg,upload/yueyuwenhua_fengmian5.jpg','2025-02-18','文化内容3',3,3,'2025-02-18 12:43:57',3,0,3),(4,'2025-02-18 04:43:57','文化标题4','文化分类4','文化简介4','upload/yueyuwenhua_fengmian4.jpg,upload/yueyuwenhua_fengmian5.jpg,upload/yueyuwenhua_fengmian6.jpg','2025-02-18','文化内容4',4,4,'2025-02-18 12:43:57',4,0,4),(5,'2025-02-18 04:43:57','文化标题5','文化分类5','文化简介5','upload/yueyuwenhua_fengmian5.jpg,upload/yueyuwenhua_fengmian6.jpg,upload/yueyuwenhua_fengmian7.jpg','2025-02-18','文化内容5',5,5,'2025-02-18 12:43:57',5,0,5),(6,'2025-02-18 04:43:57','文化标题6','文化分类6','文化简介6','upload/yueyuwenhua_fengmian6.jpg,upload/yueyuwenhua_fengmian7.jpg,upload/yueyuwenhua_fengmian8.jpg','2025-02-18','文化内容6',6,6,'2025-02-18 12:43:57',6,0,6),(7,'2025-02-18 04:43:57','文化标题7','文化分类7','文化简介7','upload/yueyuwenhua_fengmian7.jpg,upload/yueyuwenhua_fengmian8.jpg,upload/yueyuwenhua_fengmian1.jpg','2025-02-18','文化内容7',7,7,'2025-02-18 12:43:57',7,0,7),(8,'2025-02-18 04:43:57','文化标题8','文化分类8','文化简介8','upload/yueyuwenhua_fengmian8.jpg,upload/yueyuwenhua_fengmian1.jpg,upload/yueyuwenhua_fengmian2.jpg','2025-02-18','文化内容8',8,8,'2025-02-18 12:43:57',8,0,8);
/*!40000 ALTER TABLE `yueyuwenhua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yueyuyingshi`
--

DROP TABLE IF EXISTS `yueyuyingshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yueyuyingshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yingshimingcheng` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '影视名称',
  `yingshifenlei` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '影视分类',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `shipin` longtext COLLATE utf8mb4_unicode_ci COMMENT '视频',
  `daoyan` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '导演',
  `canyuyanyuan` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '参与演员',
  `shangyingriqi` date DEFAULT NULL COMMENT '上映日期',
  `yingshijieshao` longtext COLLATE utf8mb4_unicode_ci COMMENT '影视介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  KEY `yingshifenlei` (`yingshifenlei`),
  CONSTRAINT `yueyuyingshi_ibfk_1` FOREIGN KEY (`yingshifenlei`) REFERENCES `yingshifenlei` (`yingshifenlei`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='粤语影视';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yueyuyingshi`
--

LOCK TABLES `yueyuyingshi` WRITE;
/*!40000 ALTER TABLE `yueyuyingshi` DISABLE KEYS */;
INSERT INTO `yueyuyingshi` VALUES (1,'2025-02-18 04:43:57','影视名称1','影视分类1','upload/yueyuyingshi_fengmian1.jpg,upload/yueyuyingshi_fengmian2.jpg,upload/yueyuyingshi_fengmian3.jpg','','导演1','参与演员1','2025-02-18','影视介绍1',1,1,'2025-02-18 12:43:57',1,0,1),(2,'2025-02-18 04:43:57','影视名称2','影视分类2','upload/yueyuyingshi_fengmian2.jpg,upload/yueyuyingshi_fengmian3.jpg,upload/yueyuyingshi_fengmian4.jpg','','导演2','参与演员2','2025-02-18','影视介绍2',2,2,'2025-02-18 12:43:57',2,0,2),(3,'2025-02-18 04:43:57','影视名称3','影视分类3','upload/yueyuyingshi_fengmian3.jpg,upload/yueyuyingshi_fengmian4.jpg,upload/yueyuyingshi_fengmian5.jpg','','导演3','参与演员3','2025-02-18','影视介绍3',3,3,'2025-02-18 12:43:57',3,0,3),(4,'2025-02-18 04:43:57','影视名称4','影视分类4','upload/yueyuyingshi_fengmian4.jpg,upload/yueyuyingshi_fengmian5.jpg,upload/yueyuyingshi_fengmian6.jpg','','导演4','参与演员4','2025-02-18','影视介绍4',4,4,'2025-02-18 12:43:57',4,0,4),(5,'2025-02-18 04:43:57','影视名称5','影视分类5','upload/yueyuyingshi_fengmian5.jpg,upload/yueyuyingshi_fengmian6.jpg,upload/yueyuyingshi_fengmian7.jpg','','导演5','参与演员5','2025-02-18','影视介绍5',5,5,'2025-02-18 12:43:57',5,0,5),(6,'2025-02-18 04:43:57','影视名称6','影视分类6','upload/yueyuyingshi_fengmian6.jpg,upload/yueyuyingshi_fengmian7.jpg,upload/yueyuyingshi_fengmian8.jpg','','导演6','参与演员6','2025-02-18','影视介绍6',6,6,'2025-02-18 12:43:57',6,0,6),(7,'2025-02-18 04:43:57','影视名称7','影视分类7','upload/yueyuyingshi_fengmian7.jpg,upload/yueyuyingshi_fengmian8.jpg,upload/yueyuyingshi_fengmian1.jpg','','导演7','参与演员7','2025-02-18','影视介绍7',7,7,'2025-02-18 12:43:57',7,0,7),(8,'2025-02-18 04:43:57','影视名称8','影视分类8','upload/yueyuyingshi_fengmian8.jpg,upload/yueyuyingshi_fengmian1.jpg,upload/yueyuyingshi_fengmian2.jpg','','导演8','参与演员8','2025-02-18','影视介绍8',8,8,'2025-02-18 12:43:57',8,0,8);
/*!40000 ALTER TABLE `yueyuyingshi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-20 14:12:55
