package com.deepak.algo.closestpair;

import java.util.Comparator;

public class XComparator implements Comparator<Point> {

	@Override
	public int compare(Point point1, Point point2) {

		if(point1.x>point2.x) return 1;
		else if(point1.x<point2.x) return -1;
		else return 0;
	}

}
