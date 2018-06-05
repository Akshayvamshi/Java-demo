package com.marlabs.junitexamples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junit.tests.DateUtility;

/**
 * @author aksha
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDateUtility {

	private static DateUtility dateUtility;

	/**
	 * 
	 */
	@BeforeClass
	public static void init() {
		System.out.println("I am from INIT method");
		dateUtility = new DateUtility();
	}

	/**
	 * 
	 */
	@AfterClass
	public static void destroy() {
		System.out.println("From destroy method");
		dateUtility = null;
	}

	/**
	 * 
	 */
	@Test
	public void testGetWeekDayName() {
		try {
			String resultFlag = dateUtility.getWeekDayName("10-05-1986", "dd-MM-yyyy");
			assertEquals(resultFlag, "Saturday");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e) {
			fail();
		}

	}

	/**
	 * 
	 */
	@Test
	public void testGetMonthName() {
		try {
			String resultFlag = dateUtility.getMonthName("10-05-1986", "dd-MM-yyyy");
			assertEquals(resultFlag, "May");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e) {
			fail();
		}

	}

	/**
	 * 
	 */
	@Test
	public void testNull1() {
		try {
			dateUtility.getWeekDayName("10-05-1986", null);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void testNull2() {
		try {
			dateUtility.getWeekDayName(null, null);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e) {
			fail();
		}
	}

}
