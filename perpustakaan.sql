-- MySQL dump 10.16  Distrib 10.1.9-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: perpustakaan
-- ------------------------------------------------------
-- Server version	10.1.9-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` varchar(8) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(35) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`id`) REFERENCES `akun` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('20180001','Budi','budi@perpus.itera.ac.id');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `akun`
--

DROP TABLE IF EXISTS `akun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `akun` (
  `id` varchar(8) NOT NULL,
  `pass` varchar(25) NOT NULL,
  `kode` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `akun`
--

LOCK TABLES `akun` WRITE;
/*!40000 ALTER TABLE `akun` DISABLE KEYS */;
INSERT INTO `akun` VALUES ('14117003','123','2'),('20180001','123','1');
/*!40000 ALTER TABLE `akun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buku`
--

DROP TABLE IF EXISTS `buku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buku` (
  `isbn` varchar(20) DEFAULT NULL,
  `penerbit` varchar(30) NOT NULL,
  `id_buku` varchar(8) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `posisi` varchar(10) NOT NULL,
  `status` varchar(15) NOT NULL,
  `penulis` varchar(20) NOT NULL,
  `kategori` varchar(10) NOT NULL,
  `deskripsi` varchar(218) NOT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buku`
--

LOCK TABLES `buku` WRITE;
/*!40000 ALTER TABLE `buku` DISABLE KEYS */;
INSERT INTO `buku` VALUES ('978-602-1514-91-7','PT Garuda Food','00001','Filosofi Kacang','A01','tersedia','Franklin','Kuliah','Buku yang membahas tentang fisiologi dari kacang berserta familinya .'),('978-602-1514-91-8','PT Krakatau Steel','00002','Antara Besi dan Baja','A01','tersedia','Dino','Kuliah','Pembahasan dari besi dan baja berserta pendalamannya.'),('978-602-1514-91-9','Faqqih Publisher','00003','Menjadi Wibu','A02','tersedia','Faqqih','Novel','Perjalanan Faqqih dari manusia normal menjadi seorang wibu.'),('978-602-1514-91-6','PT Pratama Rizki','00004','Boyband Is My Life','A02','tersedia','Tama','Novel','Kisah dari seorang Tama yang bercita cita menjadi seorang anggota boyband.'),('978-602-1514-91-5','Iqbal Publish Company','00005','Web Program','A03','tersedia','Iqbal','Kuliah','Pembahasan dan pendalaman dari pembuatan dan pemrograman web.');
/*!40000 ALTER TABLE `buku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` varchar(8) DEFAULT NULL,
  `nama` varchar(50) NOT NULL,
  `prodi` varchar(20) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  KEY `id` (`id`),
  CONSTRAINT `member_ibfk_1` FOREIGN KEY (`id`) REFERENCES `akun` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('14117003','M Iqbal Revantama','Teknik Informatika','kykylizaro98@gmail.com');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peminjaman`
--

DROP TABLE IF EXISTS `peminjaman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peminjaman` (
  `no_peminjaman` varchar(8) NOT NULL,
  `id` varchar(8) DEFAULT NULL,
  `tanggal_pinjam` date NOT NULL,
  `tanggal_kembali` date NOT NULL,
  `id_buku` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`no_peminjaman`),
  KEY `id` (`id`),
  KEY `id_buku` (`id_buku`),
  CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`id`) REFERENCES `akun` (`id`),
  CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`) ON UPDATE CASCADE,
  CONSTRAINT `peminjaman_ibfk_3` FOREIGN KEY (`id`) REFERENCES `member` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `peminjaman_ibfk_4` FOREIGN KEY (`id`) REFERENCES `akun` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peminjaman`
--

LOCK TABLES `peminjaman` WRITE;
/*!40000 ALTER TABLE `peminjaman` DISABLE KEYS */;
INSERT INTO `peminjaman` VALUES ('1','14117003','2019-05-14','2019-05-21','00001'),('2','14117003','2019-05-14','2019-05-21','00002'),('3','14117003','2019-05-14','2019-05-21','00004'),('5','14117003','2019-05-14','2019-05-21','00004');
/*!40000 ALTER TABLE `peminjaman` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-14  1:55:54
