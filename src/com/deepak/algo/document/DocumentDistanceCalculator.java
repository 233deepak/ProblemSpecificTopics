package com.deepak.algo.document;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DocumentDistanceCalculator {

	public Map<String, Integer> getWordCountMap(String filePath)
			throws IOException {
		File file = new File(filePath);
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line;
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		while ((line = bufferedReader.readLine()) != null) {
			countWords(countMap, line);
		}
		return countMap;

	}

	private void countWords(Map<String, Integer> countMap, String line) {
		line = line.replaceAll("\\.", " ");
		String[] words = line.split(" ");
		for (String word : words) {
			word = word.toLowerCase();
			if (countMap.containsKey(word)) {
				countMap.put(word, countMap.get(word) + 1);
			} else {
				countMap.put(word, 1);
			}
		}
	}

	public double vectorAngle(Map<String, Integer> document1,
			Map<String, Integer> document2) {
		double numerator = innerProduct(document1, document2);
		double denominator = Math.sqrt(innerProduct(document1, document1)
				* innerProduct(document2, document2));
		double angle = Math.acos(numerator / denominator);
		System.out.println(Math.toDegrees(angle));
		return angle;

	}

	private double innerProduct(Map<String, Integer> document1,
			Map<String, Integer> document2) {
		double sum = 0;
		for (Entry<String, Integer> entry : document1.entrySet()) {
			if (document2.containsKey(entry.getKey())) {
				sum += entry.getValue() * document2.get(entry.getKey());
			}
		}
		return sum;
	}

	public double findDistance(String document1, String document2)
			throws IOException {
		Map<String, Integer> dict1 = getWordCountMap(document1);
		Map<String, Integer> dict2 = getWordCountMap(document2);
		return vectorAngle(dict1, dict2);

	}

}
