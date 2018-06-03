package com.example.java_inteview_question.String;

import java.util.Scanner;
import java.util.Stack;

public class CheckParentheses {

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
		String str = sc.next();
		checkParentheses(str);
		}
	}

	private static boolean isMatchingPair(char char1, char char2) {
		if(char1 == '(' && char2 == ')') {
			return true;
		}else if(char1 == '{' && char2 == '}') {
			return true;
		}else if(char1 == '[' && char2 == ']') {
			return true;
		}else 
			return false;
	}
	
	private static void checkParentheses(String str) {
		Stack<Character> s = new Stack<Character>();
		char[] c = new char[str.length()];
			c = str.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '{' || c[i]  == '[' || c[i] == '(') {
				s.push(c[i]);
			} 
			if(c[i] == '}' || c[i] == ']' || c[i] == ')') {
				if(s.isEmpty()) {
					return;
				}
				else if(!isMatchingPair(s.pop(), c[i])) {
					return;
				}
			}
		}
		if(s.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}
