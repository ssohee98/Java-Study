package kosa.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10];
//	PhoneInfo arr2[] = new Company[10];
//	Company[] arr22 = (Company[])arr2;
//	PhoneInfo arr3[] = new Universe[10];
//	Universe[] arr33 = (Universe[])arr3;

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
			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			break;
			
		case "2":
			System.out.print("부서 : ");
			String dept = sc.nextLine();		
			System.out.print("직책 : ");
			String position = sc.nextLine();
			
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;

		case "3":
			System.out.print("학과 : ");
			String major = sc.nextLine();		
			System.out.print("학번 : ");
			String year = sc.nextLine();
			
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		}
	}
	
//	public void addCompanyInfo() {
//		System.out.print("부서 : ");
//		String dept = sc.nextLine();		
//		System.out.print("직책 : ");
//		String position = sc.nextLine();
//		
//		arr2[count++] = new Company(name, phoneNo, birth, dept, position);	
//	}
//	
//	public void addUniverseInfo() {
//		System.out.print("전공 : ");
//		String major = sc.nextLine();		
//		System.out.print("입학년도 : ");
//		String year = sc.nextLine();
//		
//		arr2[count++] = new Universe(major, year);		
//	}

	public void listPhoneInfo() {
		System.out.println("1. 일반   2. 회사   3. 동창");
		System.out.print("메뉴 입력 : ");
		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			for (int i = 0; i<count; i++) {
				arr[i].show();
			}
			break;
			
		case "2":
			for (int i = 0; i<count; i++) {
				if(arr[i] instanceof Company) {	//Company로 형변환 해야하면
					arr[i].show();		//오버라이딩한 (Company) 메소드 이므로 회사 정보만 출력
				}
			}
			break;
			
		case "3":
			for (int i = 0; i<count; i++) {
				if(arr[i] instanceof Universe) {	//Universe로 형변환 해야하면
					arr[i].show();		//오버라이딩한 (Universe) 메소드 이므로 회사 정보만 출력
				}
			}
			break;

		}
	}
//	
//	public void listCompanyInfo() {
//		for (int i = 0; i<count; i++) {
//			arr2[i].show();
//		}
//	}
//	
//	public void listUniverseInfo() {
//		for (int i = 0; i<count; i++) {
//			arr3[i].show();
//		}
//	}
	
	public void searchPhoneInfo() {
		System.out.print("이름 검색 : ");
		String name = sc.nextLine();
		int index = -1;
		
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				index = i;
				break;
			}
		}

		if(index == -1) {
			System.out.println("대상이 없습니다.");
		}
//		
//		if (index == -1) 
//			System.out.println("해당 이름은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
//		else System.out.println((index+1)+" 번째 있습니다.");
//	}
//	
//	public void searchCompanyInfo() {
//		System.out.print("부서 검색 : ");
//		String dept = sc.nextLine();
//		int index = -1;
//		
//		for (int i = 0; i < count; i++) {
//			if (dept.equals(arr22[i].getDept())) {
//				arr22[i].show();
//				index = i;
//				break;
//			}
//		}
//		
//		if (index == -1) 
//			System.out.println("해당 부서는 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
//		else System.out.println((index+1)+" 번째 있습니다.");
//	}
//	
//	public void searchUniverseInfo() {
//		System.out.print("전공 검색 : ");
//		String major = sc.nextLine();
//		int index = -1;
//		
//		for (int i = 0; i < count; i++) {
//			if (major.equals(arr33[i].getMajor())) {
//				arr33[i].show();
//				index = i;
//				break;
//			}
//		}
//		
//		if (index == -1) 
//			System.out.println("해당 전공은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
//		else System.out.println((index+1)+" 번째 있습니다.");
	}
	
}
