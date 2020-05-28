package db.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.beans.StudentDao;

public class Test07 {
	public static void main(String[] args) throws Exception {
//		목표 : Test06에서 만든 코드를 모듈화(StudentDao)
		
//		준비물 : 이름(student_name), 점수(student_score)
		String student_name = "이소룡";
		int student_score = 95;
		
//		처리
		StudentDao sdao = new StudentDao();
		sdao.regist(student_name, student_score);
		
		System.out.println("성공!");
	}
}


