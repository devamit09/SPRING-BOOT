package com.example.demo.model;

public class City {
	
	private int id;
	
	private String cityName;
	
	private double temp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", temp=" + temp + "]";
	}
	
	

}
