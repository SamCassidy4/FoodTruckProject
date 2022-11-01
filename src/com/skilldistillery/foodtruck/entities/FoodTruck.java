package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 100;
	private int TruckId;
	private String name;
	// unique numeric id
	private String food;
	private int rating = 0;

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
		return "FoodTruck TruckId = " + TruckId + ", name = " + name + ", food = " + food + ", rating = " + rating
				+ "]";
	}

	public void listTrucks(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck == null) {
				break;
			} else {
				System.out.println("Food Truck: " + foodTruck.name + "\n" + "Food Type: " + foodTruck.food + "\n"
						+ "Rating: " + foodTruck.rating + "\n" + "Truck ID: " + foodTruck.TruckId);
			}
		}
	}

	public void displayAverage(FoodTruck[] rating) {
		int sum = 0;
		for (int i = 0; i < rating.length; i++) {
			sum += rating[i].getRating();
		}
		int average = sum / rating.length;
		System.out.println("Average of all existing Food Trucks: ");

	}
	public void displayHighest(FoodTruck[] trucks) {
		int rating = trucks[0].getRating();
		
		for(int i = 0; i < trucks.length; i++) {
			if (trucks[i].getRating() > rating) {
				rating = trucks[i].getRating();
			}
			

		}
	}
}
