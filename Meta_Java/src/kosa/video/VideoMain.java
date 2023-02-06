package kosa.video;

public class VideoMain {

	public static void main(String[] args) {

//		Video video = new Video("1", "트랜스포머3", "서봉수");
//		GeneralMember gMember = new GeneralMember("aaa", "홍길동", "동탄", "1");
//		
//		gMember.showGmember(gMember.getVideo());
		
		Video v1 = new Video("1", "탑건2", "톰크루즈");
		Video v2 = new Video("2", "아바타2", "모름");
		
//		GeneralMember gm = new GeneralMember("aaa", "홍길동", "동탄");
//		gm.rental(v1);		//v1 비디오름 빌림
//		gm.show();

//		SpecialMember sm = new SpecialMember("aaa", "홍길동", "동탄", 0);
//		sm.rentalVideo2(v1);		//그냥 rental(v1); 을 하면 포인트가 적립되지 않음
//		sm.show2();				//그냥 sho2(); 을 하면 포인트 정보가 출력되지 않음
//		sm.rentalVideo2(v2);		
//		sm.show2();	
		
		GeneralMember arr[] = {	//형변환해서 같이 배열에 넣기  /부모의 데이터타입으로 자식들이 함께 모이기 가넝한
				new GeneralMember("aaa", "홍길동", "동탄"),
				new SpecialMember("aaa", "홍길동", "동탄", 0)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rental(v1);
			arr[i].show();		//부모로 형변환 되면 자식 메서드는 호출되지 않음(메서드 이름이 다 다르니까)   /special 에서 rental, show 오버라이딩 => 다형성 구현
		}
	}
}
