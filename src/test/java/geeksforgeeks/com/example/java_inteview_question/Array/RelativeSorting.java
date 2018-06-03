package com.example.java_inteview_question.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RelativeSorting {

	public static int first(int[] arr, int low,
			int high, int x, int n) {
		if (high >= low) {   
            int mid = low + (high-low)/2;
             
            if ((mid == 0 || x > arr[mid-1]) &&
                                arr[mid] == x)
                return mid;
            if (x > arr[mid])
                return first(arr, (mid + 1), high,
                                            x, n);
            return first(arr, low, (mid -1), x, n);
        }
        return -1;
    }
	
	public static void sortAccording(int[] a1, int[] a2, 
			int m, int n) {
		int[] temp = new int[m];
		int[] visited = new int[m];
		for(int i = 0; i < m; i++) {
			temp[i] = a1[i];
			visited[i] = 0;
		}
		Arrays.sort(temp);
		int ind = 0;  
	      
        for (int i = 0; i < n; i++) {
            int f = first(temp, 0, m-1, a2[i], m);
      
            if (f == -1) continue;
      
            for (int j = f; (j < m && temp[j] == a2[i]); j++) {
                a1[ind++] = temp[j];
                visited[j] = 1;
            }
        }
      
        for (int i = 0; i < m; i++)
            if (visited[i] == 0)
                a1[ind++] = temp[i];
	}
	
	/*public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] a1 = new int[m];
			int[] a2 = new int[n];
			for(int i = 0; i < m; i++) {
				a1[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				a2[i] = sc.nextInt();
			}
			sortAccording(a1, a2, m, n);
			for(int a: a1) {
				System.out.print(a+" ");
			}
				System.out.println();
		}
	}
*/
	/*public static void main (String[] args) {
	    Scanner s= new Scanner(System.in);
	    int testCases=s.nextInt();
	    for(int t=0;t<testCases;t++){
	        
	        int a1Size=s.nextInt();
	        int a2Size=s.nextInt();
	        int [] a1=new int[a1Size];
	        int [] a2=new int[a2Size];
	          for(int i=0;i<a1Size;i++){
	          a1[i]=s.nextInt();  
	        }
	        for(int i=0;i<a2Size;i++){
	          a2[i]=s.nextInt();  
	        }
	        
	        int jMax=0;
	      for(int i=0;i<a2Size;i++){
    	         for(int j=0;j<a1Size;j++){
        	          if(a1[j]==a2[i]){
        	              int temp=a1[jMax];
        	              a1[jMax++]=a1[j];
        	              a1[j]=temp;
        	          }
        	            
        	            
    	        }   
	        }
	           //printArray(a1);
	        //System.out.println("jMAX : "+jMax);
	       for(int i=jMax;i<a1Size;i++){
	           boolean sorted=true;
	            for(int j=jMax;j<a1Size-1;j++){
	                if(a1[j]>a1[j+1]){
	                    sorted=false;
	                    int temp=a1[j];
	                    a1[j]=a1[j+1];
	                    a1[j+1]=temp;
	                }
	       }  
	       System.out.println("After Iteration: "+(i+1));
	        printArray(a1);
	       if(sorted)
	        break;
	       }
	       
	       
	      printArray(a1);
	        
	    }
	}
	
	static void printArray(int[] arr){
	    
	     for(int val: arr)
	        System.out.print(val+" ");
	        System.out.println();
	}*/
/*	public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        int t = SC.nextInt();
        while(t-->0){
            int m =SC.nextInt();
            int n =SC.nextInt();
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            for(int i=0; i<m; i++)
                arr1[i] = SC.nextInt();
            for(int i=0; i<n; i++)
                arr2[i] = SC.nextInt();
            int temp,count=0;
            for(int i=0; i<n ; i++){
                for(int j=0; j<m; j++){
                    if(arr1[j]==arr2[i]){
                        temp = arr1[count];
                        arr1[count]=arr1[j];
                        arr1[j] = temp;
                        count++;
                    }
                }
            }
            Arrays.sort(arr1, count, m);
            for(int i=0; i<m; i++)
                System.out.print(arr1[i]+" ");
                System.out.println();
        }
    }
*/
	/*public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
		    int m = sc.nextInt();
		    int n = sc.nextInt();
		    int a1[] = new int[m];
		    int a2[] = new int[n];
		    for(int j = 0; j < m; j++)
		    {
		        a1[j] = sc.nextInt();
		    }
		    for(int j = 0; j < n; j++)
		    {
		        a2[j] = sc.nextInt();
		    }
		    int a3[] = new int[m];
		    int k = 0;
		    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		    for(int j = 0; j < n; j++)
		    {
		        if(map.containsKey(a2[j]))
		        {
		            
		        }
		        else
		        {
		            map.put(a2[j] , 1);
		        }
		    }
		    for(int j = 0; j < m; j++)
		    {
		        if(map.containsKey(a1[j]))
		        {
		            map.put(a1[j] , map.get(a1[j]) + 1);
		        }
		        else
		        {
		            a3[k++] = a1[j];
		        }
		    }
		    Arrays.sort(a3);
		    for(int j = 0; j < n; j++)
		    {
		        int y = a2[j];
		        int z = map.get(a2[j]);
		        for(int f = 1; f < z; f++)
		        {
		            System.out.print(y + " ");
		        }
		    }
		    for(int j = 0; j < m; j++)
		    {
		        if(a3[j] > 0)
		        System.out.print(a3[j] + " ");
		    }
		    System.out.println();
		}
	}*/
	void relativeSorting(int[]a,int[]b){
	    int []map=new int[a.length];
	    for(int i=0;i<a.length;i++)
	        map[i]=0;
	    Arrays.sort(a);
	    for(int i=0;i<b.length;i++)
	        for(int j=0;j<a.length;j++)
	            if(b[i]==a[j]){
	                System.out.print(b[i]+" ");
	                map[j]=1;
	            }
	    for(int i=0;i<a.length;i++)
	        if(map[i]==0)
	            System.out.print(a[i]+" ");
	    System.out.println();
	}
}
