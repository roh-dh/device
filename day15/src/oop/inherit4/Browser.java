package oop.inherit4;


//공통 요소를 정의하는 상위 클래스
public class Browser {

	private String url;
	private String version;
	
	public void move() {};
	public void back() {}; 

	public void setUrl(String url) {
		this.url = url;
	}public String getUrl() {
		return url;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersion() {
		return version;
		
		
	}
}
