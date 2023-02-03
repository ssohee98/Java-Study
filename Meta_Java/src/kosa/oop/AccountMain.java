package kosa.oop;

public class AccountMain {

	public static void main(String[] args) { 	//여러개 객체를 생성할때마다 각각 메모리가 할당된다. 
		Account account = new Account("1111-1111", "홍길동", 1000);
		Account account2 = new Account("2222-2222", "박길동", 5000);
		
		account2.setBalance(40000);
		
		account2.withdraw(3000);
		account2.printAccount();

	}
}
