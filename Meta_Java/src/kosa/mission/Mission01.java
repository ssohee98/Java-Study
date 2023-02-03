package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하시오.
		//5자리수 ex)12345 => 짝:2개 홀:3개
		
		/* 
		int number = 0;
		int x=0, y=0;
		int num[] = {0, 0, 0, 0, 0};
		 
		System.out.println("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		 
		for(int i = 0, a = 10000; i < 5; i++) {
			 num[i] = number/a;
			 number = number%a;
			 a = a/10;
			 
			 if (num[i]%2 == 0)
				 x++;
			 else y++;
		 }
		 
		System.out.println("짝수 : "+x+"개, 홀수 : "+y+"개");  
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 정수를 입력하세요: ");
		
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		
		even += (num/10000%2 == 0) ? 1 : 0;		    //만 자리수만 자리수가 짝수라면 1, 아니면 0 을 짝수변수 even 에 더해주기
		even += (num/1000%10%2 == 0) ? 1 : 0;		//천 자리수
		even += (num/100%10%2 == 0) ? 1 : 0;		//백 자리수
		even += (num/10%10%2 == 0) ? 1 : 0;		//십 자리수
		even += (num%2 == 0) ? 1 : 0;					//일 자리수
		
		odd = 5 - even;										//5자리로 정해뒀으므로 짝수 개수만 구해서 5에서 빼면 홀수
		
		System.out.println("짝수의 개수 : " +even);
		System.out.println("홀수의 개수 : " +odd);

		 /* 
		int A = 0;
		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		 
		int a = A/10000;
		int a1 = A%10000;
		int b = a1/1000;
		a1 = a1%1000;
		int c = a1/100;
		a1 = a1%100;
		int d = a1/10;
		int e = a1%10;
		 
		if (a%2==0) {
			x++;
			} else y++;
		 
		if (b%2==0) {
			x++;
			} else y++;
		
		if (c%2==0) {
			x++;
			} else y++;
		
		if (d%2==0) {
			x++;
			} else y++;
		
		if (e%2==0) {
			x++;
			} else y++;
		 
		System.out.println("짝수 : "+x+"개, 홀수 : "+y+"개"); 
		 */ 
		 
	}

}
