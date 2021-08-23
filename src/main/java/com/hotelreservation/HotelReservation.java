package com.hotelreservation;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HotelReservation {
	
	ArrayList<Hotel> hotelList = new ArrayList<>();
	
	public void findcheapestHotel(LocalDate startDate, LocalDate endDate) {
		
	    final long days = ChronoUnit.DAYS.between(startDate, endDate);
	    System.out.println ("Days: " + days);
		
	}
    public static void main( String[] args ) throws Exception {
        
    	HotelReservation reservation = new HotelReservation();
    	Scanner sc = new Scanner(System.in);
    	int option;
    	do {
    		
	    	System.out.print("Enter name of Hotel : ");
	    	String name = sc.nextLine();
	    	Hotel hotel = new Hotel(name);
	    	System.out.print("Enter regular customer rate : ");
	    	int regularCustRate = sc.nextInt();
	    	hotel.setRegularCustRate(regularCustRate);
	    	reservation.hotelList.add(hotel);
	    	System.out.print("Do you want to add hotel? Press 1 : ");
	    	option = sc.nextInt();
	    	sc.nextLine();
	   }while(option == 1);
    	
    	System.out.print("Enter start date : ");
    	String date1 = sc.nextLine();
    	System.out.print("Enter end date : ");
    	String date2 = sc.nextLine();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy"); 
    	LocalDate startDate = LocalDate.parse(date1, formatter);
        LocalDate endDate = LocalDate.parse(date2, formatter);
        
    	reservation.findcheapestHotel(startDate, endDate);
    	
    sc.close();
    }
}
