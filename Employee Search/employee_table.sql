-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2021 at 08:06 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee_table`
--

CREATE TABLE `employee_table` (
  `sno` int(2) NOT NULL,
  `ename` text NOT NULL,
  `eid` varchar(5) NOT NULL,
  `edept` varchar(25) NOT NULL,
  `esal` int(6) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phno` varchar(14) NOT NULL,
  `eadd` text NOT NULL,
  `doj` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee_table`
--

INSERT INTO `employee_table` (`sno`, `ename`, `eid`, `edept`, `esal`, `email`, `phno`, `eadd`, `doj`) VALUES
(1, 'Rajarshi SinhaRoy', 'E5001', 'Cyber Security', 60000, 'rajarshi921@gmail.com', '+91-7001138729', 'Tarakeswar, Hooghly, West Bengal, Pin - 712410', '2020-07-01 11:05:00'),
(2, 'Ajay Kumar Dey', 'E5002', 'IT Tech', 45000, 'ajaykdey88@gmail.com', '+91-9678601240', 'Block-A, Lake Town, Kolkata, West Bengal', '2014-04-16 12:36:00'),
(3, 'Swarnendu Sarkhel', 'E5003', 'SAP Developer', 50000, 'swarnendusarkhel@gmail.com', '+91-8698241570', 'Gurap, Hooghly, West Bengal', '2019-05-13 10:46:00'),
(4, 'Arnab Kumar Jana', 'E5004', 'Software Developer', 52000, 'arnabkumarjana@gmail.com', '+91-8772413506', 'Singur, Hooghly, West Bengal', '2017-10-02 14:30:20'),
(5, 'Ayan Khan', 'E5005', 'Data Analist', 35000, 'ayankhan98@gmail.com', '+91-7001247316', 'Rishra, Hooghly, West Bengal', '2020-06-18 11:26:56'),
(6, 'Sagarmoy Ganguly', 'E5006', 'Business Executive', 56000, 'smartsagarmoy01@gmail.com', '+91-8415670232', 'Rajbati, Burdwan, West Bengal', '2021-05-05 11:32:40'),
(7, 'Anusmita Raydixit', 'E5007', 'SAP Developer', 51000, 'anusmitaraydixit@gmail.com', '+91-7638231202', 'Behala, Kolkata, West Bengal', '2019-06-13 10:45:00'),
(8, 'Megha Dutta', 'E5008', 'IT Tech', 35000, 'duttamegha@gmail.com', '+91-8558624571', 'Siliguri, Darjeeling, West Bengal', '2016-04-23 12:25:00'),
(9, 'Arighna Chakraborty', 'E5009', 'Senior Developer', 70000, 'rijuop653@gmail.com', '+91-9732685523', 'Hindmotor, Hooghly, West Bengal', '2020-02-18 10:26:00'),
(10, 'Palash Dutta Banik', 'E5010', 'Asst. System Eng. Trainee', 27000, 'palashduttabanik@gmail.com', '+91-8676254730', 'Nabadwip, Nadia, West Bengal', '2021-11-23 10:34:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_table`
--
ALTER TABLE `employee_table`
  ADD PRIMARY KEY (`sno`),
  ADD UNIQUE KEY `eid` (`eid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_table`
--
ALTER TABLE `employee_table`
  MODIFY `sno` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
