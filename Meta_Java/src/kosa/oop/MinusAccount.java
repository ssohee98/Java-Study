package kosa.oop;

public class MinusAccount extends Account {

	private int creditLine;		//마이너스 한도

	public MinusAccount() {}
	
	public MinusAccount(String accountNo, String owerName, int balance, int creditLine) {
		super(accountNo, owerName, balance);
		this.creditLine = creditLine;
	}

	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) throws Exception{
		// TODO Auto-generated method stub
		
		if (getBalance() + creditLine < amount ) {	//잔액+한도 보다 큰 금액 인출시 예외처리
			throw new Exception("잔액 부족");
		}
		
		int balance = getBalance();
		setBalance(balance - amount);
		
		return amount;
	}
	

}
