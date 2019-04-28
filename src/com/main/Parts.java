package com.main;

public class Parts {
	private String[] name = { "Android mk1 ", "Android mk2 ", "Android mk3 ", "Android mk4 ", "android mk5" };
	private String[] newName = { "Andy the Android", "Betty the Busibot", "Bobi the racedroid",
			"Fred the Friendlybot" };
	private String[] brain = { "2.5GHZ", "3.5GHZ", "4.5GHZ" };
	private String[] mobility = { "catapilar tracks", "wheels", "legs" };
	private String[] vision = { "heat vision", "full colour", "night vision" };
	private String[] arms = { "claws", "grippers", "articulated fingers" };
	private String[] mediaCenter = { "sony", "jvc", "meridian" };
	private String[] powerPlant = { "lithium", "hydrogen", "plasma (40 watt range)" };

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getBrain() {
		return brain;
	}

	public void setBrain(String[] brain) {
		this.brain = brain;
	}

	public String[] getMobility() {
		return mobility;
	}

	public void setMobility(String[] mobility) {
		this.mobility = mobility;
	}

	public String[] getVision() {
		return vision;
	}

	public void setVision(String[] vision) {
		this.vision = vision;
	}

	public String[] getArms() {
		return arms;
	}

	public void setArms(String[] arms) {
		this.arms = arms;
	}

	public String[] getMediaCenter() {
		return mediaCenter;
	}

	public void setMediaCenter(String[] mediaCenter) {
		this.mediaCenter = mediaCenter;
	}

	public String[] getPowerPlant() {
		return powerPlant;
	}

	public void setPowerPlant(String[] powerPlant) {
		this.powerPlant = powerPlant;
	}

	public String[] getNewName() {
		return newName;
	}

	public void setNewName(String[] newName) {
		this.newName = newName;
	}

}
