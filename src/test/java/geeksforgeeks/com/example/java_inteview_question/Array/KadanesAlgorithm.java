package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class KadanesAlgorithm {

	private static Scanner sc;
	public static int kadane(int[] a, int size) {
		int currMax = a[0], actualMax = a[0];
	    for(int j = 1 ; j < size; j++){
	        currMax = Math.max(currMax + a[j], a[j]);
	        actualMax = Math.max(currMax, actualMax);
	    }
	    return actualMax;
	}
	public static void main (String[] args) {
		
		sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-- > 0) {
	    	int size = sc.nextInt();
	    	int[] a = new int[size];
		    for(int i = 0; i < size; i++){
		        a[i] = sc.nextInt();
		    }
		    System.out.print("\n"+kadane(a, a.length));	 
		    
	    }
	    
	}
}
