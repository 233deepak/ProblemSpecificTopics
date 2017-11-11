package com.deepak.algo.onlineTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GridTraversal {
	public static BigDecimal ROOT_TWO = new BigDecimal(Math.sqrt(2));

	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {

		int minCount = 0;
		List<String> moves = new ArrayList<String>();
		for (int index = 0; index < X.size() - 1; index++) {
			int x1 = X.get(index);
			int x2 = X.get(index + 1);
			int y1 = Y.get(index);
			int y2 = Y.get(index + 1);
			System.out.println("Point travered " + x1 + " " + y1);
			minCount += findMinSteps(x1, y1, x2, y2, moves);
			System.out.println("steps :" + minCount);
		}

		return minCount;
	}

	public int findMinSteps(int x1, int y1, int x2, int y2, List<String> moves) {
		BigDecimal distance = distance(x1, y1, x2, y2);
		if (distance.compareTo(ROOT_TWO) <= 0)
			return 1;
		else {
			Point point = finNextClosest(x1, y1, x2, y2, moves);
			System.out.println(point);
			return 1 + findMinSteps(point.x, point.y, x2, y2, moves);
		}
	}

	public BigDecimal distance(int x1, int y1, int x2, int y2) {
		return new BigDecimal(Math.sqrt(((x2 - x1) * (x2 - x1))
				+ ((y2 - y1) * (y2 - y1))));
	}

	public Point finNextClosest(int x1, int y1, int destx, int desty,
			List<String> moves) {

		int x2, y2;
		BigDecimal dist = new BigDecimal(Double.MAX_VALUE);
		Point point = new Point();
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				x2 = x1 + i;
				y2 = y1 + j;
				if (x1 == x2 && y1 == y2 || ((x2==x1+1) && (y2 ==y1+1))) {

				}
				else {
					BigDecimal tempDist = distance(x2, y2, destx, desty);
					if (tempDist.compareTo(dist) <= 0) {
						dist = tempDist;
						point.x = x2;
						point.y = y2;
						
						if (point.x == x1 + 1 && point.y !=y1+1)
							moves.add("V");
						else if (point.y == y1 + 1 && point.x != x1 + 1) {
							moves.add("H");
						}

					}
				}
			}
		}
		return point;
	}

	class Point {
		int x, y;

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}

	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}
}
