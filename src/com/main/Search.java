package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Search {

	public static List<Droid> getAllModelsByType(Map<Integer, Droid> items, String type) {
		List<Droid> result = new ArrayList<>();
		for (Droid droid : items.values()) {
			if (droid.getName().trim().equals(type)) {
				result.add(droid);
			}
		}
		return result;
	}

	public static Droid getSingleModelByType(Map<Integer, Droid> items, String type) {
		for (Droid droid : items.values()) {
			if (droid.getName().equals(type)) {
				return droid;
			}
		}
		return null;
	}

	public static String getTotalModelsPerType(Map<Integer, Droid> items) {
		long count1 = 0;
		long count2 = 0;
		long count3 = 0;
		long count4 = 0;
		Parts part = new Parts();
		for (Droid droid : items.values()) {
			if (droid.getName().equals(part.getNewName()[0])) {
				count1++;
			} else if (droid.getName().equals(part.getNewName()[1])) {
				count2++;
			} else if (droid.getName().equals(part.getNewName()[2])) {
				count3++;
			} else if (droid.getName().equals(part.getNewName()[3])) {
				count4++;
			}
		}
		String s = " Count of : " + part.getNewName()[0] + " = " + count1;
		s += "\n Count of : " + part.getNewName()[1] + " = " + count2;
		s += "\n Count of : " + part.getNewName()[2] + " = " + count3;
		s += "\n Count of : " + part.getNewName()[3] + " = " + count4;
		return s;
	}

	public static Donation getDonorOfPart(List<Donation> donations, String part) {
		// return the first model that donated the part
		return donations.stream().filter(donation -> donation.getDonatedPartValue().trim().equals(part)).findFirst().get();
	}

}
