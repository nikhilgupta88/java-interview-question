package com.example.java_inteview_question.Array;
import java.util.*;
import java.util.Map.Entry;
public class SortingElementsArrayByFrequency {

	public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	        for(int i=0; i<arr.length; i++) {
	            if(map.containsKey(arr[i])) {
	                int count = map.get(arr[i]);
	                map.put(arr[i], count+1);
	            } else {
	                map.put(arr[i], 1);
	            }
	        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });

	        for(Map.Entry<Integer, Integer> entry : list) {
	            int count = entry.getValue();
	            for(int i=1; i<=count; i++) {
	                System.out.print(" " + entry.getKey());
	            }

	        }
	    }
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-->0){
	        int size = sc.nextInt();
	        int[] a = new int[size];
	        for(int i = 0; i < a.length; i++){
	            a[i] = sc.nextInt();
	        }
	        sortByFrequency(a);
	        System.out.println();
	    }
	}
}
