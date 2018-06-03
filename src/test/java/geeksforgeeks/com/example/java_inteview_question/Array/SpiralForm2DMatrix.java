package com.example.java_inteview_question.Array;

import java.util.Scanner;

public class SpiralForm2DMatrix {

	public static void printSpiral(int m, int n, int[][] a) {
		int i, l = 0, k = 0;
		int last_row = 	m-1, last_col = n-1;
		
		while(k <= last_row && l <= last_col) {
			for(i = l; i <= last_col; i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(i = k; i <=last_row; i++) {
				System.out.print(a[i][last_col]+" ");
			}
			last_col--;
			if(k <= last_row) {
				for(i = last_col; i >= l; i--) {
					System.out.print(a[last_row][i]+" ");
				}
				last_row--;
			}
			if(l <= last_col) {
				for(i = last_row; i >= k; i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
			
		}
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int[][] a = new int[4][4];
			for(int i =0; i < a.length;i++) {
				for(int j = 0; j < a.length; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			printSpiral(4, 4, a);
		}
	}
}
