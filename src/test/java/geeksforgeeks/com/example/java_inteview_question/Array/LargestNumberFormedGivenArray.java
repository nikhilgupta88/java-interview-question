package com.example.java_inteview_question.Array;
import java.util.*;

public class LargestNumberFormedGivenArray {

	public static void largestNumber(Vector<String> a){
        Collections.sort(a, new Comparator<String>() {
		public int compare(String x, String y) {
			String xy = x + y;
			String yx = y + x;
			
			return xy.compareTo(yx) > 0 ? -1: 1;
		}
        });
        Iterator it = a.iterator();
        while(it.hasNext())
        	System.out.print(it.next());
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-- > 0){
	        int size = sc.nextInt();
	        Vector<String> v = new Vector<String>();
	        for(int i = 0; i < size; i++ ){
	           v.add(new String(sc.next()));
	        }
	        largestNumber(v);
	        System.out.println();
	    }   
	}
	
}
