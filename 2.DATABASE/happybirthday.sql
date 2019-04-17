-- phpMyAdmin SQL Dump
-- version 3.1.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 01, 2016 at 09:36 AM
-- Server version: 5.1.32
-- PHP Version: 5.2.9-1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `happybirthday`
--

-- --------------------------------------------------------

--
-- Table structure for table `addm`
--

CREATE TABLE IF NOT EXISTS `addm` (
  `S.NO` int(20) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `PHONE` varchar(50) NOT NULL,
  `EMAIL_ID` varchar(50) NOT NULL,
  `D_O_B` date NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  PRIMARY KEY (`S.NO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `addm`
--


-- --------------------------------------------------------

--
-- Table structure for table `branch1`
--

CREATE TABLE IF NOT EXISTS `branch1` (
  `S.NO` varchar(20) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `PHONE` varchar(50) NOT NULL,
  `EMAIL_ID` varchar(50) NOT NULL,
  `D_O_B` varchar(50) NOT NULL,
  `YEAR` varchar(50) NOT NULL,
  PRIMARY KEY (`S.NO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `branch1`
--

INSERT INTO `branch1` (`S.NO`, `NAME`, `PHONE`, `EMAIL_ID`, `D_O_B`, `YEAR`) VALUES
('1', 'Ashish', '7814331944', 'ashishojha000000@gmail.com', '07 08', '1995'),
('2', 'Pranshul', '7696198301', 'pranshul2480@gmail.com', '15 06', '1995'),
('3', 'Deepanshu', '7814331944', 'ashishojha000000@gmail.com', '15 09', '1995'),
('4', 'mridula', '7814331944', 'ashishojha000000@gmail.com', '15 06', '1995'),
('5', 'rashima', '09041753626', 'ashishojha000000@gmail.com', '15 06', '1995');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `SNO` varchar(50) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  PRIMARY KEY (`SNO`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`SNO`, `USERNAME`, `PASSWORD`) VALUES
('1', 'ADMIN1', 'ADMIN1'),
('2', 'BRANCH2', 'BRANCH2'),
('3', 'BRANCH3', 'BRANCH3'),
('4', 'BRANCH4', 'BRANCH4'),
('5', 'BRANCH5', 'BRANCH5');
