package com.deepak.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.greedyApproch.Interval;
import com.deepak.algo.greedyApproch.ScheduleActivity;

public class TestIntervalSchedulingOnProcessor {
	
	private ScheduleActivity scheduleActivity;
	
	@Test
	public void testScheduleIntervals(){
		
		List<Interval> intervals=new ArrayList<Interval>();
		Interval interval1=new Interval(1, 100);
		Interval interval2=new Interval(2, 3);
		Interval interval3=new Interval(4, 5);
		Interval interval4=new Interval(6, 7);
		Interval interval5=new Interval(3, 20);
		//Interval interva6=new Interval(1, 100);
		intervals.add(interval1);
		intervals.add(interval2);
		intervals.add(interval3);
		intervals.add(interval4);
		intervals.add(interval5);
		
		scheduleActivity=new ScheduleActivity(intervals);
		scheduleActivity.schedule();
		
		
	}
	@Test
	public void testScheduleIntervals2(){
		
		List<Interval> intervals=new ArrayList<Interval>();
		Interval interval1=new Interval(1, 2);
		Interval interval2=new Interval(3, 4);
		Interval interval3=new Interval(0, 6);
		Interval interval4=new Interval(5, 7);
		Interval interval5=new Interval(8, 9);
		Interval interva6=new Interval(5, 9);
		intervals.add(interval1);
		intervals.add(interval2);
		intervals.add(interval3);
		intervals.add(interval4);
		intervals.add(interval5);
		intervals.add(interva6);
		
		scheduleActivity=new ScheduleActivity(intervals);
		scheduleActivity.schedule();
		
		
	}
	
	@Test
	public void testScheduleIntervals3(){
		
		List<Interval> intervals=new ArrayList<Interval>();
		Interval interval1=new Interval(1, 2);
		Interval interval2=new Interval(3, 4);
		Interval interval3=new Interval(0, 6);
		Interval interval4=new Interval(5, 7);
		Interval interval5=new Interval(8, 9);
		Interval interva6=new Interval(5, 9);
		intervals.add(interval1);
		intervals.add(interval2);
		intervals.add(interval3);
		intervals.add(interval4);
		intervals.add(interval5);
		intervals.add(interva6);
		
		scheduleActivity=new ScheduleActivity(intervals);
		scheduleActivity.schedule();
		
		
	}
	

}
