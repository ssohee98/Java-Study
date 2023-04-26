package kosa.hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelMain {
	static Scanner sc = new Scanner(System.in);
	static HotelManager hm = new HotelManager();
	static LinkedList<Customer> custList = new LinkedList<Customer>();
	static List<Room> roomList = new LinkedList<Room>();
	static CustomerManager cm = new CustomerManager();
	static LinkedList<Customer> login = new LinkedList<Customer>();

	public static void main(String[] args) {
		System.out.print("1. 고객 페이지 | 2. 관리자 페이지 | 3. 종료>> ");
		String menu = sc.nextLine();

		while (true) {
			switch (menu) {
			case "1":
				System.out.println();
				System.out.println("*--------------------------------*");
				System.out.print("1. 객실 조회 | 2. 예약 | 3. Check In | 4. Check Out | 5. 종료>> ");
				String select1 = sc.nextLine();
				
				switch (select1) {
				case "1":
					System.out.println();
					System.out.println("*--------------------------------*");
					roomList = hm.room;
					System.out.println("환영합니다! 메타몽 호텔입니다 :)");
					System.out.println(roomList.toString());
					break;

				case "2":
					System.out.println();
					System.out.println("*--------------------------------*");
					System.out.print("1. 객실 예약 | 2. 예약 확인 | 3. 예약 취소 | 4. 예약 종료 >> ");
					String input = sc.nextLine();
					switch (input) {
					case "1":
						hm.reserve(roomList, login);
						break;
					case "2":
						hm.checkReserve();
						break;
					case "3":
						hm.cancelReserve();
						break;
					case "4": return;
					default:
						break;
					}
					break;
					
				case "3":
					System.out.println();
					System.out.println("*--------------------------------*");
					hm.CheckIn();
					break;
					
				case "4":
					System.out.println();
					System.out.println("*--------------------------------*");
					hm.CheckOut();
					break;
					
				case "5":
					return;
					
				default:
					break;
				}
				break;
				
//			case "2":
//				System.out.println("1. 객실 추가, 2. 객실 삭제 : ");
//				String select2 = sc.nextLine();
//				switch (select2) {
//				case "1":
//					manager.addRoom();
//					break;
//				case "2":
//					manager.removeRoom();
//					break;
//				default:
//					break;
//				}
				
				
			default:
				break;
				
			case "3":
				System.out.println("호텔 예약 시스템 종료 :(");
				return;
			}
		}
		
	}
}