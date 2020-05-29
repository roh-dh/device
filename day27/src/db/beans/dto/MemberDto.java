package db.beans.dto;

public class MemberDto {
	private String member_id;			//회원 아이디(5~20자)
	private String member_pw;			//회원 비밀번호(8~16자)
	private String member_nick;		//회원 닉네임(한글 8자이내)
	private String post;						//우편번호(5~6자)
	private String base_addr;			//기본주소(한글 100자이내)
	private String extra_addr;			//상세주소(한글 100자이내)
	private String member_birth;		//회원 생일(날짜)
	private String member_phone;	//회원 전화번호(- 없이 11자)
	private String member_intro;		//회원 자기소개(4000byte)
	private String member_auth;		//회원 권한(일반,VIP,관리자)
	private String member_join;		//회원 가입일(날짜)
	private String member_login;		//회원 최종 로그인 일시(날짜)
	public MemberDto() {
		super();
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getBase_addr() {
		return base_addr;
	}
	public void setBase_addr(String base_addr) {
		this.base_addr = base_addr;
	}
	public String getExtra_addr() {
		return extra_addr;
	}
	public void setExtra_addr(String extra_addr) {
		this.extra_addr = extra_addr;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_intro() {
		return member_intro;
	}
	public void setMember_intro(String member_intro) {
		this.member_intro = member_intro;
	}
	public String getMember_auth() {
		return member_auth;
	}
	public void setMember_auth(String member_auth) {
		this.member_auth = member_auth;
	}
	public String getMember_join() {
		return member_join;
	}
	public void setMember_join(String member_join) {
		this.member_join = member_join;
	}
	public String getMember_login() {
		return member_login;
	}
	public void setMember_login(String member_login) {
		this.member_login = member_login;
	}
}
