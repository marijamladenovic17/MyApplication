/*
SQLyog Community v12.4.1 (64 bit)
MySQL - 10.1.30-MariaDB : Database - mojaaplikacija
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mojaaplikacija` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mojaaplikacija`;

/*Table structure for table `clan` */

DROP TABLE IF EXISTS `clan`;

CREATE TABLE `clan` (
  `clanID` int(11) NOT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`clanID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `clan` */

insert  into `clan`(`clanID`,`ime`,`prezime`) values 
(1,'Dusan','Savic'),
(2,'Sladjana','Benkovic'),
(3,'Veljko','Jeremic'),
(4,'Mladen','Cudanov'),
(5,'Dusan','Barac'),
(6,'Dejan','Stojimirovic');

/*Table structure for table `drzevljanstvo` */

DROP TABLE IF EXISTS `drzevljanstvo`;

CREATE TABLE `drzevljanstvo` (
  `drzevljanstvoID` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`drzevljanstvoID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `drzevljanstvo` */

insert  into `drzevljanstvo`(`drzevljanstvoID`,`naziv`) values 
(1,'srpsko'),
(2,'bosnjacko'),
(3,'crnogorsko'),
(4,'makedonsko'),
(5,'ostalo');

/*Table structure for table `grupazadatka` */

DROP TABLE IF EXISTS `grupazadatka`;

CREATE TABLE `grupazadatka` (
  `brojGrupe` varchar(255) NOT NULL,
  `testID` int(11) DEFAULT NULL,
  PRIMARY KEY (`brojGrupe`),
  KEY `testID` (`testID`),
  CONSTRAINT `grupazadatka_ibfk_1` FOREIGN KEY (`testID`) REFERENCES `test` (`testID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grupazadatka` */

/*Table structure for table `kandidat` */

DROP TABLE IF EXISTS `kandidat`;

CREATE TABLE `kandidat` (
  `sifraPrijave` int(11) NOT NULL,
  `jmbg` varchar(255) DEFAULT NULL,
  `imeRoditelja` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `pol` varchar(255) DEFAULT NULL,
  `mobilni` varchar(255) DEFAULT NULL,
  `fiksni` varchar(255) DEFAULT NULL,
  `drzevljanstvoID` int(11) DEFAULT NULL,
  `sifraZanimanjaRoditelja` int(11) DEFAULT NULL,
  `sifraSS` int(11) DEFAULT NULL,
  `nacionalnostID` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifraPrijave`),
  KEY `drzevljanstvoID` (`drzevljanstvoID`),
  KEY `sifraZanimanjaRoditelja` (`sifraZanimanjaRoditelja`),
  KEY `sifraSS` (`sifraSS`),
  KEY `nacionalnostID` (`nacionalnostID`),
  CONSTRAINT `kandidat_ibfk_1` FOREIGN KEY (`drzevljanstvoID`) REFERENCES `drzevljanstvo` (`drzevljanstvoID`),
  CONSTRAINT `kandidat_ibfk_2` FOREIGN KEY (`sifraZanimanjaRoditelja`) REFERENCES `zanimanjeroditelja` (`sifraZanimanjaID`),
  CONSTRAINT `kandidat_ibfk_3` FOREIGN KEY (`sifraSS`) REFERENCES `srednjaskola` (`sifraSrednjeSkole`),
  CONSTRAINT `kandidat_ibfk_4` FOREIGN KEY (`nacionalnostID`) REFERENCES `nacionalnost` (`nacionalnostID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `kandidat` */

/*Table structure for table `karton` */

DROP TABLE IF EXISTS `karton`;

CREATE TABLE `karton` (
  `kartonID` int(11) NOT NULL,
  `brojKartona` int(11) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `sifraPrijaveNaKartonu` int(11) DEFAULT NULL,
  `rezultatTesta` float DEFAULT NULL,
  `brojGrupe` varchar(255) DEFAULT NULL,
  `sifraPrijave` int(11) DEFAULT NULL,
  `testID` int(11) DEFAULT NULL,
  PRIMARY KEY (`kartonID`),
  KEY `brojGrupe` (`brojGrupe`),
  KEY `testID` (`testID`),
  CONSTRAINT `karton_ibfk_1` FOREIGN KEY (`brojGrupe`) REFERENCES `grupazadatka` (`brojGrupe`),
  CONSTRAINT `karton_ibfk_2` FOREIGN KEY (`testID`) REFERENCES `test` (`testID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `karton` */

/*Table structure for table `komisija` */

DROP TABLE IF EXISTS `komisija`;

CREATE TABLE `komisija` (
  `komisjaID` int(11) NOT NULL,
  `user` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`komisjaID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `komisija` */

insert  into `komisija`(`komisjaID`,`user`,`password`) values 
(3645,'kjbvsd','hbids');

/*Table structure for table `nacionalnost` */

DROP TABLE IF EXISTS `nacionalnost`;

CREATE TABLE `nacionalnost` (
  `nacionalnostID` int(11) NOT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nacionalnostID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nacionalnost` */

insert  into `nacionalnost`(`nacionalnostID`,`naziv`) values 
(300,'Srbin'),
(301,'Bosnjak');

/*Table structure for table `rang` */

DROP TABLE IF EXISTS `rang`;

CREATE TABLE `rang` (
  `brojKartona` int(11) DEFAULT NULL,
  `rang` int(3) DEFAULT NULL,
  `brojPoena` float DEFAULT NULL,
  `redniBroj` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rang` */

/*Table structure for table `rang-lista` */

DROP TABLE IF EXISTS `rang-lista`;

CREATE TABLE `rang-lista` (
  `sifraRL` varchar(25) NOT NULL,
  `smer` varchar(255) DEFAULT NULL,
  `godina` int(4) DEFAULT NULL,
  PRIMARY KEY (`sifraRL`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rang-lista` */

/*Table structure for table `resenje` */

DROP TABLE IF EXISTS `resenje`;

CREATE TABLE `resenje` (
  `resenjeID` int(11) NOT NULL AUTO_INCREMENT,
  `rbZadatka` int(11) DEFAULT NULL,
  `odgovor` char(1) DEFAULT NULL,
  `brojGrupe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resenjeID`),
  KEY `brojGrupe` (`brojGrupe`),
  CONSTRAINT `resenje_ibfk_1` FOREIGN KEY (`brojGrupe`) REFERENCES `grupazadatka` (`brojGrupe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `resenje` */

/*Table structure for table `spajanje` */

DROP TABLE IF EXISTS `spajanje`;

CREATE TABLE `spajanje` (
  `kartonskiBroj1` int(11) NOT NULL,
  `kartonskiBroj2` int(11) NOT NULL,
  `podudarnost` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`kartonskiBroj1`,`kartonskiBroj2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `spajanje` */

/*Table structure for table `srednjaskola` */

DROP TABLE IF EXISTS `srednjaskola`;

CREATE TABLE `srednjaskola` (
  `sifraSrednjeSkole` int(11) NOT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifraSrednjeSkole`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `srednjaskola` */

insert  into `srednjaskola`(`sifraSrednjeSkole`,`naziv`) values 
(200,'Gimnazija Bora Stankovic, Vranje'),
(201,'Prva kragujevacka gimnazija'),
(202,'Ekonomska skola, Vranje');

/*Table structure for table `stavka_rang-liste` */

DROP TABLE IF EXISTS `stavka_rang-liste`;

CREATE TABLE `stavka_rang-liste` (
  `sifraRL` varchar(25) DEFAULT NULL,
  `redniBroj` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stavka_rang-liste` */

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `testID` int(11) NOT NULL,
  `nazivTesta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`testID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `test` */

/*Table structure for table `zadatak` */

DROP TABLE IF EXISTS `zadatak`;

CREATE TABLE `zadatak` (
  `kartonID` int(11) NOT NULL,
  `rbZadatka` int(11) DEFAULT NULL,
  `odgovor` char(1) DEFAULT NULL,
  PRIMARY KEY (`kartonID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `zadatak` */

/*Table structure for table `zanimanjeroditelja` */

DROP TABLE IF EXISTS `zanimanjeroditelja`;

CREATE TABLE `zanimanjeroditelja` (
  `sifraZanimanjaID` int(11) NOT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifraZanimanjaID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `zanimanjeroditelja` */

insert  into `zanimanjeroditelja`(`sifraZanimanjaID`,`naziv`) values 
(100,'penzioner'),
(101,'prosvetni radnik'),
(102,'zdravstveni radnik');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
