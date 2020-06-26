# 문제

## 다음 요구사항에 맞는 서블릿을 생성하고 실행 후 확인

- 파일명 : study.RandomServlet
- 주소 : `http://localhost:8080/study/random`
- 예상 결과 : 랜덤으로 화면에 주사위 값 1개가 출력


## 문제

다음 요구사항에 맞는 서블릿(페이지)을 생성하고 실행 후 확인

- 서블릿 : study.ScoreServlet
- 주소 : http://localhost:8080/study/score
- 요청 파라미터 : kor(국어점수:정수), eng(영어점수:정수), math(수학점수:정수)
- 예상 처리 결과 : 파라미터에 들어온 성적정보를 이용하여 평균 계산 후 출력


## 문제

다음 요구사항에 맞는 서블릿을 생성하고 실행 후 확인

- 서블릿 : study.SubwayServlet
- 주소 : http://localhost:8080/study/subway.it
- 요청 파라미터 : birth(생년월일 8자리 정수)
- 예상 처리 결과 : 파라미터에 들어온 생년월일 정보를 이용하여 지하철 요금 계산 후 출력
	- 어르신(65세이상) : 무료
	- 성인(20세이상 65세미만) : 1250원
	- 청소년(14세이상 20세미만) : 720원
	- 어린이(8세이상 14세미만) : 450원
	- 유아(8세미만) : 무료


## 문제

다음 요구사항에 맞는 서블릿을 DAO, DTO를 이용하여 구현하세요

- 이용 테이블 : study 계정의 Client 테이블
- 처리 주소 : http://localhost:8080/study/client/regist.do
- 처리 서블릿 : study.servlet.client.ClientRegistServlet
- 필요 파라미터 : DB명과 동일하게 처리
- Java Beans : ClientDao, ClientDto
- 처리 메소드 : regist
- 출력 결과 : (정상) 회원 가입 완료 출력, (이상) 서버 기록 및 사용자에게 500 알림

```sql
-------------------------------------------------------------------
-- client 테이블 및 시퀀스 생성
-------------------------------------------------------------------
CREATE TABLE client(
client_no NUMBER PRIMARY KEY,
client_id varchar2(20) NOT NULL UNIQUE,
--client_id varchar2(20) NOT NULL UNIQUE CHECK(LENGTH(client_id) BETWEEN 5 AND 20),
--client_id varchar2(20) NOT NULL UNIQUE CHECK(regexp_like(client_id, '^[a-zA-Z0-9]{5,20}$')),
client_pw varchar2(16) NOT NULL,
client_auth varchar2(12) NOT NULL CHECK(client_auth IN ('운영자', '일반회원', '특별회원')),
client_join DATE NOT NULL,
client_point NUMBER NOT NULL CHECK(client_point >= 0)
);
CREATE SEQUENCE client_seq nocache;
```

## 문제

다음 요구사항을 처리할 수 있도록 페이지를 구현하세요.

- 주소 : http://localhost:8080/study/client/list.do
- 서블릿 : study.servlet.client.ClientListServlet
- 결과 : client 테이블 목록의 데이터가 화면에 출력
- ClientDao에 getList라는 메소드를 만들고 이용할 수 있도록 구현 

## 문제

다음 요구사항에 맞도록 서블릿을 구현

주소 : http://localhost:8080/study/client/search.do
파라미터 : 검색어(keyword)
처리내용 : 데이터베이스에서 검색어가 아이디 또는 권한에 포함된 데이터 조회
서블릿 : study.servlet.client.ClientSearchServlet
출력결과 : 조회된 데이터

## 문제

Client 단일조회 서블릿을 구현

- 주소 : http://localhost:8080/study/client/detail.do
- 파라미터 : 회원번호
- 서블릿 : ClientDetailServlet
- 처리메소드 : ClientDao의 get 메소드
- 출력결과 : 조회된 회원의 상세정보 또는 없을 경우의 알림 텍스트

## 문제

다음 요구사항을 처리할 수 있는 서블릿을 구현하세요.

- 주소 : http://localhost:8080/study/client/login.do
- 파라미터 : 아이디, 비밀번호
- 처리서블릿 : ClientLoginServlet
- 처리메소드 : login 메소드
- 예상결과 : 
	- 성공시 - "로그인 성공" 출력
	- 실패시 - "정보가 일치하지 않습니다" 출력

## 문제

- 주소 : http://localhost:8080/study/client/delete.do
- 파라미터 : 아이디(client_id), 비밀번호(client_pw)
- 처리내용 : 로그인 인증 후 회원 탈퇴 처리
- 처리서블릿 : ClientDeleteServlet
- 출력내용 : 
	- 그동안 이용해주셔서 감사합니다
	- 로그인 정보가 일치하지 않습니다
	
## test08.jsp

Client 테이블의 정보를 불러와 화면에 출력하도록 구현














