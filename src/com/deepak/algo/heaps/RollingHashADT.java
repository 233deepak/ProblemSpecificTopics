package com.deepak.algo.heaps;

public class RollingHashADT {

	private static double BASE_ENCODING = 256;
	private static char NULL_CHARACTER = '\0';
	private double hasValue;
	private char[] rollingList;
	private int primeModulo;

	public RollingHashADT(int sizeOfList) {
		rollingList = new char[sizeOfList];
		primeModulo = sizeOfList;
		for (int index = 0; index < rollingList.length; index++) {
			rollingList[index] = NULL_CHARACTER;
		}
	}

	public RollingHashADT(String pattern) {
		this(pattern.length());
		int index = 0;
		for (char character : pattern.toCharArray()) {
			rollingList[index++] = character;
		}
		computeHash();
	}

	public void computeHash() {
		double hash = 0;
		int pow = 0;
		for (int index = rollingList.length - 1; index >= 0; index--) {
			if (rollingList[index] == '\0')
				continue;
			hash += (int) rollingList[index]
					* Math.pow(BASE_ENCODING, (pow++));
		}
		this.hasValue = hash;
	}

	public void skipFirst() {
		int val = rollingList[0];
		shiftLeft();
		hasValue = hasValue
				- (val * (Math.pow(BASE_ENCODING, rollingList.length - 1)));

	}

	public void appendLast(char c) {
		hasValue += hasValue * BASE_ENCODING + c;
	}

	private void shiftLeft() {
		for (int index = 0; index < rollingList.length - 1; index++) {
			rollingList[index] = rollingList[index + 1];
		}
		rollingList[rollingList.length - 1] = '\0';
	}

	public double getHash() {
		return hasValue % primeModulo;
	}

	public double getHashValue() {
		return hasValue;
	}
}
