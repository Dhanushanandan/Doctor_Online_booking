-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2024 at 09:13 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dob`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment_details`
--

CREATE TABLE `appointment_details` (
  `ID` varchar(100) NOT NULL,
  `Patient_Name` varchar(100) NOT NULL,
  `Contect_No` int(10) NOT NULL,
  `Doctor_Name` varchar(100) NOT NULL,
  `Appointment_Date` varchar(100) NOT NULL,
  `Appointment_Status` varchar(100) NOT NULL,
  `UserID` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `appointment_details`
--

INSERT INTO `appointment_details` (`ID`, `Patient_Name`, `Contect_No`, `Doctor_Name`, `Appointment_Date`, `Appointment_Status`, `UserID`) VALUES
('004', 'veera', 712051203, 'ert', 'Mar 14, 2024', 'Completed', '006'),
('005', 'ert', 712051203, 'veera', 'Mar 14, 2024', 'Canceled', '007'),
('006', 'asd', 712051203, 'veera', 'Mar 13, 2024', 'On Process', '002');

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `ID` varchar(100) NOT NULL,
  `FullName` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Mobile` int(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Specialist` varchar(100) DEFAULT NULL,
  `Type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`ID`, `FullName`, `Password`, `Address`, `Mobile`, `Email`, `Specialist`, `Type`) VALUES
('002', 'Dark', '123', 'Kandy', 712051203, 'danu@gmail.com', '', 'User'),
('003', 'DarkPhoenix', '123', 'Nawalapitiya', 712051203, 'danushanandan@gmail.com', '', 'User'),
('020', 'asd', '123', 'Nawalapitiya', 752051203, 'da', '', 'User'),
('1', '1', '123', '1', 123456789, '1', '', 'User'),
('2', '2', '2', '2', 712051203, '2', '', 'Admin'),
('3', '3', '3', '3', 123456789, '3', '', 'Admin'),
('4', '4', '4', '4', 123456789, '4', '', 'Admin'),
('5', '6', '5', '6', 123456789, '6', '6', 'Doctor'),
('6', '6', '6', '6', 123456789, '6', '', 'Admin'),
('7', '7', '7', '7', 123456789, 'danu@gmail.com', '', 'User'),
('admin', 'admin', 'admin', 'admin', 0, 'admin@gmail.com', '', 'Admin'),
('doctor', 'doctor', 'doctor', 'doctor', 712051203, 'doctor', 'doctor', 'Doctor'),
('user', 'user', 'user', 'user', 712051203, 'user@gmail.com', '', 'User');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_available`
--

CREATE TABLE `doctor_available` (
  `ID` varchar(100) NOT NULL,
  `Doctor_name` varchar(100) NOT NULL,
  `Available_status` varchar(100) NOT NULL,
  `Available_Date` varchar(100) NOT NULL,
  `Specialist` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor_available`
--

INSERT INTO `doctor_available` (`ID`, `Doctor_name`, `Available_status`, `Available_Date`, `Specialist`) VALUES
('003', 'veera', 'Not_Available', 'Mar 20, 2024', 'Lungs');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment_details`
--
ALTER TABLE `appointment_details`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `doctor_available`
--
ALTER TABLE `doctor_available`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
