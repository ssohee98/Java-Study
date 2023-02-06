package kosa.inter_face;

public class Student extends Man {

	public Student(String name) {
		super(name);
	}
	
	public String Speak() {
		return getName()+"공부나 열심히해";
	}
}
