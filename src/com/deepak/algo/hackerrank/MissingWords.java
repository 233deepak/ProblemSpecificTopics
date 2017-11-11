package com.deepak.algo.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MissingWords {

	static String[] missingWords(String s, String t) {
		List<String> diff = new ArrayList<String>();
		List<String> sWords = new ArrayList<String>();
		List<String> tWords = new ArrayList<String>();
		String[] wordsS = s.split(" ");
		for (String word : wordsS) {
			sWords.add(word);
		}
		String[] wordsT = t.split(" ");
		for (String word : wordsT) {
			tWords.add(word);
		}
		for (String word : sWords) {
			if (!tWords.contains(word)) {
				diff.add(word);
			}
		}
		String[] result = new String[diff.size()];
		int index = 0;
		for (String word : diff) {
			result[index++] = word;
		}

		return result;

	}

	public static void main(String[] args) {
		String s = "I am using hackerrank to improve to programming";
		String t = "am hackerrank  improve to";
		print(missingWords(s, t));

	}
	
	static void print(String[] array){
		for(String x:array){
			System.out.println(x);
		}
	}

}
