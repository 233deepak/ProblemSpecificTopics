package com.deepak.algo.onlineTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Grid {
	public static BigDecimal ROOT_TWO = new BigDecimal(Math.sqrt(2));

	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

		int minCount = 0;
		int currentX = X.get(0);
		int currentY = Y.get(0);
		for (int index = 1; index < X.size(); index++) {
			minCount += Math.max(Math.abs((currentX - X.get(index))), Math.abs((currentY - Y.get(index))));
		            currentX = X.get(index);
		            currentY = Y.get(index);
		}

		return minCount;
	}

	public int findMinSteps(int x1, int y1, int x2, int y2) {
		int xDist = Math.abs(x2 - x1);
		int yDist = Math.abs(y2 - y1);
		while (xDist > 0 && yDist > 0) {
			xDist--;
			yDist--;
		}
		while (xDist > 0) {
			xDist--;
		}
		while (yDist > 0) {
			yDist--;
		}

		return (xDist > yDist) ? xDist : yDist;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}
}
