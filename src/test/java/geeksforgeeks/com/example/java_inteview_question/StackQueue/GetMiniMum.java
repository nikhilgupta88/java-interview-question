package com.example.java_inteview_question.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class GetMiniMum {

	Stack<Integer> s = new Stack<Integer>();
	int minEle;
    public int getMin() {
    	if (s.isEmpty())
           return -1;
        // variable minEle stores the minimum element
        // in the stack.
        else
          return minEle;
    	}
    
    int pop() {
    	if (s.isEmpty())
        {
            return -1;
        }
 
        Integer t = s.pop();
        int temp;
        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minEle)
        {
        	temp  =minEle;
        	minEle = 2*minEle - t;
        }
 
        else
        	return t;
	
        return temp;
    }

    void push(int x) {
    	if (s.isEmpty())
        {
            minEle = x;
            s.push(x);
            return;
        }
 
        // If new number is less than original minEle
        if (x < minEle)
        {
            s.push(2*x - minEle);
            minEle = x;
        }
 
        else
            s.push(x);
 
	}
    public static void main (String[] args) {
    	GetMiniMum g = new GetMiniMum();
    	g.push(79);
    	System.out.println(g.getMin());
    	g.push(4);
    	System.out.println(g.getMin());
    	System.out.println(g.getMin());
    	System.out.println(g.pop());
    	g.push(61);
    	System.out.println(g.getMin());
    	
    	}
}
