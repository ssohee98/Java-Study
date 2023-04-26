package kosa.hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookSystem {
	private Customer customer;
	private Room room;
//	Room room;
//	private List<Customer> custList;
////	private List<Room> roomList;
	private String date;		//날짜
	private int day;		//숙박기간
	private int reserveNum;	//예약번호
	private int reserveCount;		//예약 수
	private int roomNum;		//객실번호
	private int total;			//총 금액
	
//	List<Room> roomList = new ArrayList<Room>(Arrays.asList("스탠다드", "4", 200000, "1"));
	public BookSystem() {}
//
//	public BookSystem(List<Customer> custList, List<Room> roomList, String reserveNum) {
//		super();
//		this.custList = custList;
//		this.roomList = roomList;
//		this.reserveNum = reserveNum;
//	}

//	public BookSystem(String reserveNum) {
//		super();
//		this.reserveNum = reserveNum;
//		custList = new ArrayList<Customer>();
//		roomList = new ArrayList<Room>();
//	}
	
	
	public BookSystem(Customer customer, Room room, int reserveNum, int reserveCount) {
		super();
		this.customer = customer;
		this.room = room;
		this.reserveNum = reserveNum;
		this.reserveCount = reserveCount;
	}
	

	public BookSystem(Room room, String date, int day, int reserveNum, int roomNum, int total) {
		super();
		this.room = room;
		this.date = date;
		this.day = day;
		this.reserveNum = reserveNum;
		this.roomNum = roomNum;
		this.total = total;
	}
	
	@Override
	public String toString() {
//		return "BookSystem [customer=" + customer + ", room=" + room + ", date=" + date + ", day=" + day
//				+ ", reserveNum=" + reserveNum + ", reserveCount=" + reserveCount + ", roomNum=" + roomNum + ", total="
//				+ total + "]";
		return "[예약번호("+reserveNum+") | 객실번호("+roomNum+")] 예약 날짜 : "+date+", 숙박 기간 : "+day+"일";
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public BookSystem(Room room, int reserveNum, int reserveCount, int roomNum, int total) {
		super();
		this.room = room;
		this.reserveNum = reserveNum;
		this.reserveCount = reserveCount;
		this.roomNum = roomNum;
		this.total = total;
	}
	
	
//
//	public int reserveNum() {
//		customer.reserve();
//		custList.add(customer);
//		 
//		
//		
//		return 0;
//		
//	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getReserveNum() {
		return reserveNum;
	}

	public void setReserveNum(int reserveNum) {
		this.reserveNum = reserveNum;
	}

	public int getReserveCount() {
		return reserveCount;
	}

	public void setReserveCount(int reserveCount) {
		this.reserveCount = reserveCount;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


//	public List<Customer> getCustList() {
//		return custList;
//	}
//
//	public void setCustList(List<Customer> custList) {
//		this.custList = custList;
//	}
//
//	public List<Room> getRoomList() {
//		return roomList;
//	}
//
//	public void setRoomList(List<Room> roomList) {
//		this.roomList = roomList;
//	}
//
//	public String getReserveNum() {
//		return reserveNum;
//	}
//
//	public void setReserveNum(String reserveNum) {
//		this.reserveNum = reserveNum;
//	}
	
	
}