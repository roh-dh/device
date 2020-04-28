package loop2;

public class Test07 {

	public static void main(String[] args) {

//		고대 그리스에 아주 현명한 노인이 있었습니다.
		
//		왕이 그 노인에게 "원하는 걸 선물해줄테니 말해봐라" 라고 했습니다.
		
//		노인이 말하길 "저는 별로 바라는게 없습니다. 첫날 1원만 주시고 둘째날부터 전날의 두배만 주시면 됩니다."
		
//		40일동안 이 노인이 받게되는 돈의 액수와 총 얼마 받는지 계산

		
//		비추천 코드 (장기자랑)
		/*
		 * for(int day=1, money =1; day <30; day+=1, money *=2) {
		 * System.out.println(day+"일차 : "+money+"원"); }
		 */		
		
		long money = 1;
		long total = 0;
				
for(int day = 1; day<=40 ; day++) {

	System.out.println(day+"일차 받을 금액 : "+ money+"원");
	total +=money;
	money *= 2;
	
}
	System.out.println("총금액 : "+total+"원");
		
		
	}

}
