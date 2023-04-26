package kosa.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberMain {

	public static void main(String[] args) {
		// List에 Member 객체 3개를 추가
		// stream을 이용해서 출력해보자
		
		List<Member> list = new ArrayList<Member>();
//		
//		Member m = new Member("홍길동", 29);
//		Member m2 = new Member("박철수", 35);
//		Member m3 = new Member("김영희", 53);
//		
//		list.add(m);
//		list.add(m2);
//		list.add(m3);
//		
//		Stream<Member> stream = list.stream();
//		stream.forEach(member -> System.out.println(member.getName()+", "+member.getAge()));
		
		
		IntStream.range(0, 3).forEach(i -> list.add(new Member("user"+i, 20)));
		
		list.stream().forEach(member -> System.out.println(member.getName()));
	}
}
