package kosa.oop;

public class Account {
	//계좌 객체
	//상태(필드) : 계좌번호, 계좌주, 잔액 => 멤버변수
	//기능(메서드) : 입금하다. 출금하다.
	
	private String accountNo;			//같은 클래스 내에서만 접근 가능하도록 private 설정
	private String owerName;
	private int balance;

	public Account() {} 	//***클래스의 디폴드 생성자 반드시 만들어주기*** => 상속 관계시 자식이 생겼을때 디폴드 생성자가 있지 않으면 오류가 날것. (언제든 부모가 될 수 있도록)
	
	public Account(String accountNo, String owerName, int balance) {		//객체를 초기화 하기 위해 생성자 만들기
		super();
		this.accountNo = accountNo;
		this.owerName = owerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {		//입금만 할 것이므로 리턴타입 필요X, 얼마를 입금할지 파라미터 값을 받기
		balance += amount;
	}
	
	public int withdraw(int amount) throws Exception{		//얼마를 출금했는지 리턴
		if (balance < amount) {					//출금 조건 (잔액보다 요청액이 많으면 거부)
			throw new Exception("잔액 부족");
		}
		balance -= amount;						//조건 만족하면 잔액 변경되고 출금액 리턴
		
		return amount;
	}
	
	public void printAccount() {				//출력 메소드
		System.out.println("계좌번호 : "+accountNo);
		System.out.println("계좌주 : "+owerName);
		System.out.println("잔액 : "+balance);
	}
	
	// private 설정했기 때문에 사용 가능하도록
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
