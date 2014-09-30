package com.example.pages;

import java.util.ArrayList;
import java.util.List;

import com.example.WeatherContent.WeatherInfo;
import com.example.WeatherData.WeatherIdata;

public class WeatherDetails implements WeatherIdata{
	
	public WeatherDetails() {
		super();
		
		setAllWhetherInfo(new WeatherInfo("Sunday", "9/10/2014","35`C"));
		setAllWhetherInfo(new WeatherInfo("Monday", "9/11/2014","36`C"));
		setAllWhetherInfo(new WeatherInfo("Tuesday", "9/12/2014","32`C"));
		setAllWhetherInfo(new WeatherInfo("Wednesday", "9/13/2014","30`C"));
		setAllWhetherInfo(new WeatherInfo("ThursDay", "9/14/2014","32`C"));
		setAllWhetherInfo(new WeatherInfo("Friday", "9/15/2014","35`C"));
		setAllWhetherInfo(new WeatherInfo("Saturday", "9/16/2014","29`C"));
		setAllWhetherInfo(new WeatherInfo("Sunday", "9/17/2014","25`C"));
		setAllWhetherInfo(new WeatherInfo("Monday", "9/18/2014","28`C"));
		setAllWhetherInfo(new WeatherInfo("Tuesday", "9/19/2014","26`C"));
		
	}
	
	private List<WeatherInfo> whethers = new  ArrayList<WeatherInfo>();
	private WeatherInfo whetherInfo;
	
	
	
	public WeatherInfo getWhetherInfo() {
		return whetherInfo;
	}

	public void setWhetherInfo(WeatherInfo whetherInfo) {
		this.whetherInfo = whetherInfo;
	}
	
	public List<WeatherInfo> getAllWhetherInfo() {
		
		return whethers;
	}

	public void setAllWhetherInfo(WeatherInfo whether) {
		
		whethers.add(whether);
		
		
	}

}
