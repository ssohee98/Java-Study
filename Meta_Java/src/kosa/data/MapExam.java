package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		// Map : (key, value)  =>  HashMap
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "SSG");
		map.put("2", "MSG");
		map.put("3", "GSG");
   
		System.out.println("요소의 사이즈 : "+map.size());
		
		if (map.containsValue("SSG")) {
			map.remove("1");
		}
		
		System.out.println("요소의 사이즈 : "+map.size());
		System.out.println(map.get("3"));
		
		
		// Map 전체 목록 출력(key, value) => entrySet()
		
		// Map => Set => Iterator
		// key -> keySet() : 키값만 출력
		// value -> values() : Collection 리턴타입으로 value값만 출력
		// (key, value) -> entrySet() : key, value 모두 출력
		
		Set set = map.entrySet();		//map 안의 모든 값이 set으로 
		Iterator iterator = set.iterator();		//set 의 모든 값이 iterator로
		
		while (iterator.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iterator.next();		//Map.entry로 키,값 한쌍씩 받아와서 출력  (형변환 필요)
			System.out.println("key : "+e.getKey()+", value : "+e.getValue());
		}
	}

}
