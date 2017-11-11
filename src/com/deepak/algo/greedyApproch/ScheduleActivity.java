package com.deepak.algo.greedyApproch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduleActivity {
	
	int noOfProcessor;
	Map<Integer,List<Interval>> processorIntervals;
	List<Interval> intervals;
	
	public ScheduleActivity(List<Interval> intervals) {

		this.intervals=new ArrayList<Interval>(intervals);
		noOfProcessor=0;
		processorIntervals=new HashMap<Integer, List<Interval>>();
	}
	
	
	public void schedule(){
		
		Collections.sort(intervals,new IntervalComparator());
		for(Interval interval:intervals){
			
			boolean overlapped=verifyOverlapping(interval);
			if(overlapped){
				
				noOfProcessor++;
				List<Interval> processor=new ArrayList<Interval>();
				processor.add(interval);
				processorIntervals.put(noOfProcessor, processor);
			}
		}
		
		printScheduleProcessor();
	}


	private boolean verifyOverlapping(Interval interval) {
		
         for(Integer key:processorIntervals.keySet()){
        	 
        	 List<Interval> processedIntervals=processorIntervals.get(key);
        	 boolean canPut=true;
        	 for(Interval processedInterval:processedIntervals)
        	 {
        		 if(overlap(interval.startPoint, interval.endpoint, processedInterval.startPoint, processedInterval.endpoint)){
        			 
        			 canPut=false;
        			 break;
        		 }
        		 
        	 }
        	 if(canPut){
        		 processedIntervals.add(interval);
        		 return false;
        	 }
        	 
         }
		
		return true;

		
	}
	
	boolean overlap(int s,int e,int s1,int e1){
		
		if(s>s1 && s<e1) return true;
		if(s1>s && s1<e) return true;
		if(s1==s) return true;
		else return false;
	}

	public void printScheduleProcessor(){
		
		System.out.println(processorIntervals);
	}
}
