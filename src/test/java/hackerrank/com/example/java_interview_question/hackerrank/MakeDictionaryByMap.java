package com.example.java_interview_question.hackerrank;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MakeDictionaryByMap {
	public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> m = new Hashtable<String, Integer>();
        for(int i=0;i<n;i++) {
        	String name = sc.next();
        	int phone = sc.nextInt();
        	m.put(name, phone);
        }
        while(sc.hasNext()) {
        	String s = sc.next();
        	if(m.get(s) == null) {
        		System.out.println("Not found");
        	}else {
        		System.out.println(s+"="+m.get(s));
        	}
        }
        
	}
}
