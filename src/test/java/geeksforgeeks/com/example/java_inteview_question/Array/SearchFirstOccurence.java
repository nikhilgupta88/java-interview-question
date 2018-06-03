package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class SearchFirstOccurence {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- >0){
		    int size = sc.nextInt();
		    int[] a = new int[size];
		    int search_key = sc.nextInt();
		    for(int i = 0; i < size; i++){
		        a[i] = sc.nextInt();
		    }
		    System.out.print("\n"+search(a,search_key,0));
		    
		} 
    }
	
	public static int searchPosition(int[] a, int search_key){ 
        int l = 0;
	    for(int i = 0; i < a.length; i++){
	        if(a[i] == search_key){
	            l = l+1;
	            return i+1;
	        }
	    }
    	    if(l == 0)
    	     return -1;
	     
	     return 0;
	}

	public static int search(int[] a, int search_key, int start) {
		if(start >= a.length) return -1;
		if(a[start] == search_key) {
				return start+1;
		}else {
			return search(a, search_key, start+1);
		}
	}
}
