package kosa.hotel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager {
	Scanner sc = new Scanner(System.in);
	
//	private Room r;
//	private BookSystem b;
	private int total;		//총 금액
	private int index;
	private int reserveNum=0;	//예약번호
	private int roomNum=0;	//객실번호
	List<Room> room = new ArrayList<Room>();
	List<Customer> customer;
	List<BookSystem> book = new ArrayList<BookSystem>();
	
	int num1 = 0;		//남은 방 개수
	int num2 = 10;
	int num3 = 6;
	
	int count = 0;
	
	Manager manager = new Manager("User", "1234");
	
	public HotelManager() {
		room.add(new Room("스탠다드", num1, 100000));
		room.add(new Room("디럭스룸", num2, 160000));
		room.add(new Room("스위트룸", num3, 400000));
	};
	
	public void showRoomList(List<Room> room) {
		for(int i = 0; i < room.size(); i++) {
			System.out.print(Array.get(room, i));
			System.out.println();
		}
	}
	
	public void reserve(List<Room> room, List<Customer> customer) {		//예약
		int roomType;

		System.out.println();
		System.out.println(room.toString());
		System.out.print("예약하실 객실을 선택하세요 : >>");
		roomType = sc.nextInt();
		
		while(room.get(roomType).getRoomCount()==0) {
			System.out.println();

			System.out.print("선택하신 객실이 매진되었습니다. 다른 객실을 선택하세요 :) >>");
			roomType = sc.nextInt();
			
		}
		
		switch (roomType) {		//객실을 선택하면 남은 객실 수 조정
		case 0:
			num1--;
			room.remove(0);
			room.add(0,new Room("스탠다드", num1, 100000));
			break;
			
		case 1:
			num2--;
			room.remove(1);
			room.add(1,new Room("디럭스룸", num2, 160000));
			break;
			
		case 2:
			num3--;
			room.remove(2);
			room.add(2,new Room("스위트룸", num3, 400000));
			break;
			
		}
		
		System.out.println(room.get(roomType)+"을 선택하셨습니다.");
		
		System.out.println();
		System.out.print("숙박 날짜 :");
		String dt = sc.nextLine();
		sc.nextLine();
		
		System.out.print("숙박 기간 : ");
		int dy = Integer.parseInt(sc.nextLine());
		
		
		
		total = dy*room.get(roomType).getRoomPrice();
		
		System.out.println("예약이 완료되었습니다.");
		
		//예약 완료되면 예약 리스트에 저장 
		
		reserveNum +=1 ;		//예약이 완료되면 예약번호 지정
		roomNum +=1; 
		 
		System.out.println("예약번호는 : ["+ reserveNum + "] 입니다.");
		
		book.add(new BookSystem(room.get(roomType), dt, dy, reserveNum, roomNum, total));
	}
	
	public void checkReserve() {		//예약 확인
		System.out.print("예약번호를 입력하세요 : ");
		int reserveNum = sc.nextInt();
		
		for(int i = 0; i < book.size(); i++) {
			int a = book.get(i).getReserveNum();
			
			if (reserveNum == a) System.out.println(book.toString());
			else System.out.println("예약내역이 존재하지 않습니다.");
		}
	}
	
	public void cancelReserve() {		//예약 취소
		System.out.print("예약번호를 입력하세요 : ");
		int reserveNum = sc.nextInt();
		
		for(int i = 0; i < book.size(); i++) {
			int a = book.get(i).getReserveNum();
			
			if (reserveNum == a) {
				book.remove(i);
				count -= 2;
			}
		}
	}
	
	public void CheckIn() {		//체크인	예약번호를 입력하고 존재하면 객실번호 출력
		System.out.print("[Check In]환영합니다!! 예약번호를 입력해주세요 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < book.size(); i++) {
			if (book.get(i).getReserveNum() == n) {
				System.out.println(book.get(i).getRoom().getRoomType()+"타입, "+book.get(i).getRoomNum()+"번 방 객실입니다.");
				
			}
		}
	}
	
	public void CheckOut() {		//체크아웃		객실번호를 입력하고 존재하면 계산서발급
		System.out.print("[Check Out]객실번호를 입력해주세요 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < book.size(); i++) {
			if (book.get(i).getRoomNum() == n) {
				index = i;
				System.out.println("체크아웃 완료 :)");
				bill();		//계산서 발급
				book.remove(i);
			} else System.out.println("해당 객실번호가 존재하지 않습니다.");
		}
	}
	
	public void bill() {	//체크아웃 완료되면 계산서 발급
		int price = book.get(index).getTotal();
		System.out.println(" => 결제하실 금액은 : "+price+"원 입니다.");
		sc.nextLine();
		
		System.out.println();
		System.out.print("결제 수단을 선택하세요 (1. 현금 | 2. 카드 | 3. 수표 ) >>");
		String pay = sc.nextLine();
		
		switch (pay) {
		case "1":
			int change = -1;
			
			while (change < 0) {
				System.out.print("결제할 금액 : ");
				int money = sc.nextInt();
				change = money-price;
				System.out.println("결제금액이 부족합니다");
			} 
			
			//영수증 발급
			System.out.println("_______________________");
			System.out.println("현금 결제가 완료되었습니다!!  거스름돈 : "+change+"원");
			
			break;
			
//		case "2":
//			String cardNo = "";
//			
//			while (!(cardNo.equals(book.get(index).getCustomer().getCardNo()))) {
//				System.out.println("결제하실 카드 번호를 입력하세요 : ");
//				cardNo = sc.nextLine();
//				
//				if (!(cardNo.equals(book.get(index).getCustomer().getCardNo())))
//					System.out.println("카드가 존재하지 않습니다.");
//			}
//			
//			System.out.println("카드 결제가 완료되었습니다 :)");
//
//			break;
			
		case "3":
			int change2 = -1;
			
			while (change2 < 0) {
				System.out.println("수표 종류를 선택하세요 (1. 10만 | 2. 40만 | 3. 100만");
				String mbill = sc.nextLine();
				switch (mbill) {
				case "1":
					change2 = 100000-price;
					break;
				case "2":
					change2 = 400000-price;
					break;
				case "3":
					change2 = 1000000-price;
					break;
				}
			} 
			
			System.out.println("결제가 완료되었습니다 :) /n 거스름돈 : "+change2+"원");
			
			break;
		}
	}
}
	