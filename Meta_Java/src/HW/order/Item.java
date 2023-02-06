package HW.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {
	//상태 : 모델명, 가격
	//기능 : 

	Scanner sc =new Scanner(System.in);

	private String itemName;
	private String itemPrice;
	private List<Order> orders;		//고객 정보를 order 리스트에 저장
	int count;
	
	public Item() {}

	public Item(String itemName, String itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		orders = new ArrayList<Order>(); 
	}
	
	public void register(Order order) {		// 주문정보 + 회원정보 전달
		orders.add(order);
		order.addItem(this); 		//객체 자신의 내용
	}
	
	public void printItem() {		//회원 확인
		System.out.println("주문한 상품 모델명 : "+itemName);
		for(Order order : orders ) {	
			System.out.println("주문한 상품 가격 : "+itemPrice);
		}
		System.out.println();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
}
