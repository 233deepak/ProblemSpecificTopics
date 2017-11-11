package com.deepak.algo.huffmanCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextEncoder {

	private HuffmanCodeGenerator<Character> codeGenerator;
	private Node<Character> root;

	public TextEncoder() {
		this.codeGenerator = new HuffmanCodeGenerator<Character>();
	}

	public String encodeText(String text) {

		Map<Character, Integer> characterAndCountMap = getCharacterCount(text);
		List<Node<Character>> nodes = codeGenerator
				.createInitialSubtreeArray(characterAndCountMap);
		Node<Character> node = codeGenerator.generateHuffmanTree(nodes);
		codeGenerator.assignCode(node, "");
		this.root = node;
		text = encode(text);
		return text;

	}

	public Map<Character, Integer> getCharacterCount(String text) {
		Map<Character, Integer> characterAndCountMap = new HashMap<Character, Integer>();
		if (text != null) {
			for (Character character : text.toCharArray()) {
				if (characterAndCountMap.get(character) == null) {
					characterAndCountMap.put(character, 1);
				} else {
					characterAndCountMap.put(character,
							characterAndCountMap.get(character) + 1);
				}
			}
		}
		return characterAndCountMap;
	}

	private String encode(String text) {
		Map<Character, String> symbolAndCodeMap = codeGenerator
				.getSymbolAndCodeMap();
		String encodedString = "";
		if (text != null) {
			for (Character character : text.toCharArray()) {
				encodedString += symbolAndCodeMap.get(character);
			}
		}
		return encodedString;

	}

	public String decodeString(String text) {
		String result = "";
		decode(text, root, result);
		return result;
		
	}

	private void decode(String text, Node<Character> root, String result) {
		if (text.length() > 0) {
			if (root.left == null && root.right == null) {
				result += root.value + "";
				System.out.print(root.value);
				root=this.root;
			}
			Character character = text.charAt(0);
			if (character == '0') {
				text = text.substring(1, text.length());
				decode(text, root.left, result);
				root=this.root;
			} else if (character == '1') {
				text = text.substring(1, text.length());
				decode(text, root.right, result);
				root=this.root;
			}
		}else{
			System.out.println(result);
		}
	}

	public HuffmanCodeGenerator<Character> getCodeGenerator() {
		return codeGenerator;
	}

}
