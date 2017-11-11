package com.deepak.algo.patternmatching;

public class PatternMatcher {

	public int[] prepareHArray(String pattern) {
		int[] hArray = new int[pattern.length()];
		hArray[0] = 0;
		int j = 0;
		char[] characterArray = pattern.toCharArray();
		for (int i = 1; i < characterArray.length;) {
			if (characterArray[i] == characterArray[j]) {
				hArray[i] = hArray[i - 1] + 1;
				i++;
				j++;
			} else {
				if (j == 0) {
					hArray[i] = 0;
					i++;
				} else {
					j = hArray[j - 1];
				}
			}

		}
		return hArray;
	}

	public void printArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}

	}

	public int findOccurrence(String text, String pattern) {
		int[] harray = prepareHArray(pattern);
		char[] characterArray = text.toCharArray();
		char[] patternArray = pattern.toCharArray();
		int j = 0;
		for (int i = 0; i < characterArray.length;) {
			if (characterArray[i] == patternArray[j]) {
				i++;
				j++;
			} else {
				if (j == 0) {
					i++;
				} else {
					j = harray[j - 1];
				}
			}
			if (j == pattern.length())
				return i - j + 1;
		}
		return -1;
	}

	public int findAndHiglightOccurrence(String text, String pattern) {
		int[] harray = prepareHArray(pattern);
		char[] characterArray = text.toCharArray();
		char[] patternArray = pattern.toCharArray();
		int j = 0;
		for (int i = 0; i < characterArray.length;) {
			if (characterArray[i] == patternArray[j]) {
				i++;
				j++;
			} else {
				if (j == 0) {
					i++;
				} else {
					j = harray[j - 1];
				}
			}
			if (j == pattern.length()) {
				for (int index = i - 1; index >= i - j; index--) {
					characterArray[index] = '#';
				}
				System.out.println(new String(characterArray));
				return i - j + 1;
			}
		}
		return -1;
	}
	
	public int findAndHiglightAllOccurrence(String text, String pattern) {
		int[] harray = prepareHArray(pattern);
		char[] characterArray = text.toCharArray();
		char[] patternArray = pattern.toCharArray();
		int j = 0;
		int indexOfLastOcc=-1;
		//String resultString="";
		for (int i = 0; i < characterArray.length;) {
			if (characterArray[i] == patternArray[j]) {
				i++;
				j++;
			} else {
				if (j == 0) {
					i++;
				} else {
					j = harray[j - 1];
				}
			}
			if (j == pattern.length()) {
				for (int index = i - 1; index >= i - pattern.length(); index--) {
					characterArray[index] = '#';
				}
				//resultString=new String(characterArray);
				indexOfLastOcc= i - j + 1;j=0;
			}
		}
		System.out.println(new String(characterArray));
		return indexOfLastOcc;
	}
}
