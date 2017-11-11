package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Modulo {
	
	public static void main(String args[] ) throws Exception {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] datas = line.split(" ");
		int n =Integer.parseInt(datas[0]);
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(Integer.parseInt(datas[i+1]));
		}
		
		int number=1;
		while(true){
			Set<Integer> set =new HashSet<Integer>();
			for(int i=0;i<n;i++){
				int mod = list.get(i)%number;
				set.add(mod);
			}
			if(set.size()==list.size()){
				System.out.println(number);
				break;
			}
			number++;
			
		}
	}

}
