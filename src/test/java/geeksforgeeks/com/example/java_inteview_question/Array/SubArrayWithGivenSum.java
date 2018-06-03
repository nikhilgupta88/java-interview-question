package com.example.java_inteview_question.Array;


import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int size = sc.nextInt();
			int sum = sc.nextInt();
			int[] a = new int[size];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int flag = 0;
				for(int j = 0; j < size; j++) {
					int temp = 0;
					for(int k = j; k < size; k++) {
						temp = temp+ a[k];
						if(temp == sum) {
							System.out.println((j+1)+" "+(k+1));
							flag = 1;
						}
					}if (flag == 1) {
						break;
					}	
				}
				System.out.println(-1);
			
		}
	}
}
