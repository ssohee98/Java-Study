package HW.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
	//상태 : 이름, 주소
	//기능 : 
	Scanner sc =new Scanner(System.in);

	private String name;
	private String address;
	
	public Member() {}

	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
