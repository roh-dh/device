package db.select;

import db.beans.StudentDao;

public class Test10 {
	public static void main(String[] args) throws Exception {
//		목표 : 모든 DB작업을 StudentDao를 이용하여 처리(count 구하는 것만 먼저 처리)
		
		StudentDao sdao = new StudentDao();
		int count = sdao.getCount();
		
		System.out.println("카운트 : "+count);
	}
}