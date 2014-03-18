--------------------------------- BOOKS ---------------------------------
CREATE TABLE BOOKS (BOOKS_PK NUMBER NOT NULL, TITLE VARCHAR2(50), 
                    ISBN VARCHAR2(25), DESCRIPTION VARCHAR2(1000), 
                    LANGUAGE VARCHAR2(25), YEAR INTEGER, PAGES NUMBER, 
                    CONSTRAINT PK_BOOKS primary key (BOOKS_PK));
                    

--------------------------------- CATEGORIES ---------------------------------
CREATE TABLE CATEGORIES ( CATEGORIES_PK NUMBER, CATEGORIES_NAME VARCHAR2(30), CREATION_DATE DATE, 
                          MODIFIED_DATE DATE, CONSTRAINT PK_CATEGORIES primary key(CATEGORIES_PK));
                          
--------------------------------- CATEGORIES_BOOKS -----------------------------
CREATE TABLE CATEGORIES_BOOKS ( CB_CATEGORIES_FK NUMBER NOT NULL, CB_BOOKS_FK NUMBER NOT NULL,
                                CONSTRAINT FK_CB_CATEGORIES foreign key(CB_CATEGORIES_FK)
                                REFERENCES CATEGORIES (CATEGORIES_PK),
                                CONSTRAINT FK_CB_BOOKS foreign key(CB_BOOKS_FK)
                                 REFERENCES BOOKS (BOOKS_PK) );

----------------------------------- CDS ---------------------------------------     
CREATE TABLE CDS ( CDS_PK number, CD_NAME varchar2(50), 
                    LABEL varchar2(25), ORIGINAL_REALEASE_DATE DATE, 
                    RELEASE_DATE DATE, NO_OF_DISC NUMERIC,
                    TOTAL_LENGTH NUMERIC, FORMAT varchar2(15),
                    ASIN varchar2(25),
                    CONSTRAINT PK_CDS primary key (CDS_PK));
                    
---------------------AVAILABLE STOCKS FOR BOOKS; CDS; VIDEOS--------------------
CREATE TABLE STOCKS ( STOCKS_PK NUMBER, STOCKS_BOOKS_FK NUMBER, STOCKS_CDS_FK NUMBER,
                      TOTAL NUMERIC, SOLD NUMERIC, CREATION_DATE DATE, LAST_CHANGED_DATE DATE,
                      CONSTRAINT FK_STOCKS_BOOKS foreign key(STOCKS_BOOKS_FK)
                      REFERENCES BOOKS (BOOKS_PK),
                      CONSTRAINT FK_STOCKS_CDS foreign key(STOCKS_CDS_FK)
                      REFERENCES CDS (CDS_PK),
                      CONSTRAINT PK_STOCKS primary key (STOCKS_PK));
                    
 --------------------------------- BASE_COUNTRY ---------------------------------
CREATE TABLE BASE_COUNTRY (
	BASE_COUNTRY_PK integer primary key,
	iso2 char(2),
	iso3 char(3),
	name_en varchar(64),
	name_fr varchar(64),
	name_de varchar(64)
);   
                    
--------------------------------- NAMES ---------------------------------
CREATE TABLE NAMES (NAMES_PK NUMBER, FIRST_NAME VARCHAR2(20), LAST_NAME VARCHAR2(20),
                    CONSTRAINT PK_NAMES primary key(NAMES_PK) );
                    
--------------------------------- ADDRESS ---------------------------------
CREATE TABLE ADDRESS (ADDRESS_PK NUMBER NOT NULL,
                      STREET_ONE VARCHAR2(20),
                      STREET_TWO VARCHAR2(20),
                      CITY VARCHAR2(20),
                      POSTAL_CODE NUMBER,
                      ADDRESS_BASE_COUNTRY_FK NUMBER,
                      PHONE NUMBER,
                      CONSTRAINT PK_ADDRESS primary key(ADDRESS_PK),
                      CONSTRAINT FK_ADDRESS_BASE_COUNTRY foreign key(ADDRESS_BASE_COUNTRY_FK)
                      REFERENCES BASE_COUNTRY (BASE_COUNTRY_PK) );   
                    
--------------------------------- AUTHORS --------------------------------------
CREATE TABLE AUTHORS (AUTHORS_PK NUMBER, BIOGRAPHIE varchar2(1000), 
                      NAMES_AUTHORS_FK NUMBER,
                     CONSTRAINT PK_AUTHORS primary key(AUTHORS_PK),
                     CONSTRAINT FK_NAMES_AUTHORS foreign key(NAMES_AUTHORS_FK)
                     REFERENCES NAMES (NAMES_PK));

--------------------------------- AUTHORS_BOOKS -----------------------------
CREATE TABLE AUTHORS_BOOKS (AB_AUTHORS_FK NUMBER NOT NULL, AB_BOOKS_FK NUMBER NOT NULL,
                                CONSTRAINT FK_AB_AUTHORS foreign key(AB_AUTHORS_FK)
                                REFERENCES AUTHORS (AUTHORS_PK),
                                CONSTRAINT FK_AB_AUTHORS_BOOKS foreign key(AB_BOOKS_FK)
                                REFERENCES BOOKS (BOOKS_PK) );
                                
                   
--------------------------------- USERS ---------------------------------
CREATE TABLE USERS (USERS_PK NUMBER NOT NULL,
                    NAMES_USERS_FK NUMBER,
                    ROLES VARCHAR2(25),
                    CREATION_DATE DATE,
                    CONSTRAINT PK_USERS primary key(USERS_PK),
                    CONSTRAINT FK_NAMES_USERS foreign key(NAMES_USERS_FK)
                    REFERENCES NAMES (NAMES_PK) );
                    
                   
