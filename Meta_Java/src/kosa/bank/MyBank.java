package kosa.bank;

import java.util.Scanner;

public class MyBank {
	static Scanner sc = new Scanner(System.in);
	
	Customer customers[] = new Customer[10];
	private int customersNum;
	
	public MyBank() {}

	public MyBank(Customer[] customers, int customersNum) {
		super();
		this.customers = customers;
		this.customersNum = customersNum;
	}
	
	public void addCustomer(String id, String name, long balance) {
		//1. 고객등록
		customers[customersNum++] = new Customer(id, name, balance);		
	}
	
	
	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		//
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}

	public Customer getCustomer(String id) {
		//
		
		int index = -1;
		
		for (int i = 0; i < customersNum; i++) {
			if (id.equals(customers[i].getId())) {
				index = i;
				break;
			}
		}
		
		if (index == -1) 
			return null;		//존재하지 않는 아이디 검색시 nullPointException 발생
		else return customers[index];
		
//		Customer cust = null;
//		
//		for(int i=0;i<customersNum;i++) {
//			if(customers[i].getId().equals(id)) {
//				cust = customers[i];
//				break;
//			}
//		}
//		
//		return cust;
	}
	
	public Customer[] getAllCustomer() {
		//3. 고객전체보기
		Customer cust[] = new Customer[customersNum];
		
		for (int i = 0; i < customersNum; i++) {
			cust[i] = customers[i]; 
		}
		
//		System.arraycopy(customers, 0, cust, 0, customersNum);		//arraycopy(원본배열, 시작점, 복사할곳 배열, 시작점, 복사할개수)
		
		return cust;
	}
}
