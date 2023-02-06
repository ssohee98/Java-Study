package kosa.mission;

import java.util.Arrays;

public class Mission02 {

	public static void main(String[] args) {
		// 여러명의 성적을 관리할 수 있는 프로그램을 구현해 보자.
		// 키보드로부터 각 과목별로 점수를 선언해서 구현하자.
		// 번호		국어	영어	수학	총점	평균
		//	1		90		98		91		279	95
		//	2		21		45		43		109	45
		//==========================
		//	총점	111	143	134	
		//	평균	50		60		70	

		int score[][] = {{90,98,91}, {21,45,43}};
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i<score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			
			avg = sum/3;
			System.out.println(sum+" "+avg);
			
			sum = 0;
		}
		
		for (int i = 0; i<=score.length; i++) {		  //배열에 성적이 2개이므로 그냥 < score.length 하면 가로는 계산이 가능하지만 세로는 2개까지만 계산함
			for (int j = 0; j < score.length; j++) {
				sum += score[j][i];
			}
			
			avg = sum/2;
			System.out.println(sum+" "+ avg);
			sum = 0;
		}
		
		
//		System.out.println(Arrays.deepToString(score));
		
	}

}
