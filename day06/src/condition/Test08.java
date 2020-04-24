package condition;

public class Test08 {
	public static void main(String[]args) {

//		
		int number = 3;

String str;
if(number%2==0 && number%3==0) {
	str = "2와 3의 배수입니다";
} else if(number%2==0) {
	str = "2의 배수입니다.";	
} else if(number%3==0) {
	str = "3의 배수입니다.";
} else {
	str = "2와 3의 배수 둘다 해당되지 않습니다.";
}
	System.out.println(str);
		
	}
}
