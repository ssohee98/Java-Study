package kosa.basic;

public class VariableExam02 {

	public static void main(String[] args) {
		//지역변수(로컬변수) => 특정 블록, 메서드 내에서 선언된 변수
		//2가지 특징 
		//1. 반드시 초기화 후(선언 후 값까지 넣어주기) 사용해야 한다.
		int num = 0;
		
		num += 1;
		System.out.println(num);
		
		//2. 선언된 변수는 정의된 범위 안에서만 사용 가능하다.
		//지역변수는 선언된 위치가 중요
		int a = 0;
		
		if(num == 1) {
			//int a = 0;
			a = 100;
		}
		
		System.out.println("a : " + a); 		//int a 가 if 문 안에서 선언되었다면 a를 출력하려 할때 오류 발생
		

	}

}
