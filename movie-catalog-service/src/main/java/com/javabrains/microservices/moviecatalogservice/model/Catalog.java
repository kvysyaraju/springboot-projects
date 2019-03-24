package com.javabrains.microservices.moviecatalogservice.model;

public class Catalog {
	
	private String id;
	private String name;
	private String desc;
	private String rating;
	
	public Catalog(){
		
	}
	
	public Catalog(String id,String name, String desc, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
