package kosa.hotel;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private String id;
	private String pw;
	private String name;
	private String phoneNo;
	private String cardNo;		//카드 번호
	
	public Customer() {}

	public Customer(String id, String pw, String name, String phoneNo, String cardNo) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phoneNo = phoneNo;
		this.cardNo = cardNo;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}