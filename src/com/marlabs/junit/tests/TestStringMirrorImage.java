package com.marlabs.junit.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junitexamples.StringMirrorImage;

/**
 * @author aksha
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStringMirrorImage {

	private static StringMirrorImage mirrorImage;

	/**
	 * init runs before all test cases run
	 * 
	 */

	@BeforeClass
	public static void init() {
		System.out.println("I am from INIT method");
		mirrorImage = new StringMirrorImage();
	}

	/**
	 * destroy runs after all test cases run
	 */
	@AfterClass
	public static void destroy() {
		System.out.println("From destroy method");
		mirrorImage = null;
	}

	/**
	 * Description of this method : to check the mirror image of given word
	 */
	@Test
	public void testGetMirrorImage() {
		// StringMirrorImage mirrorImage = new StringMirrorImage();
		try {
			String resultImage = mirrorImage.getMirrorImage("EARTH");
			assertEquals(resultImage, "EARTH||HTRAE");
		} catch (NullPointerException e) {
			fail();
		}
	}

	/**
	 * checking null point exeptn
	 */
	@Test
	public void testGetMirrorImage1() {
		// StringMirrorImage mirrorImage = new StringMirrorImage();
		try {
			mirrorImage.getMirrorImage(null);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

}
