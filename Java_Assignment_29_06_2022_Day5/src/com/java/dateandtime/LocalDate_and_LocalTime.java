package com.java.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_and_LocalTime {

	public static void DateTimeapi() {
		
		//The Current Date
		LocalDate date = LocalDate.now();
		System.out.println("Today's Date: " + date);
		
		//The Yesterday Date
		LocalDate yesterdaydate = date.minusDays(1);
		System.out.println("Yesterday Date: " + yesterdaydate);
		
		//The Tomorrow Date
		LocalDate tomorrowdate = date.plusDays(1);
		System.out.println("Tomorrow Date: " + tomorrowdate);
		
		//The Specific Date
		LocalDate specificdate = LocalDate.of(2022, 02, 22);
		System.out.println("Specific Date: " + specificdate);
		
		//The Current Time
		LocalTime time = LocalTime.now();
		System.out.println("The Current Time: " + time);
		
		//The Specific Time
		LocalTime specifictime = LocalTime.of(10, 00, 30);
		System.out.println("The Specific Time: " + specifictime);
		
		//Modification of time form Specific Time
		LocalTime specifictime1 = specifictime.plusHours(8).minusMinutes(30).withSecond(15);
		System.out.println("Modification of time form Specific Time: " + specifictime1);
		
		//The current time and date
		LocalDateTime currentdateandtime = LocalDateTime.now();
		System.out.println("Current Date and Time : "+ currentdateandtime);
		
		//The Specific Date and Time
		LocalDateTime currentdateandtime1 = LocalDateTime.of(2022,02, 22, 22, 02, 22);
		System.out.println("Day of the year : "+ currentdateandtime1.getDayOfYear());
		System.out.println("Day of the month : "+ currentdateandtime1.getDayOfMonth());
		System.out.println("Day of the week : "+ currentdateandtime1.getDayOfWeek());
		System.out.println("Day of the Hour : "+ currentdateandtime1.getHour());
		System.out.println("Day of the Minute : "+ currentdateandtime1.getMinute());
		System.out.println("Day of the Second : "+ currentdateandtime1.getSecond());
		System.out.println("Which month : "+ currentdateandtime1.getMonth());
		
		// to print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = currentdateandtime.format(format);
		System.out.println("In Formatted Manner "+ formatedDateTime);
		
		// printing date with current time.
		LocalDateTime specificDate = currentdateandtime.withDayOfMonth(24).withYear(2016);
		System.out.println("Specific Date with Current Time : "+specificDate);
	}
	
	public static void main(String[] args) {
		
		DateTimeapi();
	}

}
