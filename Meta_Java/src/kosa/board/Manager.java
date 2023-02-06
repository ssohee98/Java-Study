package kosa.board;

import java.util.Scanner;

public class Manager {
	//상태 : 글 번호, 제목, 작성자, 글 내용
	//기능 : 글쓰기, 글 목록보기, 글 세부보기
	
	Board arr[] = new Board[10];
	static Scanner sc = new Scanner(System.in);
	int count;
	
	public void addBoard() {		//글쓰기
		System.out.print("글 번호 : ");
		int num =  Integer.parseInt(sc.nextLine());	
		System.out.print("글 제목 : ");
		String name = sc.nextLine();
		System.out.print("글 작성자 : ");
		String author = sc.nextLine();
		System.out.print("글 내용 : ");
		String content = sc.nextLine();
		
		arr[count++] = new Board(num, name, author, content);
	}

	public void showList() {		//글 목록보기
		if (count < 1) {
			System.out.println("작성된 글이 없습니다.");
		}
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}
	
	public void searchList() {		//글 세부보기
		if (count < 1) { 
			System.out.println("작성된 글이 없습니다.");
		} else {
			System.out.print("글 번호 검색: ");
			int num =  Integer.parseInt(sc.nextLine());			//int 값 받을때
			int index = -1;
			
			for (int i = 0; i < count; i++) {
				if (num==arr[i].getBoardNo()) {
					index = i;
					arr[i].showDetail();
					break;
				}
			}
			
			if (index == -1) 
				System.out.println("해당글은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
			else {
				System.out.println("  [ "+(index+1)+" 번째 글입니다. ]");
			}
		}
		
	}
	
	public void addComment() {		//댓글 쓰기
		if (count < 1) { 
			System.out.println("작성된 글이 없습니다.");
		} else {
			System.out.print("댓글 작성할 글 번호 : ");
			int num =  Integer.parseInt(sc.nextLine());			//int 값 받을때
			int index = -1;
			
			for (int i = 0; i < count; i++) {
				if (num==arr[i].getBoardNo()) {
					index = i;
					arr[i].showDetail();
					break;
				}
			}
			
			if (index == -1) 
				System.out.println("해당글은 존재하지 않습니다.");	//존재하지 않는 값 처리를 해주지 않는다면 nullpoint 에러가 날것
			else {
				System.out.println("  [ "+(index+1)+" 번째 글에 댓글을 작성하셨습니다. ]");
			}
		}
	}
}
