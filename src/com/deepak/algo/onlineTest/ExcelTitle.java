package com.deepak.algo.onlineTest;

public class ExcelTitle {

	public int titleToNumber(String a) {
		Long sum = (long) 0;
		for (int index = a.length() - 1; index >= 0; index--) {
			char c = a.charAt(index);
			int number = (int) c - 64;
			sum += (long) (number * Math.pow(26, (a.length() - 1 - index)));
		}
		return sum.intValue();
	}

	public String convertToTitle(int a) {
		StringBuilder builder = new StringBuilder("");
		while (a >= 26) {
			int d = a % 26;
			a = a / 26;
			if (d == 0) {
				a -= 1;
				builder.append((char) 90);
			} else {
				builder.append((char) (d + 64));
			}
		}
		if (a > 0)
			builder.append((char) (a + 64));
		builder.reverse();
		return builder.toString();
	}

}
