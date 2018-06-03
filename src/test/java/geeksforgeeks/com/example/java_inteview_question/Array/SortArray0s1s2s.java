package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class SortArray0s1s2s {

	public static void sortArray(int[] a, int size) {
		int count0 = 0, count1 = 0, count2 = 0;
		for(int i = 0;i < size; i++) {
			if(a[i] == 0) {
				count0++;	
			}else if(a[i] == 1) {
				count1++;
			}else {
				count2++;
			}
		}
		int j = 0;
		for(int i = 0; i < count0; i++) {
			a[j] = 0;
			j++;
		}
		for(int i = 0; i < count1; i++) {
			a[j] = 1;
			j++;
		}
		for(int i = 0; i < count2; i++) {
			a[j] = 2;
			j++;
		}
		for(int aa : a) {
			System.out.print(aa+" ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int size = sc.nextInt();
			int[] a = new int[size];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			sortArray(a, a.length);
		}
	}
}
