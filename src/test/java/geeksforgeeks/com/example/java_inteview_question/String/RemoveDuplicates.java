package com.example.java_inteview_question.String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	static String removeDupSort(String str) {
    	int p = 1, q = 1;
    	char[] c = str.toCharArray();
    	while(p != c.length) {
    		if(c[p] != c[p-1]) {
    			c[q] = c[p];
    			q++;
    		}
    		p++;
    		
    	}
    	str = new String(c);
    	return str.substring(0,q); 
    }
	static String removeDups(String str) {
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);
		return removeDupSort(str);
	}
	
	static void removeDuplicates(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for(int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
			
		}
		for(Character ch : lhs) {
			System.out.print(ch);
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			String str = sc.next();
			str += sc.next();
			removeDuplicates(str);
		}
	}

}
