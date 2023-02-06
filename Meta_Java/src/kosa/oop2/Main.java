package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		//Work => Study 
		Work work = new Work();
		Study study = new Study();
		
//		Person person = new Person("홍길동", work);
//		Person person = new Person("홍길동", study);
//		person.doIt();			//Person객체가 Work객체를 갖고 있으므로 Person의doIt에서 Work의doing 호출
		
		Person person = new Person("홍길동", new Role() {		//익명 내부클래스
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("Driver Role");
			}
		}); person.doIt();

	}

}
