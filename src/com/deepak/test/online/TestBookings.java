package com.deepak.test.online;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.algo.onlineTest.HotelBooking;

public class TestBookings {

	HotelBooking booking = new HotelBooking();

	@Test
	public void test() {
		int[] arrive = { 1, 3, 5 };
		int[] depart = { 2, 6, 8 };
		System.out.println(booking.hotel(
				(ArrayList<Integer>) booking.getList(arrive),
				(ArrayList<Integer>) booking.getList(depart), 1));
	}

	@Test
	public void test1() {
		int[] arrive = { 40, 18 };
		int[] depart = { 40, 43 };
		System.out.println(booking.hotel(
				(ArrayList<Integer>) booking.getList(arrive),
				(ArrayList<Integer>) booking.getList(depart), 1));
	}
	
	@Test
	public void test3() {
		int[] arrive = { 35, 8, 23, 22, 35, 6, 48, 45, 33, 43, 37, 12, 42, 3, 31, 38, 5, 33, 15 };
		int[] depart = { 43, 32, 34, 46, 74, 50, 95, 62, 59, 79, 83, 19, 88, 34, 75, 42, 42, 50, 58 };
		System.out.println(booking.hotel(
				(ArrayList<Integer>) booking.getList(arrive),
				(ArrayList<Integer>) booking.getList(depart), 11));
	}

}
