package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로 수학수식을 입력 Stack으로
		// ((2+3)+10)  =>  괄호 열고 닫고 짝이 맞는지  괄호개수가 일치/불일치 판단

		Scanner sc = new Scanner(System.in);
		
		Stack<String> s = new Stack<String>();
		
		System.out.print("수학수식을 입력하시오 : ");
		String str = sc.nextLine();
		
		try {
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);	//입력받은 수식을 한글자씩 가져오기
				
				if (ch == '(') {		//( 괄호가 나오면 스택에 저장
					s.push(ch + "");
				} else if (ch == ')') {		//) 괄호가 나오면 스택에서 삭제	=> 스택에 값이 남아있으면 불일치/ 비어있으면 일치
					s.pop();						// ) 개수가 더 많으면 없는 스택에 또 pop 하니까 에러 try-catch로 처리=> 에러가 나도 불일치
				}
			}
			
			if (s.isEmpty())
				System.out.println("괄호 일치");
			else System.out.println("괄호 불일치");
		} catch (Exception e) {
			System.out.println("괄호 불일치");
		}
		
		
//		Stack<Character> s = new Stack<Character>();
//		
//		System.out.println("수학수식을 입력하시오 : ");
//		
//		String str = sc.nextLine();
//		int x = 0;
//		int y = 0;
//		
//		for(int i = str.length()-1; i > -1; i--) {
//			s.push(str.charAt(i));
//		}
//		
//		
//		if (x == y) System.out.println("괄호 개수 일치");
//		else System.out.println("괄호 개수 불일치");
	}
}
