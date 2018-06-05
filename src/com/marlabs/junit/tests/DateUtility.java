package com.marlabs.junit.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author aksha
 *
 */
public class DateUtility {

	/**
	 * @param inputDate
	 * @param dateFormat
	 * @return string
	 * @throws NullPointerException
	 * @throws ParseException
	 */
	public String getWeekDayName(final String inputDate, final String dateFormat)
			throws NullPointerException, ParseException {
		final String METHOD_NAME = "getWeekDayName";
		String weekDayName = "";
		System.out.println("Method Invoked:" + METHOD_NAME + inputDate + ":" + dateFormat);

		if (inputDate == null || dateFormat == null) {
			throw new NullPointerException("Dont supply null values");
		}

		// Businees Logic

		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);
		Date convertedDate = dateFormatter.parse(inputDate);

		dateFormatter = new SimpleDateFormat("EEEE");
		weekDayName = dateFormatter.format(convertedDate);

		System.out.println("Response from the method:" + METHOD_NAME + ":" + weekDayName);
		return weekDayName;
	}

	/**
	 * @param inputDate
	 * @param dateFormat
	 * @return string
	 * @throws NullPointerException
	 * @throws ParseException
	 */
	public String getMonthName(final String inputDate, final String dateFormat)
			throws NullPointerException, ParseException {
		final String METHOD_NAME = "getMonthName";
		String monthName = "";
		System.out.println("Method Invoked:" + METHOD_NAME + inputDate + ":" + dateFormat);

		if (inputDate == null || dateFormat == null) {
			throw new NullPointerException("Dont supply null values");
		}

		// Businees Logic

		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);
		Date convertedDate = dateFormatter.parse(inputDate);

		dateFormatter = new SimpleDateFormat("MMMM");
		monthName = dateFormatter.format(convertedDate);

		System.out.println("Response from the method:" + METHOD_NAME + ":" + monthName);
		return monthName;
	}
}
