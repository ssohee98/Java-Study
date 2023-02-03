package kosa.basic;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		// 퀴즈 >> 1~100 까지의 정수 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		
//		int num = 100;
//		
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i%2==0) continue;
//			if (i%3==0) continue;
//			
//			
//			else {
//				System.out.print(i+" ");
//			}
//		}
//
//		// if(!(i%2==0) || (i%3==0)) {
//		//		System.out.print(i+", ") }
		
		// 퀴즈2 >> 2개의 정수를 입력받아 b-a의 결과가 항상 양의 정수가 나오도록 구현하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		
//		while(true) {
//			System.out.println("2개 정수를 입력하시오 : ");
//			
//			a = sc.nextInt();
//			b = sc.nextInt();
//			
//			if (a < b) break;			// b가 더 클때만 무한루프를 나와서 계산값을 출력
//		}
//		
//		System.out.println("b-a = "+(b-a));
//		
//		
		do {
			System.out.print("2개 정수를 입력하시오 : ");
			
			a = sc.nextInt();
			b = sc.nextInt();
			
		} while(a > b);			// 일단 정수 2개를 입력받고 a가 b보다 크면 무한루프, 아니면 처음 실행 그대로 루프 건너뜀
		
		System.out.println("b-a = "+(b-a));
		
		
	}
}
