
package com.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l =LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate tt=LocalDate.of(2000,Month.JUNE,8);
		System.out.println(l);
		System.out.println(t);
		System.out.println(dt);
		System.out.println(tt);
	}

}