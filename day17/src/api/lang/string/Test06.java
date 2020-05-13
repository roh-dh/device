package api.lang.string;

import java.util.*;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("당신 : ");
		String a = sc.nextLine();

		String[] data = new String[] { "신발끈", "개나리", "수박씨", "호루라기", "시베리아", "십장생", "조카", "주옥", "쌍쌍바", "십자수" };

		for (int i = 0; i < data.length; i++) {
			if (data[i].length() == 4) {
				a = a.replace(data[i], "****");
			} else if (data[i].length() == 3) {
				a = a.replace(data[i], "***");
			} else if (data[i].length() == 2) {
				a = a.replace(data[i], "**");
			}
		}

		System.out.println("필터된 결과 : " + a);
	}
}
