CREATE TABLE IF NOT EXISTS colors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    color VARCHAR(7) NOT NULL,
    pantone VARCHAR(7) NOT NULL,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 1', '#FF5733', '12-3456', '2023-08-15 08:00:00', '2023-08-17 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 2', '#45A4F2', '98-7654', '2023-08-03 08:00:00', '2023-08-05 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 3', '#C0FFEE', '11-1111', '2023-09-20 08:00:00', '2023-09-25 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 4', '#123456', '23-9876', '2023-09-02 08:00:00', '2023-09-10 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 5', '#FACADE', '34-5678', '2023-08-20 08:00:00', '2023-08-28 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 6', '#AABBCC', '67-1234', '2023-08-06 08:00:00', '2023-08-08 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 7', '#0099FF', '45-6789', '2023-09-15 08:00:00', '2023-09-29 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 8', '#FF9900', '12-3456', '2023-08-15 08:00:00', '2023-08-17 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 9', '#660066', '98-7654', '2023-09-01 08:00:00', '2023-09-08 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 10', '#FF5733', '45-6789', '2023-09-10 08:00:00', '2023-09-12 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 11', '#45A4F2', '98-7654', '2023-08-18 08:00:00', '2023-09-25 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 12', '#C0FFEE', '11-1111', '2023-08-13 08:00:00', '2023-09-15 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 13', '#123456', '23-9876', '2023-08-27 08:00:00', '2023-09-11 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 14', '#FACADE', '34-5678', '2023-08-13 08:00:00', '2023-08-22 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 15', '#AABBCC', '67-1234', '2023-09-23 08:00:00', '2023-09-26 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 16', '#0099FF', '45-6789', '2023-08-04 08:00:00', '2023-09-07 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 17', '#FF9900', '12-3456', '2023-08-30 08:00:00', '2023-09-02 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 18', '#660066', '98-7654', '2023-08-19 08:00:00', '2023-09-20 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 19', '#FF5733', '45-6789', '2023-09-19 08:00:00', '2023-09-23 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 20', '#45A4F2', '98-7654', '2023-08-14 08:00:00', '2023-09-22 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 21', '#C0FFEE', '11-1111', '2023-09-03 08:00:00', '2023-09-24 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 22', '#123456', '23-9876', '2023-08-07 08:00:00', '2023-09-02 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 23', '#FACADE', '34-5678', '2023-09-17 08:00:00', '2023-09-29 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 24', '#AABBCC', '67-1234', '2023-09-03 08:00:00', '2023-09-21 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 25', '#0099FF', '45-6789', '2023-08-14 08:00:00', '2023-08-24 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 26', '#FF9900', '12-3456', '2023-08-11 08:00:00', '2023-09-06 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 27', '#660066', '98-7654', '2023-08-01 08:00:00', '2023-08-11 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 28', '#FF5733', '45-6789', '2023-08-07 08:00:00', '2023-08-23 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 29', '#45A4F2', '98-7654', '2023-09-23 08:00:00', '2023-09-29 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 30', '#C0FFEE', '11-1111', '2023-08-21 08:00:00', '2023-09-19 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 31', '#123456', '23-9876', '2023-08-16 08:00:00', '2023-09-04 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 32', '#FACADE', '34-5678', '2023-08-18 08:00:00', '2023-08-26 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 33', '#AABBCC', '67-1234', '2023-08-29 08:00:00', '2023-08-31 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 34', '#0099FF', '45-6789', '2023-08-21 08:00:00', '2023-08-28 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 35', '#FF9900', '12-3456', '2023-08-25 08:00:00', '2023-09-16 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 36', '#660066', '98-7654', '2023-09-16 08:00:00', '2023-09-21 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 37', '#FF5733', '45-6789', '2023-09-04 08:00:00', '2023-09-27 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 38', '#45A4F2', '98-7654', '2023-09-12 08:00:00', '2023-09-26 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 39', '#C0FFEE', '11-1111', '2023-08-24 08:00:00', '2023-09-18 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 40', '#123456', '23-9876', '2023-09-14 08:00:00', '2023-09-28 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 41', '#FACADE', '34-5678', '2023-08-14 08:00:00', '2023-09-08 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 42', '#AABBCC', '67-1234', '2023-08-09 08:00:00', '2023-09-02 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 43', '#0099FF', '45-6789', '2023-09-05 08:00:00', '2023-09-07 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 44', '#FF9900', '12-3456', '2023-08-25 08:00:00', '2023-09-24 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 45', '#660066', '98-7654', '2023-08-19 08:00:00', '2023-09-09 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 46', '#FF5733', '45-6789', '2023-08-12 08:00:00', '2023-09-11 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 47', '#45A4F2', '98-7654', '2023-08-23 08:00:00', '2023-09-22 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 48', '#C0FFEE', '11-1111', '2023-08-04 08:00:00', '2023-08-30 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 49', '#123456', '23-9876', '2023-09-13 08:00:00', '2023-09-28 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 50', '#FACADE', '34-5678', '2023-08-23 08:00:00', '2023-09-27 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 51', '#AABBCC', '67-1234', '2023-09-21 08:00:00', '2023-09-26 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 52', '#0099FF', '45-6789', '2023-08-16 08:00:00', '2023-09-05 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 53', '#FF9900', '12-3456', '2023-08-05 08:00:00', '2023-09-28 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 54', '#660066', '98-7654', '2023-09-13 08:00:00', '2023-09-17 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 55', '#FF5733', '45-6789', '2023-09-06 08:00:00', '2023-09-27 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 56', '#45A4F2', '98-7654', '2023-08-10 08:00:00', '2023-08-31 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 57', '#C0FFEE', '11-1111', '2023-08-01 08:00:00', '2023-08-20 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 58', '#123456', '23-9876', '2023-08-23 08:00:00', '2023-09-18 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 59', '#FACADE', '34-5678', '2023-08-05 08:00:00', '2023-09-05 08:00:00');
INSERT INTO colors (name, color, pantone, created_on, last_updated_on) VALUES ('Color 60', '#AABBCC', '67-1234', '2023-09-18 08:00:00', '2023-09-27 08:00:00');