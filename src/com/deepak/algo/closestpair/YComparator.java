package com.deepak.algo.closestpair;

import java.util.Comparator;

public class YComparator implements Comparator<Point> {

	@Override
	public int compare(Point point1, Point point2) {

		if(point1.y>point2.y) return 1;
		else if(point1.y<point2.y) return -1;
		else return 0;
	}

}
