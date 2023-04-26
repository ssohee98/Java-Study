package kosa.data.queue_order;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderMain {
	Scanner sc =new Scanner(System.in);
	int totalPrice = 0;
	
	Food food[] = new Food[10];
	int cnt = 0;
	static String  menu = null;		
	
	Queue<Order>	list	 = new LinkedList<Order>();
	

	public static void main(String[] args) {
	
//		Food food1 = new Food("아메리카노", 3000);
//		Food food2 = new Food("카페라떼", 4000);
		
		
		do{
			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 주문요청");
			System.out.println("2. 주문처리)");
			System.out.println("3. 매출액 총액");
			System.out.println("4. 종료");
			System.out.println("***************");
			System.out.print(">>");			
			
			menu = sc.nextLine();		
		
			if(menu.equals("1")){	
				
			}else if(menu.equals("2")){

			
			}else if(menu.equals("3")){

			}
				
			} while(!menu.equals("q"));
}
	
	
	public void order() {
		System.out.print("주문할 메뉴를 입력하세요 : ");
		String menu = sc.nextLine();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		food[cnt++] = new Food(menu, price);
		list.offer(this);
	}
	
//	public void order() {
//		System.out.print("주문할 메뉴를 입력하세요 : ");
//		String menu = sc.nextLine();
//		System.out.print("가격을 입력하세요 : ");
//		int price = sc.nextInt();
//
//		food[cnt++] = new Food(menu, price);
//	}
//	
//	public void orderMake() {
//		System.out.print("수량을 입력하세요 : ");
//		int amount = sc.nextInt();
//	}
//	
//	public void totalPrice() {
//		int sum = 0;
//		for (int cnt = 0; cnt < food.length; cnt++) {
//			sum += food[cnt++].getPrice();
//		}
//	}
	
}

