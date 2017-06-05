/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : oa

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-06-02 14:15:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL,
  `adminName` varchar(45) NOT NULL,
  `adminPassword` varchar(45) NOT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `AdminInfo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `CourseNo` varchar(4) NOT NULL,
  `CourseName` varchar(40) NOT NULL,
  `CourseTeacherId` tinyint(20) NOT NULL,
  `CourseIntro` varchar(100) DEFAULT NULL,
  `Credit` decimal(4,1) DEFAULT NULL,
  `ClassRoom` varchar(40) DEFAULT NULL,
  `Time` datetime(6) DEFAULT NULL,
  `CourseGrade` varchar(20) DEFAULT NULL,
  `CourseType` enum('专业课','必修课','其他') DEFAULT NULL,
  PRIMARY KEY (`CourseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('101', '计算机网络', '28', '实验课', '2.0', '煎煮10', '2017-06-07 09:10:59.000000', '软件zy1402', '专业课');

-- ----------------------------
-- Table structure for `leaders`
-- ----------------------------
DROP TABLE IF EXISTS `leaders`;
CREATE TABLE `leaders` (
  `leaders_id` int(11) NOT NULL,
  `leaderName` varchar(45) NOT NULL,
  `leaderPassword` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `ManagerDepartment` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `leaderInfo` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `WorkState` varchar(45) NOT NULL,
  `Register` varchar(45) NOT NULL,
  `EntryTime` date NOT NULL,
  `NativePlace` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  PRIMARY KEY (`leaders_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leaders
-- ----------------------------

-- ----------------------------
-- Table structure for `leave`
-- ----------------------------
DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave` (
  `LeaveNo` tinyint(4) NOT NULL,
  `ApplicantName` varchar(10) NOT NULL,
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

-- ----------------------------
-- Records of leave
-- ----------------------------

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `MessageNo` tinyint(4) NOT NULL,
  `MessageContent` varchar(100) DEFAULT NULL,
  `MessageSender` varchar(10) DEFAULT NULL,
  `MessageTaker` varchar(10) DEFAULT NULL,
  `MessageType` enum('部门','个人') NOT NULL,
  PRIMARY KEY (`MessageNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `reimbursement`
-- ----------------------------
DROP TABLE IF EXISTS `reimbursement`;
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

-- ----------------------------
-- Records of reimbursement
-- ----------------------------

-- ----------------------------
-- Table structure for `students`
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `studentId` int(11) NOT NULL,
  `studentName` varchar(45) NOT NULL,
  `studentPassword` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `class` varchar(45) NOT NULL,
  `club` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `Tel` varchar(45) NOT NULL,
  `NativePlace` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of students
-- ----------------------------

-- ----------------------------
-- Table structure for `teachers`
-- ----------------------------
DROP TABLE IF EXISTS `teachers`;
CREATE TABLE `teachers` (
  `teacherId` int(11) NOT NULL,
  `teacherName` varchar(45) NOT NULL,
  `teacherPassword` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `ManagerClass` varchar(45) DEFAULT NULL,
  `teacherInfo` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `WorkState` varchar(45) NOT NULL,
  `Tel` varchar(45) DEFAULT NULL,
  `Department` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `NativePlace` varchar(45) NOT NULL,
  `EntryTime` date NOT NULL,
  `Register` varchar(45) NOT NULL,
  PRIMARY KEY (`teacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachers
-- ----------------------------
