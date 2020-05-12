package oop.inherit.abstract3;

import java.util.Random;

public class Test01 {
	public static final int ZFLIP = 0;
	public static final int V60 = 1;
	public static final int IPHONE11 = 2;
	
	public static final int CALL = 0;
	public static final int SMS = 1;
	public static final int CAMERA = 2;
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int choice = r.nextInt(3);
		int action = r.nextInt(3);
		System.out.println("choice = " + choice);
		System.out.println("action = " + action);
		
		if(choice == ZFLIP) {
			ZFlip a = new ZFlip();
			
			if(action == CALL) {
				a.call();
			}
			else if(action == SMS) {
				a.sms();
			}
			else{
				a.camera();
			}
		}
		else if(choice == V60) {
			V60 a = new V60();
			
			if(action == CALL) {
				a.call();
			}
			else if(action == SMS) {
				a.sms();
			}
			else{
				a.camera();
			}
		}
		else{
			IPhone11 a = new IPhone11();
			
			if(action == CALL) {
				a.call();
			}
			else if(action == SMS) {
				a.sms();
			}
			else{
				a.camera();
			}
		}
	}
}
