package com.main;

public class Droid {

	private int serialNumber;
	private String name;
	private String brain;
	private String mobility;
	private String vision;
	private String arms;
	private String mediaCenter;
	private String powerPlant;

	public Droid() {
	}

	public Droid(String name, String brain, String mobility, String vision, String arms, String mediaCenter,
			String powerPlant, int serialNumber) {
		this.name = name;
		this.brain = brain;
		this.mobility = mobility;
		this.vision = vision;
		this.arms = arms;
		this.mediaCenter = mediaCenter;
		this.powerPlant = powerPlant;
		this.serialNumber = serialNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrain() {
		return brain;
	}

	public void setBrain(String brain) {
		this.brain = brain;
	}

	public String getMobility() {
		return mobility;
	}

	public void setMobility(String mobility) {
		this.mobility = mobility;
	}

	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public String getArms() {
		return arms;
	}

	public void setArms(String arms) {
		this.arms = arms;
	}

	public String getMediaCenter() {
		return mediaCenter;
	}

	public void setMediaCenter(String mediaCenter) {
		this.mediaCenter = mediaCenter;
	}

	public String getPowerPlant() {
		return powerPlant;
	}

	public void setPowerPlant(String powerPlant) {
		this.powerPlant = powerPlant;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Droid [serialNumber=" + serialNumber + "\n , name=" + name + "\n , brain=" + brain + "\n , mobility=" + mobility
				+ "\n , vision=" + vision + "\n , arms=" + arms + "\n , mediaCenter=" + mediaCenter + "\n , powerPlant="
				+ powerPlant + "]";
	}

}
