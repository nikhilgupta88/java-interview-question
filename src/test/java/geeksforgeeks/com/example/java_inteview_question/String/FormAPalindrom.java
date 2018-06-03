package com.example.java_inteview_question.String;
import java.util.*;

public class FormAPalindrom {
/*	Minimum insertions to form shortest palindrome
	Given a string S, determine the least number of 
	characters that should be added on to the left side
	 of S so that the complete string becomes a palindrome.*/
	    static boolean isPalindrome(char[] c, int start, int end){
	        while(start < end){
	            if(c[start] != c[end])
	                return false;
	               
	                start++;
	                end--;
	            
	        }
	        return true;
	    }
	    static int findMinInsert(char[] c, int n){
	        for(int i = n-1; i >= 0; i--){
	            if(isPalindrome(c, 0, i)){
	                return (n-i-1);
	            }
	        }
	        return -1;
	    }
	    
		public static void main (String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int test = sc.nextInt();
		    while(test-- > 0){
		        String str = sc.next();
		       char[] c = str.toCharArray();
		       System.out.println(findMinInsert(c, c.length));
		    }
		}
	}
