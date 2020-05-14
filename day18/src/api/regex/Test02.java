package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
System.out.println("사용하실  ID를 입력하세요.");
	
	
	
	
	String ID = sc.nextLine();
	String IDregex ="^[a-z0-9\\-_]{5,20}$"	;
	if(Pattern.matches(IDregex, ID)){
		System.out.println("사용할 수 있는 ID입니다.");
	} else {
		System.out.println("ID는 5~20자 이내의 영문숫자,-,_로 작성하세요. ");
	}
System.out.println("");	
System.out.println("패스워드를 입력하세요.");
	String password = sc.nextLine();
	String PWregex="^[a-zA-Z0-9\\-_]{8,16}$";
	if(Pattern.matches(PWregex, password)){
		System.out.println("사용할 수 없는 비밀번호입니다.");
	} else {
		System.out.println("비밀번호는 8~16자 이내의 영문숫자,-,_로 작성하세요.");
	}
}
}
