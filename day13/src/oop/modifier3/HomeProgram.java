package oop.modifier3;

public class HomeProgram {
	public static void main(String[] args) {

		Home a = new Home(25, 0, 1, false, 300000000);
		Home b = new Home(28, 2, 2, true, 350000000);
		Home c = new Home(31, 3, 2, true, 400000000);

		
		a.output();
		b.output();
		c.output();
	}
}