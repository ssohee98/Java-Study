package kosa.student;

import java.util.ArrayList;
import java.util.List;

public class Course {
	// 상태 : 과목이름
	// 기능 : 여러 과목 개설하기, 과목당 신청한 학생이름 출력
	
	private String name;
	private List<Student> students;
	
	public Course() {}

	public Course(String name) {
		super();
		this.name = name;
		students = new ArrayList<Student>();		//과목이 생기면 학생 리스트도 생성
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	

	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void printCourse() {		//과목당 수강신청 학생 출력
		System.out.println("과목명 : "+name);
		for(Student student : students ) {
			System.out.println("수강신청 학생명 : "+student.getName());
		}
		System.out.println();
	}

	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
