package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone extends GalaxyNote9 {
	
	private String maker;

	public SmartPhone() {
	}
	
	public String printInformation() {
		return "";
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
