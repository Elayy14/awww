-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2024 at 11:44 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblassign`
--

CREATE TABLE `tblassign` (
  `u_id` int(50) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(150) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblassign`
--

INSERT INTO `tblassign` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_type`, `u_status`) VALUES
(120, 'qwe', 'qwe', 'qwe', 'qwe', 'z64mKIvYLhqXZpt3IEcM85Toew5TvdflhAVYBcxjAB8=', 'User', 'Active'),
(121, 'payla', 'payla', 'payla', 'payla', 'BVe/Rl9Dy46gXVl6p4poQXJx3DEPV7pOAQEo6gHvTX8=', 'Admin', 'Active'),
(127, 'elay', 'elay', 'elay', 'elay', 'Z5Ctui/29tvG5iwlsFcFFP/BA9VxL5E/ty9fVMMEGLQ=', 'Admin', 'Active'),
(128, 'elay', 'elay', 'elayy', 'elayy', 'Z5Ctui/29tvG5iwlsFcFFP/BA9VxL5E/ty9fVMMEGLQ=', 'User', 'Active'),
(129, 'ewan', 'ewan', 'ewan', 'ewan', 'Km/AlI9Ow78iNz9GBfu9v/R2wfsj90r/YNwhbbtzBBs=', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblassign`
--
ALTER TABLE `tblassign`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblassign`
--
ALTER TABLE `tblassign`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=130;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
