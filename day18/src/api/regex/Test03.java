package api.regex;

import java.util.regex.Pattern;

public interface Test03 {
	public static void main(String[] args) {

	// - 이름(닉네임)
	// - 생년월일
String name = "노동환";
String nameRegex ="^[가-힣]{2,7}$";
System.out.println(Pattern.matches(nameRegex, name));


String birth ="1993-02-30";
String birthRegex ="^(19|20)[\\d]{2}-?(1[0-2]|0[1-9])-?(0[1-9]|[12][\\d]|[3][01])$";
System.out.println(Pattern.matches(birthRegex, birth));

		
	}
}
