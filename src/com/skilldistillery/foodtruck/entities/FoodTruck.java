package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 1;
	private int truckId;
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
		this.truckId = nextTruckId;
		nextTruckId++;
	
		

	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
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

	@Override
	public String toString() {
		return "FoodTruck [TruckId=" + truckId + ", name=" + name + ", food=" + food + ", rating=" + rating + "]";
	}

	
	}
		

	
		

