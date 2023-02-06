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
	private List<Order> orders;		//고객 정보를 order 리스트에 저장
	int count;
	
	public Member() {}

	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		orders = new ArrayList<Order>(); 
	}
	
	public void register(Order order) {		// 주문정보 + 회원정보 전달
		orders.add(order);
		order.addMember(this); 		//객체 자신의 내용
	}
	
	public void printMember() {		//회원 확인
		System.out.println("회원이름 : "+name);
		for(Order order : orders ) {	
			System.out.println("회원주소 : "+order.getMembers());
		}
		System.out.println();
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
