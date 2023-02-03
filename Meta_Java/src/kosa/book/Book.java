package kosa.book;

public class Book {
	//상태 : 제목, 정가, 할인된 가격
	//기능 : 금액별 DC, 책 정보 출력
	
	private String bookName;
	private int price;
	private int dc_price;
	
	public Book() {}

	public Book(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	
	public void discount() {
		if (price >= 30000) {
			dc_price = (int)(price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int)(price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	public void show() {
		System.out.println(bookName+" 교재는 정가는 "+price+"원, 할인된 가격은 "+dc_price+"원 입니다.");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}
	
	
//	private String name;
//	private int price;
//	private double nprice;
//	private double sum;
//	
//	public Book() {}
//
//	public Book(String name, int price) {
//		super();
//		this.name = name;
//		this.price = price;
//	};
//	
//	public void show() {
//		System.out.println(name+" 교재는 정가는 "+price+"원, 할인된 가격은 "+(int)nprice+"원 입니다.");
//	}
//	
//	public void discount() {
//		if (price >= 30000) nprice = price * 0.75;
//		else if (price >= 20000) nprice = price * 0.80;
//		else if (price >= 15000) nprice = price * 0.85;
//		else nprice = price; 
//	}
//
////	public void sum() {
////		sum = 
////	}
//	
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	
	
}
