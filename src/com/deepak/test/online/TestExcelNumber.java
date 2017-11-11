package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.ExcelTitle;

public class TestExcelNumber {

	ExcelTitle excelTitle = new ExcelTitle();
	
	@Test
	public void test(){
		System.out.println(excelTitle.titleToNumber("BZ"));
	}


	@Test
	public void test1(){
		System.out.println(excelTitle.titleToNumber("AAA"));
	}
	
	@Test
	public void test2(){
		System.out.println(excelTitle.convertToTitle(54));
	}
	
	@Test
	public void test3(){
		System.out.println(excelTitle.convertToTitle(78));
	}
	
	@Test
	public void test4(){
		System.out.println(excelTitle.convertToTitle(702));
	}
}
