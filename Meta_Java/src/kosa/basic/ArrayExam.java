package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExam {

	public static void main(String[] args) {
//		int arr[] = {1, 2, 3};
//		int brr[] = arr;			// brr 에게 arr의 주소값을 복사 (같은 값을 참조/ brr에서 값 수정시 arr에도 바뀜)
//		
//		brr[0] = 10;
//		System.out.println("brr: " + brr[0]);
//		System.out.println("arr: " + arr[0]);

		
//		int arr[] = {3, 2, 4};
//		int brr[] = arr;
//		
//		System.out.println(Arrays.toString(arr));		//배열의 내용을 출력하려면 Arrays.toString(arr)을 사용함.
//		System.out.println(arr.toString());				//배열 자체에서 arr.toString()을 사용하면 배열의 내용이 아니라 배열의 주소값이 출력
//		System.out.println(arr);							//역시 배열은 주소값을 저장하므로 주소값이 출력
//		
//		Arrays.sort(arr);		// 오름차순 정리
//		System.out.println(Arrays.toString(arr));

		
//		// 내림차순 정리 = Arrays.sort(arr, Collections.reverseOrder());
//		for(int i = 0; i < arr.length-1; i++ ) {			//배열은 인덱스가 0부터 시작하므로 조건 마지막을 배열크기-1 로 지정
//            for (int j = i+1; j < arr.length; j++ ) {
//                if(arr[j] > arr[i]) {
//                    int a = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = a;
//                }
//            }
//        }
//		
//		System.out.println(Arrays.toString(arr));
		
//		//오름차순 정리가 되어있다는 가정 >> 배열 거꾸로 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[arr.length-1-i]+", ");
//		}
//		
//		for (int i = arr.length-1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
		
		//2차원 배열
		int arr2[][] = {{2,90}, {1,60}, {3,20}};
		
		//Arrays.sort(arr2);		XXX								//2차원 배열은 정렬이 되지 않음 (앞인지 뒤인지 정렬 기준을 모르잖아!!) 
		Arrays.sort(arr2, new Comparator<int[]>() {	//=> 2차원 정렬하려면 추상 파라미터 사용하여 정렬 기준 오버라이딩

			@Override
			public int compare(int[] o1, int[] o2) {
				//정렬 기준 작성 : 1차원 배열안에 첫번째 요소를 기준으로 오름차순
				if (o1[0] < o2[0]) {
					return -1; 		//뒤 수가 더 크면 자리 이동X(-1) => 내림차순을 원하면 return 1
				} else if (o1[0] > o2[0]) {
					return 1;		//앞 수가 더 크면 자리 이동O(1) => 내림차순을 원하면 return -1
				} else {
					return 0;
				}
			}	
		});
		
		
		System.out.println(Arrays.deepToString(arr2));		//2차원 배열을 출력하려면
	}
}
