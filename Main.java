package oop.indwes.main;

import java.util.ArrayList;
import java.util.Scanner;

import oop.indwes.entites.Bill;

public class Main {

	static void optionsChoice() {
		System.out.println("1. Register a new bill. ");
		System.out.println("2. List total amount of existing bills.");
		System.out.println("3. Exit the program!");
	}

	public static void main(String[] args) {

		int choice;
		Scanner options = new Scanner(System.in);
		System.out.println("Welcome to your bill management system! Here are your options: ");
		System.out.println();
		optionsChoice();
		choice = options.nextInt();

		// ArrayList that keeps track of all the bills
		ArrayList<Bill> bills = new ArrayList<Bill>();
		double total = bills.stream().mapToDouble(Bill::getBillAmount).sum();


		boolean stop = false;

		do {
			// User is choosing to register a new bill
			if (choice == 1) {
				Scanner userInput = new Scanner(System.in);
				System.out.println();
				System.out.println("Please enter the type of the bill and the amount of the bill: ");
				String billType = userInput.next();
				double billAmount = userInput.nextDouble();

				

				bills.add(new Bill(billType, billAmount));

				
				for (Bill b : bills) {
					System.out.println(b.toString());

				}

				System.out.println();
				System.out.println("Thanks for adding a bill! Here are your options:");
				optionsChoice();
				choice = options.nextInt();
			}

			// User wants to get the total amount of the bills
			if (choice == 2) {
				if (bills.size() == 0) {
					System.out.println("There are currently no bills.");
					System.out.println();
				} 
				else {
					 if (bills.size() == 1) {
						System.out.println("There is currently " + bills.size() + " bill and the total amount is: $" + bills.stream().mapToDouble(Bill::getBillAmount).sum());
					} 
					 else {
						System.out.println("There are currently " + bills.size() + " bills and the total amount is: $" + bills.stream().mapToDouble(Bill::getBillAmount).sum());
					}

				}

		
				// User is asked once again if they want to register a bill,
				// list total amount of existing bills, or exit the program.
				System.out.println("Here are your options:");
				optionsChoice();
				choice = options.nextInt();

			}
			
			// User has quit the application
			if (choice == 3) {
				System.out.println();
				System.out.println("Thanks for playing!");
				stop = true;
			}
		} while (!stop);
	}

}
