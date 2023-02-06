package kosa.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Mission03 {
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void add(String arr[]) {	//1. 추가
		System.out.print("이름 : ");
		arr[count++] = sc.nextLine();		//인덱스를 설정해버리면 추가시마다 덮어쓰기가 되므로
	}
	
	public static void print(String arr[]) {	  //2. 출력
		for (int i = 0; i < count; i++) {		  //쓸데없이 arr길이만큼 다 for문 돌리지 말고 입력받은데 까지만 출력
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void search(String arr[]) {  //3. 검색
		System.out.print("검색 : ");					
		String str = sc.nextLine();
		int index = -1; 		//배열 인덱스가 0부터 시작하므로 디폴트를 -1로 / 만약 끝까지 돌았는데 -1에서 변화가 없다면 검색할 문자열이 없다는 것

		for (int i = 0; i < count; i++) {		//i의 범위는 length 가 아닌 입력받은 개수!!
			if (str.equals(arr[i])) {
				index = i;
				break;
			}
		}
		
		if (index == -1) 
			System.out.println("해당 이름은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
		else System.out.println((index+1)+" 번째 있습니다.");
	}
	
	public static void update(String arr[]) {	  //4. 수정
		System.out.print("수정할 이름 : ");					
		String str = sc.nextLine();
		int index = -1; 		//배열 인덱스가 0부터 시작하므로 디폴트를 -1로 / 만약 끝까지 돌았는데 -1에서 변화가 없다면 검색할 문자열이 없다는 것

		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				index = i;
				break;
			}
		}
		
		if (index == -1) 
			System.out.println("해당 이름은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
		else {
			System.out.print("수정할 이름 : ");
			arr[index] = sc.nextLine();
		}
	}
	
	public static void delete(String arr[]) {   //5. 삭제  	
		System.out.print("삭제할 이름 : ");					
		String str = sc.nextLine();
		int index = -1; 		//배열 인덱스가 0부터 시작하므로 디폴트를 -1로 / 만약 끝까지 돌았는데 -1에서 변화가 없다면 검색할 문자열이 없다는 것

		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				index = i;
				break;
			}
		}
		
		if (index == -1) 
			System.out.println("해당 이름은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
		else {		//삭제하고싶은 인덱스 기준 오른쪽 값들을 한칸씩 왼쪽으로 옮기고(for문) 마지막 배열만 삭제
			for(int i = index; i < count-1; i++) {
				arr[i] = arr[i+1];
			}
			count--;		//초반에 count로 배열 크기 인덱스를 설정해 뒀으므로 값이 빠지면 count도 자동으로 하나 줄어들어 굳이 마지막 배열을 삭제하지 않아도 존재하지 않는다.
		}
	}
	
	public static void main(String[] args) {
		//배열에 문자열을 추가, 출력, 검색, 수정, 삭제
		
//		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		
//		String[] arr = {"Spring", "Summer", "Fall", "Winter"};
//		String[] arr2 = new String[arr.length+1];
//		int a = 0;
//
//		for (int index = 0; index < arr.length; index++) {		//arr보다 1크기 더 크게 만든 arr2에 순서대로 값 옮겨주기
//			arr2[index] = arr[index];
//		}
		
		while(true) {
			System.out.println("1. 추가   2. 출력   3. 검색   4. 수정   5. 삭제   6. 종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1" :
				add(arr);
				break;
				
			case "2" :
				print(arr);
				break;
				
			case "3" :
				search(arr);
				break;
				
			case "4" :
				update(arr);
				break;
	
			case "5" :
				delete(arr);
				break;
				
			case "6" :
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		
//		while(true) {
//			System.out.println("1. 추가   2. 출력   3. 검색   4. 수정   5. 삭제   6. 종료");
//			System.out.print("메뉴 입력 : ");
//			String menu = sc.nextLine();
//			
//			switch (menu) {
//			case "1" :
//				System.out.print("추가할 값을 입력하시오 : ");
//				String val = sc.nextLine();
//				arr2[arr.length] = val;
//				System.out.println(Arrays.toString(arr2));	
//				a++;
//				
//				break;
//				
//			case "2" :
//				if (a>0) {
//					System.out.println(Arrays.toString(arr2));	
//				} else System.out.println(Arrays.toString(arr));	
//				break;
//				
//			case "3" :
//				System.out.print("검색할 인덱스를 입력하시오 : ");
//				int i = sc.nextInt();
//				
//				if (a>0) {
//					System.out.println(arr2[i]);	
//				} else System.out.println(arr[i]);
//				break;
//				
//			case "4" :
//				System.out.print("수정할 인덱스와 값을 입력하시오 : ");
//				int i2 = sc.nextInt();
//				String v = sc.nextLine();
//				
//				if (a>0) {
//					arr2[i2] = v;
//					System.out.println(Arrays.toString(arr2));
//				} else {
//					arr[i2] = v;
//					System.out.println(Arrays.toString(arr));
//				}
//					
//				break;
//	
//			case "5" :
//				System.out.print("삭제할 인덱스를 입력하시오 : ");
//				int i3 = sc.nextInt();
//				
//				if (a>0) {
//					arr2[i3] = null;
//					System.out.println(Arrays.toString(arr2));
//				} else {
//					arr[i3] = null;	
//					System.out.println(Arrays.toString(arr));
//				}
//				break;
//				
//			case "6" :
//				System.out.println("프로그램 종료");
//				return;
//			}
//			
//		}

	}
}
