package kosa.video;

public class GeneralMember {
	//상태 : 아이디, 이름, 주소, 빌린비디오
	//기능 : 일반회원 내역 출력 (아이디, 이름, 주소, 빌린비디오)
//	Video v = new Video("1", "트랜스포머3", "서봉수");
	
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;		//멤버가 빌린 비디오(연관 관계이므로 Video 객체타입 사용)
//	private String video;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void rental(Video video) {	//비디오를 빌린다면 rentalVideo에 정보를 받아오겠음
		rentalVideo = video;
	}
	
	public void show() {
		System.out.println("회원의 아이디 : "+id);
		System.out.println("회원의 이름 : "+name);
		System.out.println("회원의 주소 : "+address);
		rentalVideo.show(); 				//빌린 비디오의 정보 출력		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

//	public GeneralMember(String id, String name, String address, String video) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.video = video;
//	}
	
//	public void showGmember(String videoId) {
//		System.out.println("회원의 아이디 : "+id);
//		System.out.println("회원의 이름 : "+name);
//		System.out.println("회원의 주소 : "+address);
//		if (videoId.equals(v.getSno())) {
//			System.out.println("회원이 대여한 비디오 번호 : "+v.getSno());
//			System.out.println("회원이 대여한 비디오 제목 : "+v.getTitle());
//			System.out.println("회원이 대여한 비디오 주인공 : "+v.getActor());
//		} else System.out.println("대여한 비디오가 없습니다.");
//	}
//	
//	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getVideo() {
//		return video;
//	}
//
//	public void setVideo(String video) {
//		this.video = video;
//	}
	

}
