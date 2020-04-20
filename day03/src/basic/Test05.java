package basic;

public class Test05 {

	public static void main(String[] args) {
//		어제 회식에서 결제한 내역입니다.
//		-소주 4000원 : 20병
//		-맥주 5000원 : 15병
		
//		회식 인원은 7명이라고 할 때 전체 결제금액과 1인당 얼마인지 출력

//		준비
		int sojuPrice = 4000;
		int beerPrice = 5000;
		int sojuCount = 20;
		int beerCount = 15;
		int numberOfPeople = 7;
//		계산
		int totalPrice= sojuPrice*sojuCount+beerPrice*beerCount;
		int personPrice = totalPrice / numberOfPeople;

//		출력		
		System.out.println(totalPrice);
		System.out.println(personPrice);

// 준비 : 소주값, 맥주값, 소주병수, 맥주병수, 회식인원	
// 계산 : 전체 결제금액, 1인당 결제금액           				계산과정은 
// 출력 : 
		
	}

}
