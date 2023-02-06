package HW;

public class For1_3 {

	public static void main(String[] args) {
		int number = 5;
		int cnt = 0;
		
		for (int i = 1; i < 50; i++) {
			if (i%2==0) continue;
			
			else {
				System.out.print(i+" ");
				cnt++;
				
				if (cnt%5==0) {
					System.out.println();
				}
			}
			
		}
	}

}

