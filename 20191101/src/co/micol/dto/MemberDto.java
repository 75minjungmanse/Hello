package co.micol.dto;

import java.sql.Date;

public class MemberDto {
	private String id;
	private String name;
	private String password;
	private String grant;
	private Date enterDate;
	private String addr;
	
	public MemberDto() {

	}
	
	
	public MemberDto(String id, String name, String pw, String addr) { // 생성자 오버로딩
		this.id = id;
		this.name = name;
		this.password = pw;
		this.addr = addr;
	}
	
	public MemberDto(String id, String name, String addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGrant() {
		return grant;
	}

	public void setGrant(String grant) {
		this.grant = grant;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
