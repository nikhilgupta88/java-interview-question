package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int size = sc.nextInt();
			int[] a = new int[size];
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int position = equilibriumPointPos(a, a.length);
			System.out.println(position);
		}
	}

	private static int equilibriumPointPos(int[] a, int size) {
		int i, j, k, l = 0;
		if(size == 1) return 1;
		if(size == 2) return -1;
		
		for(i = 0; i < size; i++) {
			int sum1 = 0, sum2 = 0;
			for(j = i; j < size; j++) {
				sum1 += a[j]; 
			}
			for(k = 0; k <= i; k++) {
				sum2 += a[k];
			}
			if(sum1 == sum2) {
				l = l +1;
				return i+1;
			}
		}
		if(l == 0) 
			return -1;
		
		return -1;
	}
    
}
