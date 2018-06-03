package com.example.java_inteview_question.Array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
	
/*	public static void main (String[] args) {
    	Scanner s= new Scanner(System.in);
    	int testCases=s.nextInt();
    	for(int t=0;t<testCases;t++){
    	    
    	    
    	    int k=s.nextInt();
    	    
    	    int size=s.nextInt();
    	    int kthMax[]=new int[size];
    	    int [] max= new int[k];
    	    for(int i=0;i<k;i++){
    	     max[i]=-1;   
    	    }
    	    for(int i=0;i<size;i++){
    	        int temp=s.nextInt();
    	        int j=0;
    	        //int prev
    	        while(j<k){
    	            
    	            if(temp>max[j]){
    	                
    	                while (j<k){
    	                    int temp1=max[j];
    	                    max[j]=temp;
    	                    temp=temp1;
    	                    j++;
    	                }
    	                break;
    	            }
    	            j++;
    	        } 
    	        kthMax[i]=max[k-1];
    	    }
    	    for(int val :kthMax)
    	    System.out.print(val+" ");
    	    System.out.println();
    	}
	}*/
	/*public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    int k=sc.nextInt();
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		    PriorityQueue<Integer> pq=new PriorityQueue<>();
		    for(int i=0;i<k;i++){
		    	pq.add(a[i]);
		    	if(i<k-1)
		    		System.out.print(-1+" ");
		  }
		    for(int i=k;i<n;i++)
		    {
		        System.out.print(pq.peek()+" ");
		        if(a[i]>pq.peek())
		        {
		            pq.poll();
		            pq.add(a[i]);
		        }
		    }
		    System.out.print(pq.poll());
		    System.out.println("");
		    pq.clear();
		}
	}
	*/
	public static void main (String[] args) {
		//code
		    Scanner scanner = new Scanner(System.in);
		    int T = scanner.nextInt();
			while(T-->0){
			int k = scanner.nextInt();    
		    int N = scanner.nextInt();
		    int [] a = new int[N];
		    for(int i=0;i<N;i++)
		        a[i] = Integer.MAX_VALUE;
		    for(int i=0;i<N;i++){
		        a[i] = scanner.nextInt();
		        if(k-i-1>0){
		            System.out.print(-1 + " ");
		        }
		        else{
		         Arrays.sort(a);
		        System.out.print(a[i+1-k] + " ");   
		        }
		    }
		    System.out.println();
		}
	}
}
