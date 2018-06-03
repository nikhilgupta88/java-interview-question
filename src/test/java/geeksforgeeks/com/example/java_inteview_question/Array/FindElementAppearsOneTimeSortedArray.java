package com.example.java_inteview_question.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementAppearsOneTimeSortedArray {

		static int findSingle(int ar[])
	    {
	        // Do XOR of all elements and return
	        int res = ar[0];
	        for (int i = 1; i < ar.length; i++)
	            res = res ^ ar[i];
	     
	        return res;
	    }
		
		public static void search(int[] arr, int low, int high)
	    {
	        if(low > high)
	            return;
	        if(low == high)
	        {
	            System.out.println("The required element is "+arr[low]);
	            return;
	        }
	         
	        // Find the middle point
	        int mid = (low + high)/2;
	         
	        // If mid is even and element next to mid is
	        // same as mid, then output element lies on
	        // right side, else on left side
	        if(mid % 2 == 0)
	        {
	            if(arr[mid] == arr[mid+1])
	                search(arr, mid+2, high);
	            else
	                search(arr, low, mid);
	        }
	        // If mid is odd
	        else if(mid % 2 == 1)
	        {
	            if(arr[mid] == arr[mid-1])
	                search(arr, mid-2, high);
	            else
	                search(arr, low, mid-1);
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
//			System.out.println(findSingle(a));
			search(a, 0, a.length);	
			System.out.println();
		}
	}
}
