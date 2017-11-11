package com.deepak.algo.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrindLand {


	static String[] gridLand(String[] inp) {
		List<String> moves = new ArrayList<String>();
		String[] op = new String[inp.length];
		int index = 0;
		for (String input : inp) {
			String[] value = input.split(" ");
			findMinSteps(0, 0, Integer.parseInt(value[0]),
					Integer.parseInt(value[1]), "" ,moves);
			Collections.sort(moves);
			op[index++] = moves.get(Integer.parseInt(value[2]));
		}
		return op;

	}

	private static void findMinSteps(int x1, int y1, int destx, int desty,
			String path, List<String> moves) {
		if (x1 == destx && y1 == desty) {
			//System.out.println(path);
			return;
		}

		if (x1 == destx) {
			for (int i = y1; i < desty; i++)
				path += "H";
			moves.add(path);
			//System.out.println(path);
			return;
		}
		if (y1 == desty) {
			for (int i = x1; i < destx; i++)
				path += "V";
			moves.add(path);
			//System.out.println(path);
			return;
		}
		path += "V";
		findMinSteps(x1 + 1, y1, destx, desty, path ,moves);
		path = path.substring(0, path.length()-1);
		path += "H";
		findMinSteps(x1, y1 + 1, destx, desty, path ,moves);
		path = path.substring(0, path.length()-1);
	}

	public static void main(String[] args) {
		String[] array = new String[2];
		String s1 = "2 2 2";
		String s2 = "2 2 3";
		array[0] = s1;
		array[1] = s2;
		String[] result = gridLand(array);
		for(String x:result){
			System.out.println(x);
		}
	}

}
