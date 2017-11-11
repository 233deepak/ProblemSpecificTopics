package com.deepak.algo.heaps;

public class HighPrecisionMultiplier {

	public double multiply(String firstNumber, String secondNumber) {

		if (firstNumber.length() <= 5) {
			double first = Double.parseDouble(firstNumber);
			double second = Double.parseDouble(secondNumber);
			return first * second;
		}

		int length1 = firstNumber.length();
		int length2 = secondNumber.length();
		String x1 = firstNumber.substring(0, length1 / 2);
		String x0 = firstNumber.substring((length1 / 2), length1);
		String y1 = firstNumber.substring(0, length2 / 2);
		String y0 = firstNumber.substring((length2 / 2), length2);
		double z0 = multiply(x1, y1);
		double z1 = multiply(x0, y0);
		double z2 = multiply(addString(x0, x1), addString(y0, y1));
		return (z0 * Math.pow(10, length1)) + z1
				+ ((z2 - z0 - z1) * Math.pow(10, length1 / 2));

	}

	public String addString(String number1, String number2) {

		double x = Double.parseDouble(number1);
		double y = Double.parseDouble(number2);
		String result = String.valueOf(x + y);
		return result.substring(0, result.lastIndexOf('.'));
	}

}
