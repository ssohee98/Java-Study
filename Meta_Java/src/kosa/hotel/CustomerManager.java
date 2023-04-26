package kosa.hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {

	Scanner sc = new Scanner(System.in);
	LinkedList<Customer> list = new LinkedList<Customer>();
	LinkedList<Customer> login = new LinkedList<Customer>();

	public void join() {		//회원가입
			System.out.print("id : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("전화번호 : ");
			String phoneNo = sc.nextLine();
			System.out.println("카드 번호: ");
			String cardNo = sc.nextLine();
			
			list.add(new Customer(id, pw, name, phoneNo, cardNo));
	}
	
	public List<Customer> login(){		//로그인
		LinkedList<Customer> list2 = new LinkedList<Customer>();
		
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		for(int i = 0; i < list.size(); i++) {
			if(!(list.get(i).getId().equals(id))||!(list.get(i).getPw().equals(pw))) {
				System.out.println("정보가 틀립니다. 다시 입력해주세요.");
			}else {
				list2.add(0,new Customer(list.get(i).getId(), list.get(i).getPw(),
						list.get(i).getName(), list.get(i).getPhoneNo(), list.get(i).getCardNo()));
			}
		}
		return list2;
	}
	
	public List<Customer> name(){
		int a = -1;
		
		while(a == -1 || login.isEmpty()) {
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				join();
			}else if(input.equals("2")) {
				login = (LinkedList<Customer>)login();
				a = 1;
			}
		}
		return login;
	}
}