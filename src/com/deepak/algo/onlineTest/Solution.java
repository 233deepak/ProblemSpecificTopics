package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static List<Data> datas = new ArrayList<Data>();

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] data = line.split(" ");
		int cacheSize = Integer.parseInt(data[0]);
		readData(data[1], cacheSize);
		datas.clear();
		datas = null;
	}

	public static void readData(String line, int cacheSize) throws InterruptedException {

		for (Character ch : line.toCharArray()) {
			if (ch == '!') {
				Collections.sort(datas);
				print(datas);
				System.out.print(" ");
			} else {
				int index = checkForPresence(ch);
				if (index != -1) {
					Thread.sleep(2L);
					datas.get(index).lastAccessTime = System.currentTimeMillis();
				} else if (datas.size() < cacheSize) {
					Date current = new Date();
					Thread.sleep(2L);
					datas.add(new Data(ch, System.currentTimeMillis()));
				} else if (datas.size() >= cacheSize) {
					Collections.sort(datas);
					Thread.sleep(2L);
					datas.set(0, new Data(ch, System.currentTimeMillis()));
				}

			}
		}
	}

	private static int checkForPresence(Character ch) {
		for (Data data : datas) {
			if (data.ch == ch) {
				return datas.indexOf(data);
			}
		}
		return -1;
	}

	private static void print(List<Data> cache) {
		for (Data data : cache) {
			System.out.print(data.ch);
		}
	}

}

class Data implements Comparable<Data> {
	char ch;
	long lastAccessTime;

	public Data(char ch, long lastAccessTime) {
		super();
		this.ch = ch;
		this.lastAccessTime = lastAccessTime;
	}

	@Override
	public int compareTo(Data o) {
		if (this.lastAccessTime>o.lastAccessTime)
			return 1;
		else if (this.lastAccessTime<o.lastAccessTime)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Data [ch=" + ch + ", lastAccessTime=" + lastAccessTime + "]";
	}

}
