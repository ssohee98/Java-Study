package kosa.data;

public class Person implements Comparable<Person>{	//최초 정렬기준
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {	//최초 정렬기준 정의 : 나이 오름차순
		if (age < o.age) {
			return -1;			//자리 안바꿈
		} else if (age > o.age) {
			return 1;			//자리 바꿈
		}
		return 0;
	}
	
}
