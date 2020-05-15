package api.util.date;

import java.util.Date;

public class Test04 {
	public static void main(String[] args) {

		
//	Date를 이용한 시간 계산
//	- 안좋음

	Date today = new Date();	
		
	long t = today.getTime();	
	long a = t + 5 * 24 * 60 *60 * 1000;
	Date after = new Date(a);
	Format f = new SimpleDateFormat("y-m-d")
	System.out.println(today);
	
	
	}
}
