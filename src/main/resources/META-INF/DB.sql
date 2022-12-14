CREATE DATABASE J2H_KIMOCHI
USE J2H_KIMOCHI
GO
CREATE TABLE USERS (
	ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MA VARCHAR(20) UNIQUE,
	TEN NVARCHAR(50),
	MATKHAU VARCHAR(MAX)
)

CREATE TABLE CATEGORY (
	ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MA VARCHAR(20) UNIQUE,
	TEN NVARCHAR(50)
)

CREATE TABLE PRODUCT (
	ID UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
	MA VARCHAR(20) UNIQUE,
	TEN NVARCHAR(50),
	SOLUONG INT,
	DONGIA DECIMAL(20,0),
	ID_CATE UNIQUEIDENTIFIER
)

ALTER TABLE PRODUCT ADD FOREIGN KEY (ID_CATE) REFERENCES CATEGORY (ID)

INSERT INTO USERS (MA, TEN, MATKHAU) VALUES ('admin',N'Adminstrator','123')
INSERT INTO USERS (MA, TEN, MATKHAU) VALUES ('kimchi01',N'Kim Chi','123')
INSERT INTO USERS (MA, TEN, MATKHAU) VALUES ('kimchi02',N'Kim Cheese','123')

INSERT INTO CATEGORY (MA,TEN) VALUES ('cate01',N'Quần')
INSERT INTO CATEGORY (MA,TEN) VALUES ('cate02',N'Áo')
INSERT INTO CATEGORY (MA,TEN) VALUES ('cate03',N'Giày')

INSERT INTO PRODUCT (MA, TEN, SOLUONG, DONGIA, ID_CATE) VALUES ('product01',N'Short',5,3000,'79379DBE-14C4-4F93-9CC2-DBFA03BB7240')
INSERT INTO PRODUCT (MA, TEN, SOLUONG, DONGIA, ID_CATE) VALUES ('product02',N'Jeans',8,4500,'F1C37E34-52EA-43EC-9636-24F2F7CB1EE3')
INSERT INTO PRODUCT (MA, TEN, SOLUONG, DONGIA, ID_CATE) VALUES ('product03',N'Baggy',9,6000,'F1C37E34-52EA-43EC-9636-24F2F7CB1EE3')

SELECT * FROM USERS
SELECT * FROM CATEGORY
SELECT * FROM PRODUCT