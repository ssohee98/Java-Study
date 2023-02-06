package kosa.oop2;

public class Person {
	private String name;
	private Role role;
	
	public Person() {}

	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();		//role은 doing메소드를 반드시 갖는다고 확신 가능
	}
}
