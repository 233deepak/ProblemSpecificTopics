package com.deepak.algo.onlineTest;

import java.util.Scanner;

public class SumOfN {

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		int n;
		n = Integer.parseInt(in.nextLine().trim());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(in.nextLine().trim());
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i];
		}
		
		System.out.println(sum);
	}

}
