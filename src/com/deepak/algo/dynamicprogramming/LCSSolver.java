package com.deepak.algo.dynamicprogramming;

public class LCSSolver {

	public char[] search(char[] first, char[] second) {
		if (first.length == 0 || second.length == 0) {
			return null;
		}
		char firstCharacter = first[0];
		int k = findFirstMatch(firstCharacter, second);
		char[] rLeft=null;
		if (k != -1){
			char[] result = search(getSubstring(1, first),
					getSubstring(k + 1, second));
			rLeft = concateChar(firstCharacter, result);
		} 
		char[] rRight = search(getSubstring(1, first), second);
		return getlargestArray(rLeft, rRight);
	}

	public int findFirstMatch(char character, char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (character == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public char[] concateChar(char character, char[] array) {
		char[] result;
		if (array == null) {
			result = new char[1];
			result[0] = character;
			return result;
		}
		result = new char[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			result[i + 1] = array[i];
		}
		result[0] = character;
		return result;
	}

	public char[] getlargestArray(char[] left, char[] right) {
		if (left == null && right == null)
			return null;
		else if (left != null && right == null)
			return left;
		else if (right != null && left == null)
			return right;
		return (left.length > right.length) ? left : right;
	}

	public char[] getSubstring(int startIndex, char[] array) {
		char[] result = new char[array.length - startIndex];
		int k = 0;
		for (int i = startIndex; i < array.length; i++) {
			result[k++] = array[i];
		}
		return result;
	}
}
