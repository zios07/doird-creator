package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Setup {

	public static final Map<Integer, Droid> oldDroids = new HashMap<>();
	public static final Map<Integer, Droid> newDroids = new HashMap<>();
	public static final List<Donation> donations = new ArrayList<>();

	static {
		createOldDroids();
		createNewDroids();
	}

	private static void createOldDroids() {
		for (int i = 0; i < 500; i++) {
			Parts parts = new Parts();
			String name = getRandom(parts.getName());
			String brain = getRandom(parts.getBrain());
			String mobility = getRandom(parts.getMobility());
			String vision = getRandom(parts.getVision());
			String arms = getRandom(parts.getArms());
			String mediaCenter = getRandom(parts.getMediaCenter());
			String powerPlant = getRandom(parts.getPowerPlant());
			Droid droid = new Droid(name, brain, mobility, vision, arms, mediaCenter, powerPlant, i);
			oldDroids.put(i, droid);
		}

	}

	private static void createNewDroids() {
		for (int i = 1; i <= 400; i++) {

			Parts parts = new Parts();
			String name = getRandom(parts.getNewName());
			String brain = getRandomDroid("brain", i).getBrain();
			String mobility = getRandomDroid("mobility", i).getMobility();
			String vision = getRandomDroid("vision", i).getVision();
			String arms = getRandomDroid("arms", i).getArms();
			String mediaCenter = getRandomDroid("mediaCenter", i).getMediaCenter();
			String powerPlant = getRandomDroid("powerPlant", i).getPowerPlant();
			Droid droid = new Droid(name, brain, mobility, vision, arms, mediaCenter, powerPlant, i);
			newDroids.put(i, droid);
		}

	}

	private static String getRandom(String[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	private static Droid getRandomDroid(String donatedPart, int receiverID) {
		int key = new Random().nextInt(oldDroids.size());
		Droid droid = oldDroids.get(key);
		long count = 0;
		count = donations.stream().filter(donation -> droid.getSerialNumber() == donation.getDonatorID()
				&& donation.getReceiverID() == receiverID).count();
		if (count == 2) {
			getRandomDroid(donatedPart, receiverID);
		} else {
			Donation donation = new Donation(droid.getSerialNumber(), receiverID, donatedPart, droid.getName());
			donations.add(donation);
		}
		return droid;
	}
}
