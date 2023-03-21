﻿# SCADASimpleAPI_MYSQL_GET_POST_REQUEST
 
 CREATE TABLE `scadalog` (
 
  `id` int(11) NOT NULL,
  
  `devices` varchar(255) DEFAULT NULL,
  
  `status` int(11) DEFAULT NULL,
  
  `measurementvalue` varchar(255) DEFAULT NULL,
  
  `timestamp` timestamp NULL DEFAULT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--
-- Dumping data for table `scadalog`
--

INSERT INTO `scadalog` (`id`, `devices`, `status`, `measurementvalue`, `timestamp`) VALUES

(1, 'Water Pump', 0, '0.35Pa', '2023-03-21 06:14:49'),

(2, 'Water Pump 2', 1, '0.5 Pa', '2023-03-21 06:16:48'),

(3, 'Water Pump', 0, '0.35Pa', '2023-03-21 06:14:49'),

(4, 'Water Pump', 0, '0.35Pa', '2023-03-21 06:14:49'),

(5, 'Water Pump', 0, '0.35Pa', '2023-03-21 06:14:49');

 
 MYSQL Data INSERT DATA
 
 INSERT INTO `scadalog`(`id`, `devices`, `status`, `measurementvalue`, `timestamp`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]')
 
 GET REQUEST
 
 http://localhost:8081/SCADALog
 
 POST REQUEST
 

 http://localhost:8081/PostSCADA

{

"id":5,

"devices":"Water Pump",

"status":0,"measurementvalue":"0.35Pa",

"timestamp":"2023-03-21T14:14:49.000+00:00"

}
