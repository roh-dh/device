package oop.inherit6;

public class IPhone10 extends IPhone {
	public void itunes() {
		System.out.println("IPhone10의 아이튠즈 기능을 실행합니다.");
	}

	@Override
	public void call() {
		System.out.println("IPhone10의 전화를 실행합니다.");
	}

	@Override
	public void airdrop() {
		System.out.println("IPhone10의 에어드랍 기능을 실행합니다.");
	}
}
