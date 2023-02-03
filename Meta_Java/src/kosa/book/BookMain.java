package kosa.book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int totalPrice = 0;		//지역변수이므로 초기화
		
		Book arr[] = {				//배열 선언하면서 바로 초기화
				new Book("Java", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000),
		};
		
		for (Book book : arr) {		//arr 배열에서 Book 객체로 값이 하나씩 넘어옴
			book.discount();
			book.show();
			totalPrice += book.getDc_price();
		}
		
		System.out.println("총합 : "+totalPrice+"원");
		
//		Book book = new Book("Java", 30000);
//		Book book2 = new Book("JSP", 20000);
//		Book book3 = new Book("Oracle", 15000);
//		
//		book.discount();
//		book.show();
//		
//		book2.discount();
//		book2.show();
//		
//		book3.discount();
//		book3.show();
		
	}

}
