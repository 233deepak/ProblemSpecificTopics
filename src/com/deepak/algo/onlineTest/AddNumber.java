package com.deepak.algo.onlineTest;

public class AddNumber {

	public int[] addTwoNumber(int[] number1, int[] number2) {
		int lengthDiff = Math.abs(number1.length - number2.length);
		int[] smallestArray = (number1.length < number2.length) ? number1
				: number2;
		int[] largestArray = (number1.length < number2.length) ? number2
				: number1;
		int finalLength = largestArray.length + 1;
		int[] resultArray = new int[largestArray.length + 1];
		int carry = 0, sum = 0;
		for (int i = smallestArray.length-1; i >= 0; i--) {
			sum = smallestArray[i] + largestArray[i + lengthDiff] + carry;
			carry = sum / 10;
			resultArray[--finalLength] = sum % 10;
		}
		for (int i = lengthDiff-1 ; i >= 0; i--) {
			sum = carry + largestArray[i];
			carry = sum / 10;
			resultArray[--finalLength] = sum % 10;
		}
		resultArray[--finalLength] = carry;
		return resultArray;
	}

	public void print(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
	}
	
}
