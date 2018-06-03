package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class ZigZagArray {

	public static void convertZigZag(int[] a) {
		boolean flag = false;
		int i = 0;
		while(i < a.length-1) {
			if(!flag) {
				if(a[i] < a[i+1]) {
					flag = !flag;
				}else {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flag = !flag;
				}
			}else {
				if(a[i] > a[i+1]) {
					flag = !flag;
				}else {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					flag = !flag;
				}
			}
			i++;
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int size = sc.nextInt();
			int[] a = new int[size];
			for(int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			convertZigZag(a);
			for(int aa : a) {
				System.out.print(aa+" ");
			}
			System.out.println();
		}
	}
}
