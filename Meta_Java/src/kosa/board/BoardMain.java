package kosa.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		//1. 글쓰기   2. 글 목록보기   3. 글 세부보기

		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.글 쓰기   2.글 목록보기   3.글 세부보기   4.댓글쓰기  5.게시판 종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1" :
				m.addBoard();
				break;
				
			case "2" :
				m.showList();
				break;
				
			case "3" :
				m.searchList();
				break;
				
			case "4" :
				
				break;
				
			case "5" :
				System.out.println("프로그램 종료");
				return;
			}
			
			System.out.println();
		}
	}

}

