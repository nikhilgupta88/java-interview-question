package com.example.java_interview_question.hackerrank;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MakeDictionary {
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Dictionary<Object, Object> d = new Hashtable<Object, Object>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	             d.put(name, phone);   
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if(d.get(s) == null) {
	            	System.out.println("Not found");
		            
	            	 }else {
	            		 System.out.println(s +" = "+d.get(s));
	      	           
	            }
	        }
	        in.close();
	    }
	
}

