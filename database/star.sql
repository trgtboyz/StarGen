-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2017 at 08:35 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `star`
--

-- --------------------------------------------------------

--
-- Table structure for table `age`
--

CREATE TABLE `age` (
  `Id` int(11) NOT NULL,
  `Age` char(1) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `Name` varchar(30) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `Description` text CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `age`
--

INSERT INTO `age` (`Id`, `Age`, `Name`, `Description`) VALUES
(1, 'Y', 'Yellow Dwarf', 'Yellow dwarfs are small, main sequence stars.'),
(2, 'Y', 'Red Dwarf', 'A red dwarf is a small, cool, very faint, main sequence star and the most common type.'),
(3, 'O', 'Red Giant', 'A red giant is a relatively old star whose diameter is about 100 times bigger than it was originally, and had become cooler.'),
(4, 'O', 'Blue Giant', 'Blue stars are large and compact, this causes them to burn their fuel quickly which in turn makes their temperature very hot.'),
(5, 'O', 'Super Giant', 'High mass stars at the end of their lives.'),
(6, 'D', 'White Dwarf', 'A white dwarf is a small, very dense, hot star that is made mostly of carbon and are usually the dying remnants of an exploded star.'),
(7, 'D', 'Neutron Star', 'If a star has between 1.35 and 2.1 times the mass of the Sun, it doesn’t form a white dwarf when it dies. Instead, the star dies in a catastrophic supernova explosion, and the remaining core becomes a neutron star.'),
(8, 'D', 'Black Hole', 'When a large star runs out of fuel it can no longer support its heavy weight. The pressure from the star\'s massive layers of hydrogen press down forcing the star to get smaller and smaller and smaller.  Eventually the star will get even smaller than an atom. A black hole\'s gravity becomes so powerful that anything, including light that gets too close, gets pulled in.');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `RegisterNumber` int(11) NOT NULL,
  `Name` varchar(30) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `Password` tinytext CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `temperature`
--

CREATE TABLE `temperature` (
  `Id` int(11) NOT NULL,
  `StarType` char(1) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `Color` varchar(30) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `AST` varchar(30) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `AM` float NOT NULL,
  `AR` float NOT NULL,
  `AL` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temperature`
--

INSERT INTO `temperature` (`Id`, `StarType`, `Color`, `AST`, `AM`, `AR`, `AL`) VALUES
(1, 'O', 'Blue', 'Over 7500K', 50, 10, 100000),
(2, 'B', 'Blue', 'Over 7500K', 10, 5, 1000),
(3, 'A', 'Blue', 'Over 7500K', 2, 1.7, 20),
(4, 'F', 'Bluish White', '5000-7500K', 1.5, 1.3, 4),
(5, 'G', 'Yellowish White', '5000-7500K', 1, 1, 1),
(6, 'K', 'Reddish Orange', 'Under 5000K', 0.7, 0.8, 0.2),
(7, 'M', 'Red', 'Under 5000K', 0.2, 0.3, 0.01);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `age`
--
ALTER TABLE `age`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`RegisterNumber`),
  ADD UNIQUE KEY `RegisterNumber` (`RegisterNumber`);

--
-- Indexes for table `temperature`
--
ALTER TABLE `temperature`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `age`
--
ALTER TABLE `age`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `temperature`
--
ALTER TABLE `temperature`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
