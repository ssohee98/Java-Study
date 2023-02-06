package kosa.board;

import java.util.Scanner;

public class Board {
	//상태 : 글 번호, 제목, 작성자, 글 내용, 댓글
	//기능 : 글쓰기, 글 목록보기, 글 세부보기, 댓글쓰기 (하나의 글에 여러 댓글 가능)

	Scanner sc = new Scanner(System.in);
	
	private int boardNo;
	private String boardName;
	private String boardAuthor;
	private String boardContent;
	private String boardComment;
	
	public Board() {}

	public Board(int boardNo, String boardName, String boardAuthor, String boardContent) {
		super();
		this.boardNo = boardNo;
		this.boardName = boardName;
		this.boardAuthor = boardAuthor;
		this.boardContent = boardContent;
	}
	
	
	public void show() {
		System.out.println("No. "+boardNo+" | 제목 : "+boardName+" | 작성자 : "+boardAuthor);
	}
	
	public void showDetail() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("No. "+boardNo+" | 제목 : "+boardName+" | 작성자 : "+boardAuthor);
		System.out.println("글 내용 : "+boardContent);
		if (boardComment.equals(null)) {
			System.out.println("아직 작성된 댓글이 없습니다.");
		} else {
			
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	public void addComment() {
		System.out.print("글 제목 : ");
		String name = sc.nextLine();
	}
	
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}


	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}

	public String getBoardAuthor() {
		return boardAuthor;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	

	public String getBoardComment() {
		return boardComment;
	}

	public void setBoardComment(String boardComment) {
		this.boardComment = boardComment;
	}
	
}
