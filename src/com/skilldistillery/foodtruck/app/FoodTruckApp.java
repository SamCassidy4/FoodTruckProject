package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		FoodTruckApp foodTruck = new FoodTruckApp();

		System.out.println("Welome to Food Truck Fanatics!");
		System.out.println();

		FoodTruck[] foodTruckArr = foodTruck.foodTruckGenerator();

		int menu = 0;
		do {
			System.out.println("Please select one of the following");
			foodTruck.makeMenu();
			menu = keyboard.nextInt();
			if (menu < 1 || menu > 4) {
				System.out.println("Selection incompatible, please try again");

			}
			if (menu == 4) {
				System.out.println("Thank you for your time.");
				break;
			}

			switch (menu) {

			case 1:
				System.out.println("Listing all existing Food Trucks: ");
				for (FoodTruck truck : foodTruckArr) {
					if (truck == null) {
						continue;
					}
					System.out.println(truck.toString());
				}
				continue;
			case 2:
				int counter = 0;
				double sum = 0;
				System.out.println("See the Average rating of the Trucks: ");
				for (FoodTruck truck : foodTruckArr) {
					if (truck == null) {
						continue;
					}
					counter++;
					sum += truck.getRating();
				}
				System.out.print(sum / counter);
				break;
			case 3:
				String winning = "none";
				int counting = 0;
				int highest = 0;
				System.out.println("Display the Highest-Rated Food Truck: ");
				for (FoodTruck truck : foodTruckArr) {
					if (truck == null) {
						continue;
					}
					counting++;
					if (truck.getRating() > highest) {
						highest = truck.getRating();
						winning = truck.getName();
					}
				}

			default:
				System.out.println("That is not a valid selection");
				break;

			}
		} while (menu < 1 || menu > 4);

	}

	public void makeMenu() {

		System.out.println();
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("|           Welcome To the Menu!               | ");
		System.out.println("|                                              |");
		System.out.println("|           Please Choose One                  |");
		System.out.println("|                                              |");
		System.out.println("|   1. List all existing Food Trucks           |");
		System.out.println("|                                              |");
		System.out.println("|   2. See the Average rating of the Trucks    |");
		System.out.println("|                                              |");
		System.out.println("|   3. Display the Highest-Rated Food Truck    |");
		System.out.println("|                                              |");
		System.out.println("|   4. Quit the Program                        |");
		System.out.println("|                                              |");
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
	}

	public FoodTruck[] foodTruckGenerator() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("How many trucks would you like to enter?");
		int index = userInput.nextInt();
		FoodTruck[] foodTruckArr = new FoodTruck[index];
		for (int i = 0; i < foodTruckArr.length; i++) {
			System.out.println("Please enter the name of the Food Truck(s) you would like to review");
			String name = userInput.next();
			if (name.equals("quit")) {
				break;
			}
			userInput.nextLine();
			System.out.println("Please enter a food item:");
			String foodName = userInput.nextLine();

			System.out.println("Please enter a star rating from 1-5: ");
			int rating = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Thank you for your responses!");
			if (rating < 1 || rating > 5) {
				System.out.println("That review does not match up with the scale");

				// appropriately set truck names, food type, rating, and random Id =i

			}
			FoodTruck truck = new FoodTruck(name, foodName, rating);
			foodTruckArr[i] = truck;

		}
		return foodTruckArr;
	}
}
