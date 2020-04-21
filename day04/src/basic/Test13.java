package basic;

public class Test13 {

	public static void main(String[] args) {

/* BMI 계산기(네이버에서 BMI 계산기 검색 후 비교)
	
	키가 180cm , 체중이 80kg 인 사람의 BMI 지수를 구하여 출력

				체중(kg)
BMI = 	ㅡㅡㅡㅡㅡ
			키(m)	*키(m)
*/		
 		int weight = 80 ;//체중(kg)
 		double cm = 180;		//키(cm)

//		계산 : 신장(m), bmi 지수
 		double m = cm / 100;
// 		System.out.println(m);

 		double bmi = weight/(m*m);
 		System.out.println(bmi);

 		bmi = bmi*100;
 		bmi = (int)bmi;
 		bmi = bmi / 100;
 		System.out.println(bmi);

	}

}
