package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String owerName, int balance, String cardNo) {
		super(accountNo, owerName, balance);		//부모 클래스의 생성자 호출
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception{
		if (!cardNo.equals(this.cardNo) || getBalance() < amount) {		//balance 는 부모클래스에 private 으로 선언되었으므로 getBalance()로 받아오기
			throw new Exception("결재 불능");										//카드 번호가 다르거나 잔액이 부족할때 의도적으로 오류 발생시키기
		}
		
		return withdraw(amount);		//부모의 withdraw 메소드 그대로 사용
	}
}
