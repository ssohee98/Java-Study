package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		//변수 선언시 주의사항
		//변수명은 특수문자 사용X, 숫자로 시작X, 소문자로 시작O, 합성어=> 두번째 단어 첫자 대문자
		
		int num;		//(지역)변수 선언(메모리 할당)
		num = 10; 		//변수 초기화
		
		int num2 = 20; 		//변수 선언+초기화 함께

		//기본 리터럴
		//정수값 => int/ 실수값=> double/ 'A' => char/ "문자열" => String/ true => boolean	기본적으로 정해져 있음
		double d = 3.14;
		float f = 3.14f; 	//float 에 더 큰 double형을 넣으려고 해서 오류가 남. (float)3.14/ 3.14f 로 강제 형변환 해줘야 함
		
		//byte < short < int < long < float < double
		//형변환(Casting)
		//묵시적 형변환
		//큰 데이터형 <--- 작은 데이터형 (O)
		//큰 데이터형 ---> 작은 데이터형 (X) : 강제 형변환 필요
		
		//강제 형변환 : 데이터 손실 유발
		int b = (int)3.14;
		System.out.println("b: " + b);
		
		double num3 = 3.14 + 1;
		System.out.println(num3);		//실수형 계산시 답과 다르게 오류가 나올수도 4.140000000000001
		
		if(num3 == 4.14) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}	
		
		//int <==> char(아스키코드) 형변환
		char num4 = 'A';
		System.out.println((int)num4);	//아스키코드 A 정수값을 보기 위해 형변환 / A를 보고 싶으면 (char)(int)num4
		
		String str = new String("AAA");
		String str2 = "BBB";		//String만 예외로 바로 초기화 가능
		
		//String <==> int 형변환			String 이 끝판왕 어떤 데이터타입과 붙던 String이 된다.
		String num5 = "1";
		//int result = num5 + 1;			String 과 붙어 String이 되었는데 int로 변환하니 오류가 난다.
		int num6 = Integer.parseInt(num5);		//String 타입으로 받은 num5를 int 로 변환하여 더해주면 오류가 해결된다.
		int result = num6 + 1;
		System.out.println(result);
		
		//int <==> String 형변환
		int num7 = 100;
		String num8 = String.valueOf(num7);
		String num9 = num7 + "";			// 정수와 문자열(String)을 합하면 자동으로 String이 된다.
		System.out.println(num9);
		
		//퀴즈
		String str4 = 7 + "7" + 7;
		System.out.println(str4);
	}

}
