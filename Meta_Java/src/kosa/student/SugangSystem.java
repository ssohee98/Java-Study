package kosa.student;

public class SugangSystem {

	public static void main(String[] args) {
		Course c1 = new Course("전산학개론");		
		Course c2 = new Course("기초통계학");
		Course c3 = new Course("빅데이터개론");

		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길동");
		
		s1.register(c1);		//s1학생이 c1과목을 신청
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		s2.cancel(c2);			//s2학생이 c2과목을 취소
		
//		s1.printMember();		//신청한 과목 조회
//		s2.printMember();

		c1.printCourse();		//전산학개론 신청학생 출력
		c2.printCourse();
	}
}
