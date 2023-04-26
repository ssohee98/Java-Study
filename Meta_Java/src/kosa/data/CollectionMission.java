package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {

	public static void main(String[] args) {
		// 로또번호 : 1-45 중복되지 않는 정수 6개 출력
		
		Random random = new Random();
		int size = 6;
		
		// 1. 배열
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(45)+1; 
			for (int j = 0; j < i; j++) {		//중복 체크
				if (a[i]==a[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(a);	//배열 정렬
		System.out.println(Arrays.toString(a));	//배열 저장된 실제 값을 출력
		
		
		
		
		// 2. List(ArrayList)
		List<Integer> aList = new ArrayList<Integer>();

		while (true) {		
			int n = random.nextInt(45)+1;
			if (aList.contains(n)) {		//중복되면 다시 난수 생성
				continue;
			} else {
				aList.add(n);
			}
			
			if(aList.size()==size) break;	//중복되지 않은 6개 값이 리스트에 저장되면 나오기
		}

		Collections.sort(aList); 		//ArrayList 정렬
		System.out.println(aList);
		
		
		
		
		// 3. Set(TreeSet)	set은 처음부터 중복허용X +정렬됨
		
		// 기본 정렬 조건 : Comparable(interf) --implements--> comparTo() 오버라이딩
		// 필요에 따라 정렬기준 변경 : Comparator(interf)  --implements-->  compare() 오버라이딩
		
//		Set set = new TreeSet<Integer>();
		
		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {		//익명 내부클래스로

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순으로 정렬기준 변경
				if (o1 < o2) {
					return 1;		//자리 바꿈
				} else if (o1 > o2) {
					return -1;
				}
				return 0;			//자리 안바꿈
			}
			
		});
		
		for (int i = 0; set.size() < size; i++) {		//set의 사이즈가 6개가 될때까지
			set.add(random.nextInt(45)+1); 		//중복 체크할 필요 없음
		}
		
		//정렬할 필요 없음
		System.out.println(set);
		
		
		// 람다식으로 내림차순 정렬기준 변경하면
//		Set<Integer> set2 = new TreeSet<Integer>((Integer o1, Integer o2) -> o2 - o1);
//		
//		for (int i = 0; set.size()<size; i++) {
//			set2.add(random.nextInt(45)+1);
		
	}
}
