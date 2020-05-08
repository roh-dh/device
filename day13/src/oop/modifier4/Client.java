package oop.modifier4;

public class Client {

	
//	setter & getter
	private String id;
	private String nickname;
	private String power;
	private Address addr;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPower() {
		return this.power;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Address getAddr() {
		return this.addr;
	}
	
	
	
	
	

	
//	옵션 1 주소 X
	public Client(String id, String nickname, String power) {
		this(id,nickname,power,null);
//		this.setId(id);
//		this.setNickname(nickname);
//		this.setPower(power);
	}
	
//	옵션2 : 주소 O
	public Client(String id, String nickname, String power, Address addr) {
		this.setId(id);
		this.setNickname(nickname);
		this.setPower(power);
		this.setAddr(addr);
		
		
	}
		



//	출력
	void output() {
		System.out.println("[고객 정보]");
		System.out.println("아이디 : "+this.id);
		System.out.println("닉네임 : "+this.nickname);		
//		System.out.println("등   급 : "+this.grade);
		if(addr == null) {// addr이 없으면
			System.out.println("주소지 : 없음");
		}
		else {
//			System.out.println("주소지 : ["+this.addr.getZipCode()+"]"+ this.addr.getBaseaddr()+""+this.addr.getDetailAddr());
			System.out.println("주소지 : "+ this.addr.getFullAddress());
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
}
