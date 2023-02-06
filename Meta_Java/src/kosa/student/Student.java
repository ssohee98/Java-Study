package kosa.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	//상태 : 이름
	//기능 : 여러 과목 수강신청하기, 수강된 과목 확인하기
	Scanner sc =new Scanner(System.in);
	
	private String name;
	private List<Course> courses;		//학생이 수강신청한 과목들을 리스트에 저장	Course 객체를 리스트타입으로 참조
	int count;
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>(); 	//학생이 생겼을때 과목 리스트도 생성 
	}

	public void register(Course course) {		// 수강신청 + 해당 학생 이름 전달
		courses.add(course);
		course.addStudent(this); 		//객체 자신의 내용
	}
	
	public void cancel(Course course) {
//		for(int i = 0; i < courses.size(); i++) {		//리스트.size() 	입력된 리스트 개수 	
//			courses.remove(courses.get(i));			//리스트.get(i)	리스트 i번째 저장된 값
//		}
		
		if(courses.contains(course)) {		//수강목록에 과목이 있으면
			courses.remove(course);
			course.removeStudent(this);				//수강취소시 과목에서도 학생이 삭제되고, 학생에서도 과목이 빠져야 함
		}
	}
	
	public void printMember() {		//수강된 과목 확인
		System.out.println("학생이름 : " +name);
		for(Course course : courses ) {		// course 에 저장되어있던 courses값들을 하나씩 옮기면서 출력
			System.out.println("수강과목 : "+course.getName());
		}
		System.out.println();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
