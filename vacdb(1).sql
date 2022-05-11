-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2022 at 11:04 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vacdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `Name` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `NIC` char(15) NOT NULL,
  `gender` char(10) NOT NULL,
  `District` varchar(50) NOT NULL,
  `MOH` varchar(50) NOT NULL,
  `Serial` char(50) NOT NULL,
  `1stdose` char(20) NOT NULL,
  `1ddate` varchar(20) NOT NULL,
  `1dbatch` char(20) NOT NULL,
  `2nddose` char(20) NOT NULL,
  `2ddate` varchar(20) NOT NULL,
  `2dbatch` char(20) NOT NULL,
  `3rddose` char(20) NOT NULL,
  `3ddate` varchar(20) NOT NULL,
  `3dbatch` char(20) NOT NULL,
  `NO` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `records`
--

INSERT INTO `records` (`Name`, `address`, `DOB`, `NIC`, `gender`, `District`, `MOH`, `Serial`, `1stdose`, `1ddate`, `1dbatch`, `2nddose`, `2ddate`, `2dbatch`, `3rddose`, `3ddate`, `3dbatch`, `NO`) VALUES
('A.U.Wickramasingha', 'Elpitiya,Galle', '1969/02/22', '694017723V', 'Male', 'Galle', 'Elpitiya', 'A88', 'Sputnic V', '2021/06/13', 'B20210696', 'Sputnic V', '2021/09/20', 'B20210933', 'Pfizer', '2021/12/27', 'B20211245', 6),
('P.U.Yasarathna', 'Rakwana,Rathnapura', '1975.05.18', '751201478V', 'Male', 'Rathnapura', 'Kuruwita', 'D87', 'Sinopharm', '2021.08.10', 'B20210841', 'Sinopharm', '2021.12.17', 'B20211255', 'Pfizer', '2022.03.20', 'B20220381', 7),
('S.T.Wijerathna', 'Ranwala,Kagalle', '1997.11.14', '971027894V', 'Female', 'Kegalle', 'Kegalle', 'C12', 'Astrazenica', '2021.07.21', 'B20210703', 'Astrazenica', '2021.11.05', 'B20211163', 'Pfizer', '2022.03.25', 'B20220351', 8),
('D.N.Fernando', 'Maeliya,Kurunegala', '1958.08.17', '587033650V', 'Female', 'Kurunegala', 'Pannala', 'F18', 'Moderna', '2021.06.23', 'B20210694', 'Moderna', '2021.11.22', 'B20211180', '-', '-', '-', 9),
('M.P.Wijesekara', 'Siddamulla,Piliyandala', '1991.05.18', '917781240V', 'Female', 'Colombo', 'Piliyandala', 'A63', 'Pfizer', '2021.06.20', 'B20210628', 'Pfizer', '2021.11.25', 'B2021167', 'Pfizer', '2022.02.09', 'B20220259', 10),
('M.M.N.Kumara', 'Ohiya,Welimada', '1999.03.08', '991145723V', 'Female', 'Badulla', 'Welimada', 'S21', 'Sinopharm', '2021.07.16', 'B20210709', 'Sinopharm', '2021.09.19', 'B20210935', 'Pfizer', '2022.04.01', 'B20220499', 11),
('D.S.Rajapaksha', 'Sippukulama,Anuradhapura', '2000.04.11', '200055842V', 'Male', 'Anuradhapura', 'Kahatagasdigililiya', 'R21', 'Sputnic V', '2021.08.26', 'B20210871', 'Sputnic V', '2022.01.08', 'B20220168', 'Pfizer', '2022.05.29', 'B20220593', 12),
('C.K.Aruthas', 'Muhavil,Killinochchi', '1998.01.08', '980154706V', 'Male', 'Kilinochchi', 'Pallai', 'W45', 'Covishield', '2021.09.02', 'B20210950', 'Covishield', '2022.02.27', 'B20220241', 'Pfizer', '2022.03.02', 'B20220373', 13),
('L.B.Jayasundara', 'Godagama,Matara', '1987.02.16', '874012547V', 'Male', 'Matara', 'Weligama', 'A55', 'Sinopharm', '2021.07.06', 'B20210788', 'Sinophrm', '2021.10.14', 'B20211012', 'Pfizer', '2022.02.14', 'B20220254', 14),
('M.D.Ekanayaka', 'Galaha,Kandy', '2001.06.01', '200122871V', 'Female', 'Kandy', 'Galaha', 'E55', 'Moderna', '2022.02.05', 'B20220267', 'Moderna', '-', '-', '-', '-', '-', 15),
('P.J.Naseem', 'Middeniya,Ambilipitiya', '1983.12.08', '832889706V', 'Male', 'Rathnapura', 'Eheliyagoda', 'Q33', 'Astrazenica', '2021.08.07', 'B20210879', 'Astrazenica', '2022.01.30', 'B20220168', '-', '-', '-', 16),
('P.S.Gamage', 'Makumbura,Homagama', '1995.03.28', '957890154V', 'Male', 'Colombo', 'Homagama', 'S20', 'Pfizer', '2021.05.19', 'B20210583', 'Pfizer', '2021.09.09', 'B20210937', 'Pfizer', '2021.12.13', 'B20221237', 17),
('L.T.Perera', 'Mainroad,Walapane', '1978.07.24', '780144528V', 'Female', 'Nuwara-Eiya', 'Walapane', 'S28', 'Moderna', '2021.09.21', 'B20210952', 'Moderna', '2021.12.06', 'B20211212', 'Pfizer', '2022.02.09', 'B20220261', 18),
('P.E.MOhamed', 'Guruthalawa,Welimada', '1997.11.06', '972066914V', 'Male', 'Badulla', 'Welimada', 'G69', 'Sinopharm', '2021.11.03', 'B20211146', 'Sinopharm', '2022.03.01', 'B20220333', '-', '-', '-', 19),
('D.S.I.Silva', 'Hiniduma,Galle', '1972.09.08', '720228769V', 'Female', 'Galle', 'Neluwa', 'F20', 'Covishield', '2021.07.12', 'B20210741', 'Covishield', '2021.11.08', 'B20211126', 'Pfizer', '2022.03.02', 'B20220375', 20),
('P.L.R.Cooray', 'Madagama,Bibile', '1999.04.17', '996570843V', 'Male', 'Monaragala', 'Bibile', 'R57', 'Astrazenica', '2021.06.14', 'B20210687', 'Astrazenica', '2021.12.08', 'B20211244', 'Pfizer', '2022.03.05', 'B20220399', 21),
('M.T.Perera', 'Naula,Matale', '1990.06.20', '904781139V', 'Female', 'Matale', 'Naula', 'C89', 'Sinovac', '2021.07.08', 'B20210780', 'Sinovac', '2021.11.06', 'B20211150', 'Pfizer', '2022.01.31', 'B20220186', 22),
('A.P.Jayathilaka', 'st.road,Kadawatha', '1982.02.01', '820147896V', 'Male', 'Gampaha', 'Gampaha', 'T58', 'Covaxin', '2021.06.11', 'B20210687', 'Covaxin', '2021.12.14', 'B20211230', '-', '-', '-', 23),
('S.S.Rathnayaka', '1st lane,Mahaoya', '2000.11.14', '200098745V', 'Female', 'Ampara', 'Mahaoya', 'A87', 'Sinopharm', '2022.01.19', 'B20220163', '-', '-', '-', '-', '-', '-', 24),
('L.R.Kumara', 'Hakmana,Matara', '1962.05.17', '627001463V', 'Male', 'Matara', 'Hakmana', 'R21', 'Sinovac', '2021.06.08', 'B20210693', 'Sinovac', '2021.09.16', 'B20210355', 'Pfizer', '2022.01.29', 'B20220183', 25),
('lk.adithya', 'papiliyana.nugegoda', '1990/01/26', '906595623v', 'Male', 'nugegoda', 'papiliyana', 'E55', 'Pfizer', '2020/01/10', 'B20200110', 'Pfizer', '2020/02/10', 'B20200210', 'Pfizer', '2020/03/10', 'B20200210', 26);

-- --------------------------------------------------------

--
-- Table structure for table `usr`
--

CREATE TABLE `usr` (
  `id` int(11) NOT NULL,
  `Uname` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usr`
--

INSERT INTO `usr` (`id`, `Uname`, `password`) VALUES
(1, 'admin', 'admin123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`NO`);

--
-- Indexes for table `usr`
--
ALTER TABLE `usr`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `NO` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `usr`
--
ALTER TABLE `usr`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
