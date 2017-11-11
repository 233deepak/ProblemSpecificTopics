package com.deepak.algo.onlineTest;

import java.util.Scanner;

public class PrintTraangle {
	
	static void StairCase(int n) {
        for(int i=1;i<=n;i++){
            for(int s=n-i;s>0;s--){
                 System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }      

    }
	
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        int _n;
	        _n = Integer.parseInt(in.nextLine().trim());
	        
	        StairCase(_n);
	        
	    }

}
