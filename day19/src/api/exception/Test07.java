package api.exception;

public class Test07 {
	public static void main(String[] args) {
		// 예외 전가 
		try {
			
		int v = Robot.div(10, 0);
//		int v = Robot.div(0, 10);
		System.out.println(v);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
