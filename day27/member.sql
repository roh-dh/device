CREATE TABLE member();
member_id varchar2(20) PRIMARY key,
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