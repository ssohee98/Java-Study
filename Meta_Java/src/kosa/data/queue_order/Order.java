package kosa.data.queue_order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
	Scanner sc =new Scanner(System.in);
	private int amount;
	private List<Food> foodList;
	
	public Order() {}

	public Order(ArrayList<Food> foodList, int amount) {
		super();
		this.amount = amount;
		foodList = new ArrayList<Food>();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
	
}
