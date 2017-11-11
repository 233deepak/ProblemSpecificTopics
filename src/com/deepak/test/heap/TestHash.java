package com.deepak.test.heap;

import org.junit.Test;

import com.deepak.algo.heaps.RollingHashADT;

public class TestHash {

	@Test
	public void testBuildRollingHash() {
      RollingHashADT rollingHashADT =new RollingHashADT("hat");
      System.out.println(rollingHashADT.getHash());
	}

	@Test
	public void testBuildRollingHash1() {
      RollingHashADT rollingHashADT =new RollingHashADT("hta");
      System.out.println(rollingHashADT.getHash());
	}
	
	@Test
	public void testBuildRollingHashSkip() {
      RollingHashADT rollingHashADT =new RollingHashADT("hat");
      System.out.println(rollingHashADT.getHashValue());
      rollingHashADT.skipFirst();
      System.out.println(rollingHashADT.getHashValue());
      rollingHashADT.computeHash();
      System.out.println(rollingHashADT.getHashValue());
      
	}
	
	@Test
	public void testBuildRollingHashSkipAndAdd() {
      RollingHashADT rollingHashADT =new RollingHashADT(0);
      rollingHashADT.appendLast('h');
      rollingHashADT.appendLast('a');
      rollingHashADT.appendLast('t');
      System.out.println(rollingHashADT.getHashValue());
      
	}
	
	
}
