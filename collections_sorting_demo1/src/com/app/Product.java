package com.app;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private double cost;
	private float ratings;
	private boolean avaliable;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double cost,float ratings, boolean avaliable) {
		super();
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.ratings=ratings;
		this.avaliable=avaliable;
	}
	
	public String toString() {
		return ("item id: " + id + " item name: " + name + " cost: " + cost +" ratings: " + ratings + " is avalaibale = " + avaliable);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		Integer id1=this.id;
		Integer id2 = o.id;
		return id1.compareTo(id2);
	}
}
