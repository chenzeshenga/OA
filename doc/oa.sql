-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)
--
-- Host: localhost    Database: oa
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `info` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `CourseNo` varchar(4) NOT NULL,
  `CourseName` varchar(40) DEFAULT NULL,
  `CourseTeacherId` tinyint(20) DEFAULT NULL,
  `CourseIntro` varchar(100) DEFAULT NULL,
  `Credit` decimal(4,1) DEFAULT NULL,
  `ClassRoom` varchar(40) DEFAULT NULL,
  `Time` datetime(6) DEFAULT NULL,
  `CourseGrade` varchar(20) DEFAULT NULL,
  `CourseType` enum('专业课','必修课','其他') DEFAULT NULL,
  PRIMARY KEY (`CourseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('101','计算机网络',28,'实验课',2.0,'煎煮10','2017-06-07 09:10:59.000000','软件zy1402','专业课');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaders`
--

DROP TABLE IF EXISTS `leaders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leaders` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `ManagerDepartment` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `info` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `WorkState` varchar(45) DEFAULT NULL,
  `Register` varchar(45) DEFAULT NULL,
  `EntryTime` date DEFAULT NULL,
  `NativePlace` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaders`
--

LOCK TABLES `leaders` WRITE;
/*!40000 ALTER TABLE `leaders` DISABLE KEYS */;
/*!40000 ALTER TABLE `leaders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leave`
--

DROP TABLE IF EXISTS `leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leave` (
  `LeaveNo` tinyint(4) NOT NULL,
  `ApplicantName` varchar(10) DEFAULT NULL,
  `ApplicantStartTime` tinyint(4) DEFAULT NULL,
  `ApplicantEndTime` datetime(6) DEFAULT NULL,
  `ApproveTime` datetime(6) DEFAULT NULL,
  `ApproverName` varchar(10) DEFAULT NULL,
  `LeaveReason` varchar(20) DEFAULT NULL,
  `ApplicantDepartment` varchar(10) DEFAULT NULL,
  `ApplicantJob` varchar(10) DEFAULT NULL,
  `ApplicationStatus` enum('YES','NO') DEFAULT NULL,
  `ApproverDepartment` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`LeaveNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave`
--

LOCK TABLES `leave` WRITE;
/*!40000 ALTER TABLE `leave` DISABLE KEYS */;
/*!40000 ALTER TABLE `leave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `MessageNo` tinyint(4) NOT NULL,
  `MessageContent` varchar(100) DEFAULT NULL,
  `MessageSender` varchar(10) DEFAULT NULL,
  `MessageTaker` varchar(10) DEFAULT NULL,
  `MessageType` enum('部门','个人') DEFAULT NULL,
  PRIMARY KEY (`MessageNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reimbursement`
--

DROP TABLE IF EXISTS `reimbursement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reimbursement` (
  `ReimbursementNo` tinyint(4) unsigned NOT NULL AUTO_INCREMENT,
  `ApplicantName` varchar(10) DEFAULT NULL,
  `ApplicantDepartment` varchar(10) DEFAULT NULL,
  `ApplicantJob` varchar(10) DEFAULT NULL,
  `ReimbursementType` varchar(20) DEFAULT NULL,
  `ReimbursementMoney` int(10) DEFAULT NULL,
  `ApproveTime` datetime(6) DEFAULT NULL,
  `ApproveName` varchar(10) DEFAULT NULL,
  `ApproverDepartment` varchar(10) DEFAULT NULL,
  `ReimbursementStatus` enum('NO','YES') DEFAULT NULL,
  PRIMARY KEY (`ReimbursementNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reimbursement`
--

LOCK TABLES `reimbursement` WRITE;
/*!40000 ALTER TABLE `reimbursement` DISABLE KEYS */;
/*!40000 ALTER TABLE `reimbursement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `s_Class` varchar(45) DEFAULT NULL,
  `club` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `NativePlace` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `ManagerClass` varchar(45) DEFAULT NULL,
  `info` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `WorkState` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `NativePlace` varchar(45) DEFAULT NULL,
  `EntryTime` date DEFAULT NULL,
  `Register` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,'LX','admin',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-07  8:30:26
