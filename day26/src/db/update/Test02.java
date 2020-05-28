package db.update;

import db.beans.StudentDao;
import db.beans.StudentDto;

public class Test02 {
	public static void main(String[] args) throws Exception{
//		목표 : Student 테이블 데이터의 정보를 수정하는 것
//		- 이름과 점수를 수정할 수 있다(번호는 절대로 수정하면 안된다... 기본키니까)
//		- 특별한 경우가 아니라면 기본키를 이용하여 한개씩만 수정하는 것이 원칙이다(삭제도 마찬가지)
		
//		준비 : 수정할 데이터 + 기본키
//		int student_no = 2;
//		String student_name = "통키";
//		int student_score = 71;
		StudentDto sdto = new StudentDto();
		sdto.setStudent_no(2);
		sdto.setStudent_name("통키");
		sdto.setStudent_score(50);
		
//		처리 : 직접 작성 or DAO 를 이용
		StudentDao sdao = new StudentDao();
//		boolean result = sdao.edit(student_no, student_name, student_score);
		boolean result = sdao.edit(sdto);
		
		if(result) {
			System.out.println("수정 완료");
		}
		else {
			System.out.println("대상이 존재하지 않습니다");
		}
		
	}
}
