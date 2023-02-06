package kosa.video;

public class SpecialMember extends GeneralMember {
	//상태 : 특별회원 관련 정보 (보너스포인트)
	//기능 : 비디오를 빌릴때마다 보너스포인트 적립. 보너스정보 출력
	
	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}
	
//	public void rentalVideo2(Video video) {
//		super.rental(video);		//general 에서 비디오 대여 정보를 받아오고	
//		bonusPoint += 10;		//그때마다 보너스 10점씩 적립	
//	}
	

	@Override	//타입이 다른 general/special memeber 를 함께 처리하기 위해 오버라이드해서 다형성
	public void rental(Video video) {
		super.rental(video);
		bonusPoint += 10;
	}
	
//	public void show2() {
////		System.out.println("회원의 아이디 : "+getId());
////		System.out.println("회원의 이름 : "+getName());
////		System.out.println("회원의 주소 : "+getAddress());
////		
////		getRentalVideo().show(); 				//빌린 비디오의 정보 출력		
////		System.out.println("회원의 보너스 포인트 적립 : "+bonusPoint);		
//		
//		super.show();
//		System.out.println("회원의 보너스 포인트 적립 : "+bonusPoint);
//		System.out.println();
//	}

	@Override
	public void show() {
		super.show();
		System.out.println("회원의 보너스 포인트 적립 : "+bonusPoint);
		System.out.println();
	}
	
	


}
