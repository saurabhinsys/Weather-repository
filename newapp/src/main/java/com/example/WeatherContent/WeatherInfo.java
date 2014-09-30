package com.example.WeatherContent;


public class WeatherInfo {
	
	private String day;
	private String date;
	private String temperature;
	public WeatherInfo(String day, String date, String temperature) {
		super();
		this.day = day;
		this.date = date;
		this.temperature = temperature;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	
	

}
