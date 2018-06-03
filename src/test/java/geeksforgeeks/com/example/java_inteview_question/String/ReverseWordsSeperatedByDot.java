package com.example.java_inteview_question.String;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsSeperatedByDot {
	public static void reverseWords(String str){
        String[] st = str.split("\\.");
        for(int i = st.length-1; i >= 0; i--){
        	if(i > 0) {
        		st[i] = st[i].concat(".");
        	}
            System.out.print(st[i]);    
        }
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-- > 0){
	        String str = sc.next();
	        reverseWords(str);
	        System.out.println();
	    }
	}

}
