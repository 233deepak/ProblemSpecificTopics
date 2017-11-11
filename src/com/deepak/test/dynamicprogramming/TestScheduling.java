package com.deepak.test.dynamicprogramming;

import org.junit.Test;

import com.deepak.algo.dynamicprogramming.Scheduler;

public class TestScheduling {
	
	private Scheduler scheduler = new Scheduler();
	
	@Test
	public void testSchedule(){
	  int[] daysItems = {0,0,2,0,0,0,3};
	  System.out.println(scheduler.schedule(daysItems, 5, 1, 0, false));	
	}

}
