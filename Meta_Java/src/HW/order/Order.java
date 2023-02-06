package HW.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
	//상태 : 주문번호, 회원내역, 제품내역, 수량, 주문금액
	//기능 : 
	
	Scanner sc =new Scanner(System.in);

	private String orderNum;
	private String memberInfo;
	private String itemInfo;
	private String orderSize;
	private String orderPrice;
	private List<Member> members;
	private List<Item> items;
	
	public Order() {}

	public Order(String orderNum, String memberInfo, String itemInfo, String orderSize, String orderPrice) {
		super();
		this.orderNum = orderNum;
		this.memberInfo = memberInfo;
		this.itemInfo = itemInfo;
		this.orderSize = orderSize;
		this.orderPrice = orderPrice;
		members = new ArrayList<Member>();
		items = new ArrayList<Item>();	
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void removeMember(Member member) {
		members.remove(member);
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public void printOrder() {		//과목당 수강신청 학생 출력
		System.out.println("주문번호 :"+orderNum);
		for(Member member : members ) {
			System.out.println("회원이름 : "+member.getName());
			System.out.println("회원주소 : "+member.getAddress());
		}
		for(Item item : items ) {
			System.out.println("주문한 상품 모델명 : "+item.getItemName());
			System.out.println("주문한 상품 가격 : "+item.getItemPrice());
		}
		System.out.println("주문수량 :"+orderSize);
		System.out.println("주문금액  :"+orderPrice);
	}

	
	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
