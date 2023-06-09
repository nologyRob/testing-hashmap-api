CREATE DATABASE eras;
USE eras;
ALTER TABLE era MODIFY era_description varchar(1000);
CREATE TABLE album (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  genre VARCHAR(255) NOT NULL,
  rating DECIMAL(3,1) NOT NULL,
  cover VARCHAR(255) NOT NULL,
  peakChartPosition INTEGER NOT NULL,
  numOfSongs INTEGER NOT NULL,
  dateReleased DATE NOT NULL
);

ALTER TABLE album MODIFY COLUMN dateReleased DATE DEFAULT NULL;