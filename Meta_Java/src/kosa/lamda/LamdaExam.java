package kosa.lamda;

public class LamdaExam {

	public static void main(String[] args) {
		//MyType => 익명내부클래스로 구현하기
		
		MyType myType = new MyType() {			//익명내부클래스로 MyType타입 객체 생성하고
			
			@Override
			public void hello() {			//MyType의 hello메소드 오버라이딩하여
				System.out.println("익명클래스 형식입니다.");
			}
		};
		
		myType.hello();		//메소드 호출
		
		
		//람다식으로 구현
		MyType myType2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		
		myType2.hello();
		
		MyType myType3 = () -> System.out.println("향상된 람다식");
		myType3.hello();
		
		YourType yourType = (String message) -> {
			System.out.println("메시지 : "+message);
		};
		
		yourType.talk("안녕");
		
		YourType yourType2 = message -> System.out.println("메시지 : "+message);
		yourType2.talk("안녕");
		
		
		//MyNumber getMax 구현하여 두개의 파라미터 값 중 큰 값 출력하기
//		MyNumber mNumber = (int num1, int num2) -> {
//			if(num1 > num2) return num1;
//			else return num2;
//		};
		
		MyNumber mNumber = (x, y) -> (x > y) ? x : y;		//맨 앞 식을 만족하면 2번째, 만족못하면 3번째
		
		System.out.println(mNumber.getMax(10, 20)+"이 더 크다.");
		
		
		//Runnable 인터페이스 이용해서 람다식으로 1-10까지 출력
		Runnable r = () -> {
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);		//1초마다 한번씩 실행
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}
