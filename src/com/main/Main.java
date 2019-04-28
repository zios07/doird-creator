package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Menu> menu = new ArrayList<>();

	public static void main(String[] args) {
		initializeMenu();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" ------ \n");
		System.out.println("Application Menu : \n");
		System.out.println(" ------ \n");
		menu.stream().forEach(item -> System.out.println(item.getTitle() + "\n"));
		System.out.println(" ------ \n");
		System.out.println("ENTER THE NUMBER OF THE MENU : \n");

		if (!sc.hasNextInt()) {
			System.out.println("please enter a valid number");
			sc.close();
			sc2.close();
			return;
		}

		int i = sc.nextInt();

		if (i == 1) {
			System.out.println(" \n You choosed " + menu.get(i - 1) + " \n");
			System.out.println("Enter a type :");
			String type = sc2.nextLine();
			Search.getAllModelsByType(Setup.newDroids, type).stream().forEach(droid -> {
				System.out.println("\n" + droid + "\n");
			});
		} else if (i == 2) {
			System.out.println(" You choosed " + menu.get(i - 1) + " \n");
			System.out.println("Enter a type :");
			String type = sc2.nextLine();
			System.out.println(Search.getSingleModelByType(Setup.newDroids, type));
		} else if (i == 3) {
			System.out.println(" You choosed " + menu.get(i - 1) + " \n");
			System.out.println(Search.getTotalModelsPerType(Setup.newDroids));
		} else if (i == 4) {
			System.out.println(" You choosed " + menu.get(i - 1) + " \n");
			System.out.println("Enter a part :");
			String donation = sc2.nextLine();
			System.out.println(Search.getDonorOfPart(Setup.donations, donation));
		} else {
			System.out.println("please enter a valid number");
		}
		sc.close();
		sc2.close();
	}

	private static void initializeMenu() {
		menu.add(new Menu(1, "1.	All available models of a particular type"));
		menu.add(new Menu(2, "2.	One model of a particular type "));
		menu.add(new Menu(3, "3.	Total counts of available types "));
		menu.add(new Menu(4, "4.	A model that donated a particular part "));
	}

}
