package scb.com.dateft;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class DataDemo {

	public static void main(String[] args) {

		Date tod =new Date();
		System.out.println(tod);
		LocalDate ld = LocalDate.now();
		System.out.println(ld.minusYears(12));
		System.out.println(ld.getDayOfMonth());
		LocalTime lt = LocalTime.now();
		System.out.println("The time now is " + lt);
		System.out.println("Today's date is " + ld);
		System.out.println("Todays date and time : "+LocalDateTime.now());
		int date = ld.getDayOfMonth();
		int month = ld.getMonthValue();
		int year= ld.getYear();
		System.out.printf("%d+%d+%d",date,month,year);
		System.out.println();
		System.out.println("Enter the birth year");
		Scanner sc = new Scanner(System.in);
		int years = sc.nextInt();
		System.out.println("Enter the birth month");
		int months = sc.nextInt();
		System.out.println("Enter the birth day");
		int days = sc.nextInt();
		LocalDate birthDate = LocalDate.of(years, months, days);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDate,today);
		System.out.println("The age of the person is"+p.getYears()+"years "+p.getMonths()+"months "+p.getDays()+"days");
	}
}



