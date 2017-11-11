package com.deepak.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.deepak.algo.huffmanCode.HuffmanCodeGenerator;
import com.deepak.algo.huffmanCode.Node;
import com.deepak.algo.huffmanCode.TextEncoder;

public class HuffmanCoderTest {

	TextEncoder encoder = new TextEncoder();
	HuffmanCodeGenerator<Character> codeGenerator = encoder.getCodeGenerator();

	@Test
	public void testIntitalTreeGeneration() {
		String text = "this is an example for huffman encoding";
		Map<Character, Integer> characterCountMap = encoder
				.getCharacterCount(text);
		System.out.println(characterCountMap);
		List<Node<Character>> nodes = codeGenerator
				.createInitialSubtreeArray(characterCountMap);
		System.out.println(nodes);
	}

	@Test
	public void testHuffmanTreeGeneration() {
		String text = "this is an example for huffman encoding";
		Map<Character, Integer> characterCountMap = encoder
				.getCharacterCount(text);
		System.out.println(characterCountMap);
		List<Node<Character>> nodes = codeGenerator
				.createInitialSubtreeArray(characterCountMap);
		Node<Character> node = codeGenerator.generateHuffmanTree(nodes);
		System.out.println(node);
	}

	@Test
	public void testAssignCode() {
		String text = "this is an example for huffman encoding";
		Map<Character, Integer> characterCountMap = encoder
				.getCharacterCount(text);
		System.out.println(characterCountMap);
		List<Node<Character>> nodes = codeGenerator
				.createInitialSubtreeArray(characterCountMap);
		Node<Character> node = codeGenerator.generateHuffmanTree(nodes);
		codeGenerator.assignCode(node, "");
		System.out.println(node);
		System.out.println(codeGenerator.getSymbolAndCodeMap());
	}

	@Test
	public void testEccodeString() {
		String text = "this is an example for huffman encoding";
		System.out.println(encoder.encodeText(text));

	}

	@Test
	public void testDecodeString() {
		String text = "this is an example for huffman encoding";
		String encodedString = encoder.encodeText(text);
		System.out.println(encoder.decodeString(encodedString));

	}
}
