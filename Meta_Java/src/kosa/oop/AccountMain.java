package kosa.oop;

public class AccountMain {

	public static void main(String[] args) { 	//여러개 객체를 생성할때마다 각각 메모리가 할당된다. 
//		Account account = new Account("1111-1111", "홍길동", 1000);
//		Account account2 = new Account("2222-2222", "박길동", 5000);
//		
//		account2.setBalance(40000);
//		
//		account2.withdraw(3000);
//		account2.printAccount();

		
//		CheckingAccount ca = new CheckingAccount("1111-1111", "홍길동", 10000, "1111-1111"); 
//		
//		try {		//CheckingAccount pay에서 던진 예외 처리/ 예외발생하는 순간 멈추고 catch로 넘어감
//			ca.pay("1111-1111", 3000); 
//		} catch (Exception e) {	//예외 발생하면
//			e.printStackTrace();
//		} finally {	//예외가 발생하던 발생하지 않던 무조건 실행할 부분
//			
//		}
//		
//		ca.printAccount();
		
		
		Account account = new MinusAccount("1111-1111", "홍길동", 5000, 10000);	//잔액 5000  한도 10000
		
		try {
			account.withdraw(12000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		account.printAccount();
	}
}
