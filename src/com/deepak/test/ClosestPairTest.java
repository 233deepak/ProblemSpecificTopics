package com.deepak.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deepak.algo.closestpair.ClosestPair;
import com.deepak.algo.closestpair.Point;
import com.deepak.algo.closestpair.PointUtils;

public class ClosestPairTest {

	ClosestPair closestPair = null;
	List<Point> points = new ArrayList<Point>();

	@Before
	public void setup() {

		Point point1 = new Point(2, 3);
		Point point2 = new Point(12, 30);
		Point point3 = new Point(40, 50);
		Point point4 = new Point(5, 1);
		Point point5 = new Point(12, 10);
		Point point6 = new Point(3, 4);

		points.add(point1);
		points.add(point2);
		points.add(point3);
		points.add(point4);
		points.add(point5);
		points.add(point6);

		closestPair = new ClosestPair(points);

	}

	@Test
	public void testSorting() {

		closestPair.sortPoints();

	}

	@Test
	public void testMedianOnSorted() {

		System.out.println(closestPair.getMedianPoint(points));
	}

	@Test
	public void testDivideStep() {

		closestPair.sortPoints();
		Point midPoint = closestPair.getMedianPoint(closestPair.getXPoints());
		System.out.println(midPoint);
		closestPair.divide(closestPair.getXPoints(), closestPair.getYPoints(),
				midPoint);
		System.out.println(closestPair.getXLeft() + " ::::: "
				+ closestPair.getXRight());
		System.out.println(closestPair.getYLeft() + " ::::: "
				+ closestPair.getYRight());

	}

	@Test
	public void testDistance() {

		System.out
				.println(PointUtils.getDistance(points.get(0), points.get(5)));

	}

	@Test
	public void testClosestWithoutMiddlePart() {

		System.out.println(closestPair.getClosestpair());
	}

	@Test
	public void testBruteForceDistance() {

		System.out.println(PointUtils.getMinDistance(points));
	}

	@Test
	public void testClosestPair() {

		Point[] points = new Point[] { new Point(2, 7), new Point(4, 13),
				new Point(5, 7), new Point(10, 5), new Point(13, 9),
				new Point(15, 5), new Point(17, 7), new Point(19, 10),
				new Point(22, 7), new Point(25, 10), new Point(29, 14),
				new Point(30, 2) };

		List<Point> pointsList = Arrays.asList(points);

		ClosestPair closestPair = new ClosestPair(pointsList);
		System.out.println(closestPair.getClosestpair());
	}
}
