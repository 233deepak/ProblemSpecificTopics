package com.deepak.algo.onlineTest;

public class PowerOfTwo {

	public boolean isPower(int a) {
		if (a == 1)
			return true;
		int upperLimit = (int) Math.sqrt(a);
		for (int x = 2; x <= upperLimit; x++) {
			int y = 2;
			double pow = 1;
			do {
				pow = Math.pow(x, y);
				if (pow == a)
					return true;
				y++;
			} while (pow < a);
		}
		return false;
	}
}
