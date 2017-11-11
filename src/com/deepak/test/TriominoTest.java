package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.Trimino;

public class TriominoTest {
	
	
	@Test
	public void test(){
		
	    Trimino trimino=new Trimino(4, 0, 3);
		trimino.print();
	}

	@Test
	public void testForSize2(){
		
		Trimino trimino=new Trimino(2, 1, 1);
		trimino.startTiling();
		trimino.print();
	}
	
	@Test
	public void testForSize4FirstQuardant(){
		
		Trimino trimino=new Trimino(4, 1, 1);
		trimino.startTiling();
		trimino.print();
	}
	
	@Test
	public void testForSize4SecondQuardant(){
		
		Trimino trimino=new Trimino(4, 1,3);
		trimino.startTiling();
		trimino.print();
	}
	
	@Test
	public void testForSize4ThirdQuardant(){
		
		Trimino trimino=new Trimino(4, 3,0);
		trimino.startTiling();
		trimino.print();
	}
	
	@Test
	public void testForSize4FourthQuardant(){
		
		Trimino trimino=new Trimino(4, 3,3);
		trimino.startTiling();
		trimino.print();
	}
	
	@Test
	public void testForSize8(){
		
		Trimino trimino=new Trimino(8,0,0);
		trimino.startTiling();
		trimino.print();
	}
	
}
