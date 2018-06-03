package com.example.java_inteview_question.String;

import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {

	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		}
	public static boolean isAnagram1(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int[] count = new int[1<<8];
		for(char c : str1.toCharArray()){
			count[c]++;
		}
		for(char c : str2.toCharArray()){
			count[c]--;
		}
		
		for(int i : count) {
			if(i != 0)
				return false;
			
		}
		return true;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(isAnagram(str1, str2));
			System.out.println(isAnagram1(str1, str2));
		}
	}
}
