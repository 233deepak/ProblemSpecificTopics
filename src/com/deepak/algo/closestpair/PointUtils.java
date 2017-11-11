package com.deepak.algo.closestpair;

import java.util.List;

public class PointUtils {
	
	static public double getDistance(Point p1,Point p2){
		
		return Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)));
		
	}
	
	static public double getMinDistance(List<Point> points){
		
	    double min=99999999;
		for(int i=0;i<points.size();i++){
			for(int j=i+1;j<points.size();j++){
				if(getDistance(points.get(i),points.get(j))<min)
				 min=getDistance(points.get(i),points.get(j));
			}
		}
		
		return min;
		
	}

}
