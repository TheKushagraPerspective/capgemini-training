package com.capg.questions;

import java.util.Scanner;

abstract class GoodsTransport {
	protected String id;
	protected String date;
	protected int rating;
	
	
	public GoodsTransport(String id, String date, int rating) {
		super();
		this.id = id;
		this.date = date;
		this.rating = rating;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
}



class BrickTransport extends GoodsTransport {
	float size;
	int quantity;
	float price;
	
	
	public BrickTransport(String id, String date, int rating, float size, int quantity, float price) {
		super(id, date, rating);
		this.size = size;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String vehicleSelection() {
		if(quantity < 300) {
			return "Truck";
		}
		else if(quantity <= 500) {
			return "Lorry";
		}
		else {
			return "MonsterLorry";
		}
	}
	
	
	public float calculateTotalCharge() {
		float totalCost = quantity * price;
		float tax = totalCost * 0.3f;
		
		float vehiclePrice = 0.0f;
		String vehicle = vehicleSelection();
		
		if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
        else vehiclePrice = 3000;
		
		float discount = 0;
		if(rating == 5) discount = totalCost * 0.2f;
		else if(rating >= 3) discount = totalCost * 0.1f;
		
		float totalCharge = (totalCost + tax + vehiclePrice) - discount;
		
		return totalCharge;
	}
}


class TimberTransport extends GoodsTransport {
	float length;
	float radius;
	String type;
	float price;
	
	
	public TimberTransport(String id, String date, int rating, float length, float radius, String type, float price) {
		super(id, date, rating);
		this.length = length;
		this.radius = radius;
		this.type = type;
		this.price = price;
	}


	public String vehicleSelection() {
		double area = 2 * 3.147 * radius * length;
		if(area < 250) {
			return "Truck";
		}
		else if(area <= 400) {
			return "Lorry";
		}
		else {
			return "MonsterLorry";
		}
	}
	
	
	public float calculateTotalCharge() {
		
		float volume = 3.147f * radius * radius * length;
		float basePrice = 0;
		
		if(type.equalsIgnoreCase("Premium")) {
			basePrice = volume * price * 0.25f;
		}
		else if(type.equalsIgnoreCase("NonPremium")) {
			basePrice = volume * price * 0.15f;
		}
		float tax = basePrice * 0.3f;
		
		float vehiclePrice = 0.0f;
		String vehicle = vehicleSelection();
		
		if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
        else vehiclePrice = 3000;
		
		float discount = 0;
		if(rating == 5) discount = basePrice * 0.2f;
		else if(rating >= 3) discount = basePrice * 0.1f;
		
		float totalCharge = (basePrice + tax + vehiclePrice) - discount;
		
		return totalCharge;
	}
}


class Utility {
	public GoodsTransport parseDetails(String input) {
		String []arr = input.split(":");
		
		String id = arr[0];
        String date = arr[1];
        int rating = Integer.parseInt(arr[2]);
        String type = arr[3];
        
        if(type.equalsIgnoreCase("BrickTransport")) {
        	return new BrickTransport(id , date , rating , Float.parseFloat(arr[4]) , Integer.parseInt(arr[5]) , Float.parseFloat(arr[6]));
        }
        else {
        	return new TimberTransport(id , date , rating , Float.parseFloat(arr[4]) , Float.parseFloat(arr[5]) , arr[6] , Float.parseFloat(arr[7]));
        }		
	}
	
	public boolean validateTransportId(String id) {
		if(!id.matches("RTS\\d{3}[A-Z]")) {
			System.out.println("Transport id " + id + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
		}
		return true;
	}
	
	
//	public String findObjectType(GoodsTransport goodsTransport) {
//		
//	}
}


public class FutureLogistic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Goods Transport details");
		String input = sc.nextLine();
		
		Utility utility = new Utility();
		String []arr = input.split(":");
		String id = arr[0];
		
		if(!utility.validateTransportId(id)) return ;
		
		GoodsTransport obj = utility.parseDetails(input);
		
		// Output
        System.out.println("Transporter id : " + obj.id);
        System.out.println("Date of transport : " + obj.date);
        System.out.println("Rating of the transport : " + obj.rating);

        System.out.println("Vehicle for transport : " + obj.vehicleSelection());
        System.out.println("Total charge : " + obj.calculateTotalCharge());
		
	}
}
