package com.rk.FlatEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Flats")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flatNumber;
    private String ownerName;
    private int floorNumber;
    private boolean isAvailable;
    private double squareFootage;
    private double price;
    private String furnishedStatus;
    private int numberOfBalconies;
    private int flattype;
	public Flat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flat(int id, String flatNumber, String ownerName, int floorNumber, boolean isAvailable,
			double squareFootage, double price, String furnishedStatus, int numberOfBalconies, int flattype) {
		super();
		this.id = id;
		this.flatNumber = flatNumber;
		this.ownerName = ownerName;
		this.floorNumber = floorNumber;
		this.isAvailable = isAvailable;
		this.squareFootage = squareFootage;
		this.price = price;
		this.furnishedStatus = furnishedStatus;
		this.numberOfBalconies = numberOfBalconies;
		this.flattype = flattype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public double getSquareFootage() {
		return squareFootage;
	}
	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFurnishedStatus() {
		return furnishedStatus;
	}
	public void setFurnishedStatus(String furnishedStatus) {
		this.furnishedStatus = furnishedStatus;
	}
	public int getNumberOfBalconies() {
		return numberOfBalconies;
	}
	public void setNumberOfBalconies(int numberOfBalconies) {
		this.numberOfBalconies = numberOfBalconies;
	}
	public int getFlattype() {
		return flattype;
	}
	public void setFlattype(int flattype) {
		this.flattype = flattype;
	}
  
}

