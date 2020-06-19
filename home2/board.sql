---------------------------------------
----회원 테이블(member)
---------------------------------------
CREATE TABLE member(
member_id varchar2(20) PRIMARY KEY,
member_pw varchar2(16) NOT NULL,
member_nick varchar2(24) NOT NULL unique,
post char(6), 
base_addr varchar2(300),
extra_addr varchar2(300),
member_birth DATE NOT NULL,
member_phone char(11) NOT NULL,
member_intro varchar2(4000),  -- 더크게 만들고싶을때 LOB(CLOB BLOB)
member_auth varchar2(9)NOT NULL check(member_auth IN ('일반','관리자','VIP')),
member_join DATE DEFAULT sysdate NOT NULL,
member_login DATE
);
SELECT * FROM member

DROP TABLE MEMBER;
INSERT INTO 

SELECT  * FROM MEMBER;
SELECT member_id FROM MEMBER WHERE member_birth =? member_nick =?


);


CREATE TABLE board(
board_no NUMBER PRIMARY KEY,
board_head char(6) CHECK(board_head in('정보','공지','유머')),
board_title varchar2(300) NOT null,
board_writer REFERENCES MEMBER(member_id) ON DELETE SET null,
board_content varchar2(4000) NOT NULL,
board_date DATE DEFAULT sysdate NOT NULL,
board_read NUMBER DEFAULT 0 NOT null
);

CREATE SEQUENCE board_seq nocache;

INSERT INTO board values(board_seq.nextval,'유머','호후호','dh93','ㅁㅁㅁ',sysdate,0) 

SELECT * FROM board

DROP TABLE board


-- 번호만 조회할 수 있는 방법
SELECT board_seq.nextval FROM dual;


CREATE TABLE reply(
reply_no NUMBER PRIMARY KEY,
reply_writer REFERENCES MEMBER(member_id) ON DELETE SET null,
reply_content varchar2(4000) NOT null,
reply_date DATE DEFAULT sysdate,
reply_origin NOT NULL REFERENCES board(board_no) ON DELETE CASCADE
);

CREATE SEQUENCE reply_seq nocache;

SELECT REPLY_SEQ.NEXTVAL FROM DUAL;

DROP TABLE reply;

SELECT * FROM MEMBER;
SELECT * FROM board;
SELECT * FROM 

-- board 테이블에 board_replycount라는 항목을 추가하겠다
ALTER TABLE BOARD ADD BOARD_replycount NUMBER;


UPDATE board SET board_replycount =0; -- null이였던것을 0으로 만든다.
COMMIT;

ALTER TABLE board MODIFY board_replycount DEFAULT 0 NOT NULL; -- NOT null을 걸어준다.

SELECT * FROM board;


--테이블 변경
truncate TABLE reply;
truncate TABLE board;
DELETE board;
COMMIT;

--항목 추가
--상위글(super_no), 그룹번호(group_no), 차수(depth)
--데이터가 없어야 추가가 가능
ALTER TABLE board drop(super_no);

ALTER TABLE BOARD ADD super_no NOT NULL
REFERENCES board(board_no) ON DELETE CASCADE;

ALTER TABLE board ADD group_no NUMBER NOT NULL;

ALTER TABLE board ADD DEPTH NUMBER NOT NULL;

SELECT * FROM board;