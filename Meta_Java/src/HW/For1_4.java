package HW;

import java.util.Scanner;

public class For1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("number : ");
		int num = sc.nextInt();
		
		for (int i =0; i<=num; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
