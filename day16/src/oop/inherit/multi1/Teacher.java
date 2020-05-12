package oop.inherit.multi1;

//강사 인터페이스
// - 다중 상속 전용 클래스(클래스의 변형)
// - 클래스에서 다중상속 시 문제가 되는 요소들이 모두 사라졌음
// - 변수 생성 불가(상수만 가능)
// - 생성자 생성불가(객체 생성 불가)
// - 메소드 생성 불가(추상 메소드만 생성 가능)
public interface Teacher {
	//필드
	/* public static final */ int a = 10;
	/* public static final */ String subject ="자바";
	
	
//	public Teacher() {}
	
	/*public abstract*/ void teach();
	
}
