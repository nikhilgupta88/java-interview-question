package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class MissingNumber {
	 private static Scanner sc;
	    public static int findMissing(int[] a, int size){
	    	boolean[] binMap = new boolean[size+1];
	    	for(int i = 0; i < size; i++) {
	    		binMap[a[i]] = true;
	    	}
	    	for(int j = 0; j <= size; j++) {
	    		if(binMap[j] == false) {
	    			return j;
	    		}
	    	}
	    	return -1;
	    }
	    
		public static void main (String[] args) {
			sc =  new Scanner(System.in);
			int test = sc.nextInt();
			while(test-- > 0 ){
			    int size = sc.nextInt();
			    int[] a = new int[size];
			    for(int i = 0; i < a.length-1; i++){
			        a[i] = sc.nextInt();
			    }
			int missing = findMissing(a, a.length);
			System.out.println(missing);
			}
			
		}

}
