--게시글 첨부파일을 저장하기 위한 테이블(댓글과 비슷)

--파일번호 : 기본키(시퀀스)
--파일이름 : 사용자가 올린이름(실제 파일이름 아님)
--파일크기 : 숫자(long)
--파일유형 : image / png와 같은 형태
--게시글번호 : 외래키(게시글 삭제시 같이 삭제)

CREATE TABLE board_file(
board_file_no NUMBER PRIMARY KEY,
board_file_name VARCHAR2(256) NOT NULL,
board_file_size NUMBER NOT NULL Check(board_file_size > 0),
board_file_type CHAR(10) NOT NULL,
board_orign REFERENCES board(board_no) ON DELETE CASCADE
);

CREATE SEQUENCE board_file_seq NOCACHE;