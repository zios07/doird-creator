package com.main;

public class Donation {
	private int donatorID;
	private int receiverID;
	private String donatedPartKey;
	private String donatedPartValue;

	public Donation(int donatorID, int receiverID, String donatedPartKey, String donatedPartValue) {
		super();
		this.donatorID = donatorID;
		this.receiverID = receiverID;
		this.donatedPartKey = donatedPartKey;
		this.donatedPartValue = donatedPartValue;
	}

	public int getDonatorID() {
		return donatorID;
	}

	public void setDonatorID(int donatorID) {
		this.donatorID = donatorID;
	}

	public int getReceiverID() {
		return receiverID;
	}

	public void setReceiverID(int receiverID) {
		this.receiverID = receiverID;
	}

	public String getDonatedPartKey() {
		return donatedPartKey;
	}

	public void setDonatedPartKey(String donatedPartKey) {
		this.donatedPartKey = donatedPartKey;
	}

	public String getDonatedPartValue() {
		return donatedPartValue;
	}

	public void setDonatedPartValue(String donatedPartValue) {
		this.donatedPartValue = donatedPartValue;
	}

	@Override
	public String toString() {
		return "Donation [donatorID=" + donatorID + ", receiverID=" + receiverID + ", donatedPartKey=" + donatedPartKey
				+ ", donatedPartValue=" + donatedPartValue + "]";
	}

}