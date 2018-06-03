package com.example.java_inteview_question.String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Remove {
	public static void main (String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
    int t= Integer.parseInt(sc.nextLine());
	
	while(t-->0)
	{
	    
	    String s1=sc.nextLine();
	   // String s1="geeksforgeeks";
	   //System.out.println(s1);
		char ar[] =s1.toCharArray();
		String str="";
		//System.out.println(str);
		for(int i=0;i<ar.length;i++)
		{
			if(!str.contains(String.valueOf(ar[i]))){
				
				str=str.concat(String.valueOf(ar[i]));
			}
									
		}
		System.out.println(str);

	    
	    
	    
	    
	}
	}
}