--------------------------------- PASSWORDS ---------------------------------
CREATE TABLE PASSWORDS (PASSWORDS_PK NUMBER NOT NULL,
                        USERS_PASSWORDS_FK NUMBER,
                        PWD_TEXT VARCHAR2(18),
                        CONSTRAINT PK_PASSWORDS primary key(PASSWORDS_PK),
                        CONSTRAINT FK_USERS_PASSWORDS foreign key(USERS_PASSWORDS_FK)
                        REFERENCES USERS (USERS_PK) );
                    
--------------------------------- USERS_ADDRESS ---------------------------------
CREATE TABLE USERS_ADDRESS ( USERS_FK NUMBER NOT NULL, ADDRESS_FK NUMBER NOT NULL,
                                CONSTRAINT FK_USERS foreign key(USERS_FK)
                                REFERENCES USERS (USERS_PK),
                                CONSTRAINT FK_ADDRESS foreign key(ADDRESS_FK)
                                 REFERENCES ADDRESS (ADDRESS_PK) );

                     
--------------------------------- PUBLISHERS ---------------------------------
CREATE TABLE PUBLISHERS (PUBLISHER_PK NUMBER, PUBLISHER_NAME varchar2(35), 
                     BOOKS_PUBLISHERS_FK NUMBER, CONSTRAINT PK_PUBLISHER primary key(PUBLISHER_PK),
                     CONSTRAINT FK_BOOKS_PUBLISHERS foreign key(BOOKS_PUBLISHERS_FK)
                     REFERENCES BOOKS (BOOKS_PK));
 
  --------------------------------- PRICES ---------------------------------
CREATE TABLE PRICES (PRICES_PK number, COST NUMERIC(*,2),
                     BOOKS_PRICES_FK NUMBER,
                     CD_PRICES_FK NUMBER,
                     DISCOUNT NUMBER,
                     CREATION_DATE DATE,
                     CONSTRAINT PK_PRICES primary key (PRICES_PK),
                     CONSTRAINT FK_BOOKS_PRICES foreign key(BOOKS_PRICES_FK)
                     REFERENCES BOOKS (BOOKS_PK),
                     CONSTRAINT FK_CD_PRICES foreign key(CD_PRICES_FK)
                     REFERENCES CDS (CDS_PK));
                     
 --------------------------------- COMMENTS ---------------------------------
CREATE TABLE COMMENTS (COMMENTS_PK NUMBER, TEXT VARCHAR2(1000), RATING INT,
                    BOOKS_COMMENTS_FK NUMBER,
                    CDS_COMMENTS_FK NUMBER,
                    USER_COMMENTS_FK NUMBER,
                    CONSTRAINT PK_COMMENTS primary key(COMMENTS_PK),
                    CONSTRAINT FK_BOOKS_COMMENTS foreign key(BOOKS_COMMENTS_FK)
                    REFERENCES BOOKS (BOOKS_PK),
                    CONSTRAINT FK_CDS_COMMENTS foreign key(CDS_COMMENTS_FK)
                    REFERENCES CDS (CDS_PK),
                    CONSTRAINT FK_USER_COMMENTS foreign key(USER_COMMENTS_FK)
                    REFERENCES USERS (USERS_PK));

  --------------------------------- GENERES ---------------------------------
CREATE TABLE GENERES (GENERES_PK NUMBER NOT NULL, GENERES_NAME varchar2(35), 
                     DESCRIPTION varchar2(35), CDS_GENERES_FK NUMBER,
                     CONSTRAINT PK_GENERES primary key(GENERES_PK),
                     CONSTRAINT FK_CDS_GENERES foreign key(CDS_GENERES_FK)
                     REFERENCES CDS (CDS_PK));

--------------------------------- TRACKS ---------------------------------
DROP TABLE TRACKS Cascade Constraints PURGE;                     
CREATE TABLE TRACKS (TRACKS_PK NUMBER NOT NULL, TRACKS_NAME varchar2(35), 
                     DESCRIPTION varchar2(35),  LYRICS varchar2(35), PLAYTIME varchar2(16),
                     CDS_TRACKS_FK NUMBER,
                     CONSTRAINT PK_TRACKS primary key(TRACKS_PK),
                     CONSTRAINT FK_CDS_TRACKS foreign key(CDS_TRACKS_FK)
                     REFERENCES CDS (CDS_PK));

--------------------------------- BOOK_IMAGES ---------------------------------
CREATE TABLE BOOK_IMAGES ( BOOK_IMAGES_PK NUMBER NOT NULL, BOOKS_BOOK_IMAGES_FK NUMBER, IMAGES_FILENAME VARCHAR2(50), 
                           IMAGE BFILE, CREATION_DATE DATE,
                           CONSTRAINT PK_BOOK_IMAGES primary key(BOOK_IMAGES_PK),
                           CONSTRAINT FK_BOOKS_BOOK_IMAGES foreign key(BOOKS_BOOK_IMAGES_FK)
                           REFERENCES BOOKS (BOOKS_PK));  
                           
--INSERT INTO BOOK_IMAGES VALUES(1,null,'test', bfilename('test', 'C:\Users\Surendra\Desktop\books_images'),null )
SELECT * FROM BOOK_IMAGES;
                            
--------------------------------- CD_IMAGES ---------------------------------
CREATE TABLE CD_IMAGES ( CD_IMAGES_PK NUMBER, CDS_CD_IMAGES_FK NUMBER, IMAGES_FILENAME VARCHAR2(50), IMAGE BLOB,
                           CONSTRAINT PK_CD_IMAGES primary key(CD_IMAGES_PK),
                           CONSTRAINT FK_CDS_CD_IMAGES foreign key(CDS_CD_IMAGES_FK)
                           REFERENCES BOOKS (BOOKS_PK));     



                     