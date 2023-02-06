package kosa.inter_face;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		return getName()+"자바화이팅";
	}

}
