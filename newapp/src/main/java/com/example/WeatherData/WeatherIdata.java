package com.example.WeatherData;

import java.util.List;

import com.example.WeatherContent.WeatherInfo;

public interface WeatherIdata {
	
	public List<WeatherInfo> getAllWhetherInfo();
	public void setAllWhetherInfo(WeatherInfo whehter);

}