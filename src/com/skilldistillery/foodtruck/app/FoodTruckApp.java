package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp foodTruck = new FoodTruckApp();

		System.out.println("Welome to Food Truck Fanatics!");
		System.out.println();

		foodTruck.FoodTruckGenerator();
		foodTruck.makeMenu();
		foodTruck.Switch();

	

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

	public FoodTruck[] FoodTruckGenerator() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("How many trucks would you like to enter?");
		int index = userInput.nextInt();
		FoodTruck[] foodTruckArr = new FoodTruck[index];
		System.out.println("Please enter the Food Truck(s) you would like to review");
		String name = userInput.next();
		for (int i = 0; i < foodTruckArr.length; i++) {
			if (foodTruckArr.equals("quit")) {
				break;
			}
			System.out.println("Please enter a food item:");
			String foodName = userInput.nextLine();
			foodName = userInput.next();

			System.out.println("Please enter a star rating from 1-5: ");
			int rating = userInput.nextInt();
			String flush = userInput.nextLine();
			System.out.println("Thank you for your responses!");
			if (rating < 1 || rating > 5) {
				System.out.println("That review does not match up with the scale");

				// appropriately set truck names, food type, rating, and random Id =i

			}

		}
		return foodTruckArr;
	}

	public boolean Switch() {
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Please select one of the following");
			int menu = keyboard.nextInt();
			if (menu < 1 || menu > 4) {
				System.out.println("Selection incompatible, please try again");

			}
			while (menu < 1 || menu > 4)
				;
			if (menu == 4) {
				System.out.println("Thank you for your time.");
				break;
			}

			switch (menu) {

			case 1:
				System.out.println("Listing all existing Food Trucks: ");
				break;
			case 2:
				System.out.println("See the Average rating of the Trucks: ");

				break;
			case 3:
				System.out.println("Display the Highest-Rated Food Truck: ");
				break;
			case 4:
				System.out.println("Quit the Program");
				break;
			default:
				System.out.println("That is not a valid selection");
				break;

			}
		} while (true);
		return false;
	}


	public void output(FoodTruck[] truck) {
		Scanner sc = new Scanner (System.in);
		FoodTruck FT = new FoodTruck();
		int selection = 0;
		
		switch(selection) {
		
		case 1 :
			FT.listTrucks(truck);
			break;
			
		case 2 :
			FT.displayAverage(truck);
			break;
			
		case 3:
			FT.displayHighest(truck);
			break;
		case 4:
			System.out.println("Quit the Program");
			break;
			
			default:
				System.out.println("That is not a valid selection");
		}
	}

}
