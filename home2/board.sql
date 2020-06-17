-- 게시판 테이블 생성
create table board(
board_no number primary key,
board_head char(6) check(board_head in ('정보','공지','유머')),
board_title varchar2(300) not null,
board_writer references member(member_id) on delete set null,
board_content varchar2(4000) not null,
board_date date default sysdate not null,
board_read number default 0 not null
);

-- 게시판 시퀀스 생성
create sequence board_seq nocache;
