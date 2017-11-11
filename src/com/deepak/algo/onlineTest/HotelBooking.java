package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelBooking {

	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart,
			int K) {
		int n = arrive.size();
		Collections.sort(arrive); // Built in O(nlog(n)) sorting.
		Collections.sort(depart); // Built in O(nlog(n)) sorting.
		int aIndex = 0;
		int dIndex = 0;
		int current = 0; // Current number of guests.
		int max = 0; // Max number of guests
		while (aIndex < n && dIndex < n) {
			// You need <= instead of < if you can't use a room the same day the
			// guest leaves.
			if (arrive.get(aIndex) < depart.get(dIndex)) {
				++aIndex;
				++current; // Someone needs a room.
				max = Math.max(max, current);
			} else {
				++dIndex;
				--current; // Someone vacates a room.
			}
			if (max > K)
				return false;
		}
		return true;

	}

	boolean numberOfRoomsNeeded(Collection<Booking> bookings, int k) {
		int n = bookings.size();
		int[] arrivals = new int[n];
		int[] departures = new int[n];
		int i = 0;
		for (Booking d : bookings) {
			arrivals[i] = d.start;
			departures[i] = d.end;
			++i;
		}
		Arrays.sort(arrivals); // Built in O(nlog(n)) sorting.
		Arrays.sort(departures); // Built in O(nlog(n)) sorting.
		int aIndex = 0;
		int dIndex = 0;
		int current = 0; // Current number of guests.
		int max = 0; // Max number of guests
		while (aIndex < n) {
			// You need <= instead of < if you can't use a room the same day the
			// guest leaves.
			if (arrivals[aIndex] < departures[dIndex]) {
				++aIndex;
				++current; // Someone needs a room.
				max = Math.max(max, current);
			} else {
				++dIndex;
				--current; // Someone vacates a room.
			}
			if (max > k)
				return false;
		}
		return true;

	}

	class Booking implements Comparable<Booking> {
		int start;
		int end;

		public Booking(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Booking o) {
			if (this.start > o.start)
				return 1;
			else if (this.start < o.start)
				return -1;
			else
				return 0;
		}

		@Override
		public String toString() {
			return "Booking [start=" + start + ", end=" + end + "]";
		}

	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}
}
