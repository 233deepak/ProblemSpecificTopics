package com.deepak.algo.dynamicprogramming;

import java.util.Arrays;

public class Scheduler {

	public static int INFINITY = 9999999;

	/*
	 * Base case for recurrsion is if call is for last day and number of item in
	 * inventory = requirement for that day then retun 0; else return infinity
	 */
	public Schedule schedule(int[] daysItems, int s, int h, int inventory,
			boolean m) {

		if (daysItems.length == 1 && inventory-1 == daysItems[0]) {
			return new Schedule(0, new boolean[] { false });
		} else if (daysItems.length == 1 && inventory-1 == daysItems[0] - 1) {
			return new Schedule((m ? 0 : s), new boolean[] { true });
		} else if (daysItems.length == 1) {
			return new Schedule(INFINITY, new boolean[] { false });
		}

		Schedule processing, ideal, tempSchedule;
		tempSchedule = schedule(getNextdaysArray(daysItems), s, h, inventory
				- daysItems[0] + 1, true);
		processing = new Schedule((m ? 0 : s) + (inventory - daysItems[0] + 1)
				* h + tempSchedule.cost, prepareSchedule(true,
				tempSchedule.schedule));

		tempSchedule = schedule(getNextdaysArray(daysItems), s, h, inventory
				- daysItems[0], false);
		ideal = new Schedule((inventory - daysItems[0]) * h
				+ tempSchedule.cost, prepareSchedule(false,
				tempSchedule.schedule));

		return (processing.cost < ideal.cost) ? processing : ideal;

	}

	public int[] getNextdaysArray(int[] daysItems) {
		int[] result = new int[daysItems.length - 1];
		int k = 0;
		for (int i = 1; i < daysItems.length; i++) {
			result[k++] = daysItems[i];
		}
		return result;
	}

	public boolean[] prepareSchedule(boolean processing,
			boolean[] previousSchedule) {
		boolean[] schedule = new boolean[previousSchedule.length + 1];
		int k = 1;
		for (int i = 0; i < previousSchedule.length; i++) {
			schedule[k++] = previousSchedule[i];
		}
		schedule[0] = processing;
		return schedule;
	}
}

class Schedule {

	int cost;
	boolean[] schedule;

	public Schedule(int cost, boolean[] schedule) {
		super();
		this.cost = cost;
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "schedule [cost=" + cost + ", schedule="
				+ Arrays.toString(schedule) + "]";
	}

}