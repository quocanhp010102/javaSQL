-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2023 at 05:46 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlnhadat`
--

-- --------------------------------------------------------

--
-- Table structure for table `chusohuu`
--

CREATE TABLE `chusohuu` (
  `MaChuSoHuu` int(11) NOT NULL,
  `TenChuSoHuu` varchar(255) DEFAULT NULL,
  `SoThua` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chusohuu`
--

INSERT INTO `chusohuu` (`MaChuSoHuu`, `TenChuSoHuu`, `SoThua`) VALUES
(1, 'dsafasf', 2),
(2, 'dsfsdfd', 3),
(3, 'quocanh', 2);

-- --------------------------------------------------------

--
-- Table structure for table `loaidat`
--

CREATE TABLE `loaidat` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loaidat`
--

INSERT INTO `loaidat` (`MaLoai`, `TenLoai`) VALUES
(1, 'dat tho cu'),
(2, 'dat ruong'),
(3, 'dat thanh thi');

-- --------------------------------------------------------

--
-- Table structure for table `nguoidung`
--

CREATE TABLE `nguoidung` (
  `id` int(11) NOT NULL,
  `TenND` varchar(50) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nguoidung`
--

INSERT INTO `nguoidung` (`id`, `TenND`, `Password`, `role`) VALUES
(1, 'minh hoang', 'a', 2),
(2, 'quoc22', 'b', 2),
(3, 'anh quoc', 'anhvip pro', 2),
(4, 'anh quoc anh', 'aaaaaa', 2),
(11, 'viet tien', 'asadas', 2),
(12, '2dsf', '1111', 2),
(999, 'Admin', '1234', 1);

-- --------------------------------------------------------

--
-- Table structure for table `thongtindat`
--

CREATE TABLE `thongtindat` (
  `SoThua` int(11) NOT NULL,
  `DienTich` float DEFAULT NULL,
  `MaLoai` int(11) DEFAULT NULL,
  `GiapRanh` varchar(255) DEFAULT NULL,
  `SoDo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thongtindat`
--

INSERT INTO `thongtindat` (`SoThua`, `DienTich`, `MaLoai`, `GiapRanh`, `SoDo`) VALUES
(1, 100, 1, 'hung yen', 'da co'),
(2, 100, 1, 'hung yen', 'da co'),
(3, 100, 1, 'hung yen', 'da co'),
(4, 111, 1, 'dfsasdfadsfds', 'chua co');

-- --------------------------------------------------------

--
-- Table structure for table `thue`
--

CREATE TABLE `thue` (
  `MaThue` int(11) NOT NULL,
  `Nam` int(11) DEFAULT NULL,
  `GhiChu` varchar(255) DEFAULT NULL,
  `SoThua` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chusohuu`
--
ALTER TABLE `chusohuu`
  ADD PRIMARY KEY (`MaChuSoHuu`),
  ADD KEY `SoThua` (`SoThua`);

--
-- Indexes for table `loaidat`
--
ALTER TABLE `loaidat`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Indexes for table `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `thongtindat`
--
ALTER TABLE `thongtindat`
  ADD PRIMARY KEY (`SoThua`),
  ADD KEY `MaLoai` (`MaLoai`);

--
-- Indexes for table `thue`
--
ALTER TABLE `thue`
  ADD PRIMARY KEY (`MaThue`),
  ADD KEY `SoThua` (`SoThua`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chusohuu`
--
ALTER TABLE `chusohuu`
  ADD CONSTRAINT `chusohuu_ibfk_1` FOREIGN KEY (`SoThua`) REFERENCES `thongtindat` (`SoThua`);

--
-- Constraints for table `thongtindat`
--
ALTER TABLE `thongtindat`
  ADD CONSTRAINT `thongtindat_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `loaidat` (`MaLoai`);

--
-- Constraints for table `thue`
--
ALTER TABLE `thue`
  ADD CONSTRAINT `thue_ibfk_1` FOREIGN KEY (`SoThua`) REFERENCES `thongtindat` (`SoThua`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
