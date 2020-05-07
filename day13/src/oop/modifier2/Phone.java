package oop.modifier2;

public class Phone {

//필드 : private
	private String name;
	private String telecom;
	private int price;
	private int agree;

// setter 메소드 4개
	public void setName(String name) {
		this.name = name;
	}

	public void setTelecom(String telecom) {
		switch(telecom) {
		case "SK": case "sk": case "sK": case "Sk":
		case "LG": case "lg": case "Lg": case "lG":
		case "KT": case "Kt": case "kT": case "kt":
		case "알뜰폰":
			this.telecom = telecom;
			
		}
	}

	public void setPrice(int price) {
		//가격이 0이상일 경우 설정
//		if(price >=0) {
//			this.price = price;
//	}
//		가격이 0 미만이면 실행 중지(return)
		if(price <0) return;
		this.price = price;
	}

	public void setAgree(int agree) {
//		if(6의 배수이면) {
//			this.agree = agree;		
//		}
		if(agree %6 !=0 || agree<0) {
			return;
		}
		this.agree = agree;
	}

//	getter 메소드 4개
	public String getName() {
		return this.name;
	}
	public String getTelecom() {
		return this.telecom;
	}
	public int getPrice() {
		return this.price;
	}
	public int getAgree() {
		return this.agree;
	}
	
//	생성자
	public Phone(String name,String Telecom,int price,int agree){
//		this.name = name;
//		직접 설정하는것이 아니라 미리 준비해둔 setter 메소드를 호출
		this.setName(name);
		this.setTelecom(Telecom);
		this.setPrice(price);
		this.setAgree(agree);		
	}
	
//	기타메소드
	public void output() {
		System.out.println("[휴대폰 정보]");
//		System.out.println("기종 : "+this.getName());
		System.out.println("기종 : "+this.name);
		System.out.println("통신 : "+this.telecom);
		System.out.println("가격 : "+this.price+"원");
		System.out.println("약정기간 : "+this.agree+"개월");
		System.out.println();
		
	}
	
	
//	기타메소드
	
}
