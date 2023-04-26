package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
//		list.forEach(i -> System.out.print(i+", "));
		
		String arr[] = {"aa", "cc", "bb"};
		List<String> list2 = Arrays.asList(arr);		//arr 배열을 list2 리스트로 생성

		Stream<String> stream1 = Arrays.stream(arr);		//arr 배열을 stream1 스트림으로 생성
		Stream<String> stream2 = list2.stream();				//list2 리스트를 stream2 스트림으로 생성
		
//		stream1.sorted().forEach(System.out::println);		//stream1을 정렬해서 각각 하나씩 출력
		stream2.sorted().forEach(System.out::println);	
	}
}
