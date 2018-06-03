package com.example.java_inteview_question.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {

	public static void findNextLargerElement(int[] a) {
		int next, element;
		Stack<Integer> s = new Stack<Integer>();
			s.push(a[0]);
		for(int i = 1; i < a.length; i++) {
			next = a[i];
			if(!s.isEmpty()) {
				element = s.pop();
				while(element < next) {
					System.out.println(element+" --> "+next);
					if(s.isEmpty()) {
						break;
					}
					element = s.pop();
				}
				if(element > next) {
					s.push(element);
				}
			}
			s.push(next);
			
		}
		 while (s.isEmpty() == false) 
	        {
	            element = s.pop();
	            next = -1;
	            System.out.println(element+" --> "+next);
	        }
	
	}
		
	private static void findMinimumOfGreaterNumbers(int[] a, int n){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        int[] nextGreaterElement = new int[n];
        for (int i = 1; i < n; i++) {
            while (!stack.empty() && a[i] > a[stack.peek()]){
               nextGreaterElement[stack.peek()] = a[i];
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.empty()){
            nextGreaterElement[stack.peek()] = -1;
            stack.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nextGreaterElement[i] + " ");
        }
    }
	
	   private static void nextGreaterElement(int[] arr) {
	        if (arr == null || arr.length == 0)
	            return;
	        int[] result = new int[arr.length];
	        Stack<Integer> stack = new Stack<Integer>();
	        stack.push(arr[arr.length - 1]);
	        result[result.length - 1] = -1;
	        for (int i = arr.length - 2; i >= 0; i--) {

	            int pre = arr[i];
	            while (!stack.isEmpty()) {
	                int current = stack.pop();
	                if (current > pre) {
	                    result[i] = current;
	                    stack.push(current);
	                    stack.push(pre);
	                    break;
	                }
	            }
	            if (stack.isEmpty()) {
	                result[i] = -1;
	                stack.push(pre);
	            }
	        }
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }

	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- >0) {
			int[] a = new int[sc.nextInt()];
			for(int i = 0; i < a.length;i++) {
				a[i] = sc.nextInt();
			}
			findMinimumOfGreaterNumbers(a, a.length);
			nextGreaterElement(a);
			System.out.println();
		}
	}
}
