package com.deepak.algo.closestpair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestPair {
	
	List<Point> points=null;
	List<Point> XPoints=null;
	List<Point> YPoints=null;
	List<Point> XLeft=null;
	List<Point> XRight=null;
	List<Point> YLeft=null;
	List<Point> YRight=null;
	
	public ClosestPair(List<Point> points){
		
		this.points=points;
		this.XPoints=new ArrayList<Point>(points);
		this.YPoints=new ArrayList<Point>(points);
		this.XLeft=new ArrayList<Point>();
		this.XRight=new ArrayList<Point>();
		this.YLeft=new ArrayList<Point>();
		this.YRight=new ArrayList<Point>();
		
	}
	
	public void sortPoints(){
		
		Collections.sort(XPoints, new XComparator());
		Collections.sort(YPoints,new YComparator());
		
		System.out.println(XPoints);
		System.out.println(YPoints);
		
	}
	
	public double getClosestpair(){
		
		sortPoints();
		return getClosestPair(XPoints, YPoints);
	}
	
	public double getClosestPair(List<Point> XPoints,List<Point> yPoints){
		
		//Step 1: Divide step
		List<Point> XLeft=new ArrayList<Point>();
		List<Point> YLeft=new ArrayList<Point>();
		List<Point> XRight=new ArrayList<Point>();
		List<Point> YRight=new ArrayList<Point>();
		
		if(XPoints.size()<=3) return PointUtils.getMinDistance(XPoints);
		Point midPoint=getMedianPoint(XPoints);
		divide(XPoints, yPoints, midPoint,XLeft,XRight,YLeft,YRight);

		//Step 2:Recursive step
      	double lDistance=getClosestPair(XLeft, YLeft);
      	double rDistance=getClosestPair(XRight, YRight);
      	double distance=(lDistance<rDistance)?lDistance:rDistance;
      	
      	
      	
      	
      	//Step 3: putting them togeather
      	List<Point> YPLeft=new ArrayList<Point>();
      	List<Point> YPRight=new ArrayList<Point>();
      	for(Point point:YLeft){
      		
      		if(point.x>=(midPoint.x-distance)){
      			YPLeft.add(point);
      		}
      	}
      	for(Point point:YRight){
      		if(point.x<=(midPoint.x+distance))
      			YPRight.add(point);
      	}
      	
      	
      	double mindistance=9999999999.99;
      	for(Point pointOnLeft:YPLeft){
      		
      		List<Point> finalPoints=new ArrayList<Point>();
      		
      		for(Point pointRight:YPRight){
      			
      			if(pointOnLeft.y>=pointRight.y-distance && pointOnLeft.y<=pointRight.y+distance){
      				
      				finalPoints.add(pointRight);
      			}
      		}
      		
      		for(Point point:finalPoints){
      			
      		    double distanceTemp=PointUtils.getDistance(pointOnLeft, point);
      		    mindistance=(distanceTemp<mindistance)?distanceTemp:mindistance;
      		}
      		
      		
      	}
      	
		
		return (distance<mindistance)?distance:mindistance;
		
		
	}
	
	public void divide(List<Point> XPoints,List<Point> yPoints,Point midPoint){
		
		for(Point point:XPoints){
			
			if(point.x<=midPoint.x) XLeft.add(point);
			else XRight.add(point);
		}
		
		for(Point point:YPoints){
			
			if(point.x<=midPoint.x) YLeft.add(point);
			else YRight.add(point);
		}
		
	}
    public void divide(List<Point> XPoints,List<Point> yPoints,Point midPoint,List<Point> XLeft,List<Point> XRight,List<Point> YLeft,List<Point> YRight){
		
		for(Point point:XPoints){
			
			if(point.x<=midPoint.x) XLeft.add(point);
			else XRight.add(point);
		}
		
		for(Point point:YPoints){
			
			if(point.x<=midPoint.x) YLeft.add(point);
			else YRight.add(point);
		}
		
	}
	
	
	public Point getMedianPoint(List<Point> points){
		
		int midIndex=(points.size()/2)-1;
		return points.get(midIndex);
		
	}

	public List<Point> getPoints() {
		return points;
	}

	public List<Point> getXPoints() {
		return XPoints;
	}

	public List<Point> getYPoints() {
		return YPoints;
	}

	public List<Point> getXLeft() {
		return XLeft;
	}

	public List<Point> getXRight() {
		return XRight;
	}

	public List<Point> getYLeft() {
		return YLeft;
	}

	public List<Point> getYRight() {
		return YRight;
	}
	
	
	

}
