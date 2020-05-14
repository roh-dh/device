package api.lang.string;

public class Test07 {
	public static void main(String[] args) {

// 문자열 편집 2탄
// -자르기 :substring()
// -분해 : split()

		String time = "2020-05-14 09:48:32.0";
		System.out.println(time);
		System.out.println(time.substring(0, 10));
		System.out.println(time.substring(11, 16));
		System.out.println(time.substring(11));

		String colors = "빨/주/노/초/파/남/보";
		String[] data = colors.split("/");
		System.out.println("색상 개수 :" + data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
