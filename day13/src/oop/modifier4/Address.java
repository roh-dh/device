package oop.modifier4;

public class Address {

//	데이터 필드
	private String zipCode;
	private String baseAddr;
	private String detailAddr;
	
//	setter & getter
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return zipCode;
	}
	public void setBaseAddr(String baseAddr) {
		this.baseAddr = baseAddr;
	}
	public String getBaseaddr() {
		return baseAddr;
	}
	
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}

	public String getDetailAddr() {
		return detailAddr;
	}
	
	public String getFullAddress() {  //주소를 합치기 위해  만든 getter address
		return "["+this.zipCode+"]"+this.baseAddr+" "+this.detailAddr;
	}
	

	
// 배송지클래스
 public Address(String zipCode, String baseAddr, String detailAddr) {
	 this.setZipCode(zipCode);
	 this.setBaseAddr(baseAddr);
	 this.setDetailAddr(detailAddr);
	}

// 출력
//	void output() {
//		System.out.println("우편번호 "+this.zipCode);
//		System.out.println("기본주소 "+this.baseAdedr);
//		System.out.println("상세주소 "+this.detailAddr);
		
	}
	
	
	
	

