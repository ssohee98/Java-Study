package kosa.bank;

public class Account {
	//상태 : 아이디, 잔액
	//기능 : 입금, 출금
	private String id;
	private long balance;
	
	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public void deposit(long amount) {		//입금
		balance += amount;
	}
	
	public boolean withdraw(long amount) {		//출금
		if (balance < amount) {					//출금 조건 (잔액보다 요청액이 많으면 거부)
			return false;
		}
		
		balance -= amount;						//조건 만족하면 잔액 변경되고 출금액 리턴
		return true;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
