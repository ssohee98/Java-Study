package kosa.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExam {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", 20));
		list.add(new Person("박길동", 50));
		list.add(new Person("김길동", 60));
		list.add(new Person("성길동", 40));
		
//		Collections.sort(list);		//최초 정렬기준은 Compare 인터페이스의 compareTo() 메소드에서 정의
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//정렬기준 이름 오름차순
				//리턴값 음수 : aa.compareTo(bb)  
				//리턴값 양수 : bb.compareTo(aa)
				if (o1.getName().compareTo(o2.getName()) > 0) {	
					//앞과 뒤의 문자열을 비교했는데 양수 : 앞 문자열이 크다
					return 1;													
					//자리 바꿈
				} else if (o1.getName().compareTo(o2.getName()) < 0) {	
					//앞과 뒤의 문자열을 비교했는데 음수 : 뒤 문자열이 크다
					return -1;													
					//자리 안바꿈
				}
				return 0;
			}
			
		});
		
		System.out.println(list);

	}
}
