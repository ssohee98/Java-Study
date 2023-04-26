package HW.order;

public class OrderMain {

	public static void main(String[] args) {
		Member m = new Member("홍길동", "가산");
		Item i = new Item("갤럭시23", 1000);
		Order o = new Order("1", 10, m, i);

		o.show();
	}
}
