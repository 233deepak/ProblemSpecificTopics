package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.RankOfSting;

public class TestRankOfString {

	RankOfSting rankOfSting = new RankOfSting();

	@Test
	public void test() {
       System.out.println(rankOfSting.findRank("acb"));
	}
	
	@Test
	public void test1() {
       System.out.println(rankOfSting.findRank("string"));
	}

	@Test
	public void test2() {
       System.out.println(rankOfSting.findRank("DTNGJPURFHYEW"));
	}
}
