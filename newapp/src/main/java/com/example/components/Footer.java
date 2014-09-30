package com.example.components;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Footer {
	public String getDateAndTime(){
		Date date = new Date();
		
		Date date1 = new Date();
		DateFormat df = new SimpleDateFormat("EEE");
		String day = df.format(date1);
		
		DateFormat df1 = new SimpleDateFormat("MM");
		String month = df1.format(date1);
		
		return date.getDate()+"-"+month+""+"-"+date.getMonth()+" "+date.getHours()+":"+date.getMinutes()+" "+day;
	}

}
