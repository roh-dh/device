package oop.inherit6;

public class IPhone11 extends IPhone {

	public void siri() {
		System.out.println("IPhone11의 음성인식 기능을 실행합니다.");
	}

	@Override
	public void call() {
		System.out.println("IPhone11의 전화기능을 실행합니다.");

	}

	@Override
	public void airdrop() {
		System.out.println("IPhone11의 에어드랍을 실행합니다.");
	}

}
