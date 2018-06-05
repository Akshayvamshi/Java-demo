package com.marlabs.junitexamples;

/**
 * @author akshay
 *
 */
public class StringMirrorImage {

	/**
	 * @param inputImage
	 * @param string
	 * @return string
	 * @throws NullPointerException
	 */
	public String getMirrorImage(final String inputImage) throws NullPointerException {
		final String METHOD_NAME = "getMirrorImage";
		System.out.println("Method Invoked: " + METHOD_NAME + ":" + inputImage);
		// System.out.println(x);
		String outputImage = "";
		if (inputImage == null) {
			throw new NullPointerException("Dont supply null values");
		}
		outputImage = inputImage.concat("||").concat(new StringBuffer(inputImage).reverse().toString());
		System.out.println("Response from Method: " + METHOD_NAME + ":" + outputImage);
		return outputImage;
	}

}
