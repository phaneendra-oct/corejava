/**
 * 
 */
package com.practice;

/**
 * @author Phani
 *
 */
public class Animal {
	
	private int noOfLegs;
	private String type;
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void nature() {
		System.out.println("Common Animal nature");
	}
}
