package com.deepak.algo.greedyApproch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelector {
	
	private List<Interval> intervals;
	private List<Interval> selectedIntervals;
	
	public ActivitySelector(List<Interval> intervals){
		this.intervals=intervals;
		this.selectedIntervals=new ArrayList<Interval>();
	}
	
	public void findInterval(){
		
		selectActivity(intervals);
	}
	
	public void selectActivity(List<Interval> intervals){
		
		Collections.sort(intervals);
		if(!intervals.isEmpty()){
			Interval interval=intervals.get(0);
			selectedIntervals.add(interval);
			intervals.remove(0);
			for(int j=0;j<intervals.size();j++){
				Interval interval2=intervals.get(j);
				if(interval2.startPoint<interval.endpoint){
					intervals.remove(j);
				}
				
			}
			selectActivity(intervals);
		}
		
	}

	public List<Interval> getSelectedIntervals() {
		return selectedIntervals;
	}
	
	

}
