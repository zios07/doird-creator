package com.main;

public class Menu {

	private Integer key;
	private String title;

	public Menu(Integer key, String title) {
		super();
		this.key = key;
		this.title = title;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
