package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private int TruckId = (int)Math.random() *1 +1000;
	private String name;
	// unique numeric id
	private String food;
	private int rating;

	public FoodTruck() {

	}

	public FoodTruck(String name, String food, int rating) {
		this.name = name;
		this.food = food;
		this.rating = rating;

	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
		nextTruckId++;
	}

	public int getTruckId() {
		return TruckId;
	}

	public void setTruckId(int truckId) {
		TruckId = truckId + nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String toString() {
		return "FoodTruck TruckId = " + getTruckId() + ", name = " + name + ", food = " + food + ", rating = " + rating
				+ "]";
	}
		

	}
		

