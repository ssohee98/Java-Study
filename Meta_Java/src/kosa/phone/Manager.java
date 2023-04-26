package kosa.phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Manager {
//	PhoneInfo arr[] = new PhoneInfo[10];		//배열
	List aList = new ArrayList<PhoneInfo>(10);		//리스트
	Iterator<PhoneInfo> it = aList.iterator();

	static Scanner sc = new Scanner(System.in);
	int count;		//지역변수는 반드시 초기화지만 멤버변수는 안해도 된다.
	
	public void addPhoneInfo() {
		System.out.println("1. 일반   2. 회사   3. 동창");
		System.out.print("메뉴 입력 : ");
		String menu = sc.nextLine();
		 
		System.out.print("이름 : ");
		String name = sc.nextLine();		
		System.out.print("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		switch (menu) {
		case "1":
//			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			aList.add(new PhoneInfo(name, phoneNo, birth));
			break;
			
		case "2":
			System.out.print("부서 : ");
			String dept = sc.nextLine();		
			System.out.print("직책 : ");
			String position = sc.nextLine();
			
//			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			aList.add(new Company(name, phoneNo, birth, dept, position));
			break;

		case "3":
			System.out.print("학과 : ");
			String major = sc.nextLine();		
			System.out.print("학번 : ");
			String year = sc.nextLine();
			
//			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			aList.add(new Universe(name, phoneNo, birth, major, year));
			break;
		}
	}
	

	public void listPhoneInfo() {
		System.out.println("1. 일반   2. 회사   3. 동창");
		System.out.print("메뉴 입력 : ");
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
//			for (int i = 0; i<count; i++) {
//				arr[i].show();
//			}
			
			while(it.hasNext()) {
				PhoneInfo element = it.next();
				System.out.println(element);
			}
			
			break;
			
		case "2":
//			for (int i = 0; i<count; i++) {
//				if(arr[i] instanceof Company) {	//Company로 형변환 해야하면
//					arr[i].show();		//오버라이딩한 (Company) 메소드 이므로 회사 정보만 출력
//				}
//			}
			
			while(it.hasNext()) {
				PhoneInfo element = it.next();
				if(element instanceof Company) {
				System.out.println(element);
				}
			}
			
			break;
			
		case "3":
//			for (int i = 0; i<count; i++) {
//				if(arr[i] instanceof Universe) {	//Universe로 형변환 해야하면
//					arr[i].show();		//오버라이딩한 (Universe) 메소드 이므로 회사 정보만 출력
//				}
//			}
			
			while(it.hasNext()) {
				PhoneInfo element = it.next();
				if(element instanceof Universe) {
				System.out.println(element);
				}
			}
			
			break;

		}
	}
	
	public void searchPhoneInfo() {
		System.out.print("이름 검색 : ");
		String name = sc.nextLine();
		int index = -1;
		
//		for (int i = 0; i < count; i++) {
//			if (name.equals(arr[i].getName())) {
//				arr[i].show();
//				index = i;
//				break;
//			}
//		}
//
//		if(index == -1) {
//			System.out.println("대상이 없습니다.");
//		}
		
		while(it.hasNext()) {
			PhoneInfo element = it.next();
			if(name.equals(element.getName())) {
			System.out.println(element);
			} else System.out.println("대상이 없습니다.");
		}
	}
	
}
