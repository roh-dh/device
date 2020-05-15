package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {

//2020년 5월 15일 금요일
//오후 1:39
//13:39
//2020-05-15 13:39:40
		Date a = new Date();
		System.out.println(a);
		Format f1 = new SimpleDateFormat("yyyy년-M월-dd일 EEEE");
		Format f2 = new SimpleDateFormat("a h:mm");
		Format f3 = new SimpleDateFormat("HH:mm");
		Format f4 = new SimpleDateFormat("yyyy-mm-dd  H:mm:ss");

		System.out.println(f1.format(a));
		System.out.println(f2.format(a));
		System.out.println(f3.format(a));
		System.out.println(f4.format(a));

		while(true) {
			Date t = new Date();
			System.out.println(f4.format(t));
			try {
			Thread.sleep(1000L);
			} catch(Exception e) {}
		}
		
		
	}
}
