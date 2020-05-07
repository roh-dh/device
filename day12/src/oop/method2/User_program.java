package oop.method2;

public class User_program {
	public static void main(String[] args) {
		
		User01 a1 = new User01();
		User01 a2 = new User01();
		User01 a3 = new User01();
		
		a1.setting("뽀로로","전사", 50, 50000);
		a2.setting("마리오","마법사",45,65000);
		a3.setting("루이지","전사",53,70000);
		
		
		
		//출력
		a1.output();
		a2.output();
		a3.output();
	}

}
