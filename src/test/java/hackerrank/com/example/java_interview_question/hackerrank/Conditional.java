package com.example.java_interview_question.hackerrank;

import java.util.Scanner;

public class Conditional {
	   
	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      if(n%2==1 || n>=6 && n<=20){
	    	  ans = "Weird"; 
		  }else {
			  ans = "Not Weird"; 
		  }
	      System.out.println(ans);
	   }
	}
