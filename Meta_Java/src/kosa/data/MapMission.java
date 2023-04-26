package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한쌍으로 Map 자료구조로 표현하자  =>  김자바:80점, 박자바:90점
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고점수, 최저점수 각 출력 : Collections 클래스 => max(), min() 메소드 사용
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 80);
		map.put("박자바", 90);
		
		//map -> key
		Set<String> set = map.keySet();	//map의 key값들만	
		System.out.println("응시자 명단 : "+set);
		
		//map -> value
		Collection<Integer> values = map.values();	//map의 value값들만
		Iterator<Integer> iterator = values.iterator();
		
		int total=0;
		while (iterator.hasNext()) {		//iterator 에 값이 존재하면
			total += iterator.next();		//총점
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+total/map.size());
		System.out.println("최고점 : "+Collections.max(values));
		System.out.println("최저점 : "+Collections.min(values));


		
//		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//		int sum = 0;
//		
//		while (iterator.hasNext()) {
//			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)iterator.next();		//Map.entry로 키,값 한쌍씩 받아와서 출력  (형변환 필요)
//			String name = e.getKey();
//			int score = e.getValue();
//			
//			System.out.println("이름: "+name);
//			sum += score;
////			IntStream stream = IntStream.rangeClosed(1, map.size());
////			stream.forEach(score -> sum += score);
//		}
//		System.out.println("총합 : "+sum+"점");
//		
////		double avg = sum/map.size(); 
////		System.out.println("평균 : "+avg+''점");
//		
//		for (String key : map.keySet()) {
//			System.out.println("이름: "+map.get(key));
//		}
		

		
	}

}
