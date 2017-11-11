package com.deepak.algo.greedyApproch;

public class Interval implements Comparable<Interval> {
	
	int startPoint;
	int endpoint;
	

	 
	
	public Interval(int startPoint, int endpoint) {
		super();
		this.startPoint = startPoint;
		this.endpoint = endpoint;
	}


	
    

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+startPoint+","+endpoint+")";
	}





	@Override
	public int compareTo(Interval interval) {

		if(this.endpoint>interval.endpoint) return 1;
		else if(this.endpoint<interval.endpoint) return -1;
		else return 0;
	}
	
	

}
