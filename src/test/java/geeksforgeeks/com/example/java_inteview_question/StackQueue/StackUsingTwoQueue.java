package com.example.java_inteview_question.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
		// Your code here
		if(q1.isEmpty())
		    return -1;
		else{
		    while(q1.size()!=1){
		        q2.add(q1.poll());
		    }
		   Queue<Integer> q3 = q1;
		   q1=q2;
		   q2=q3;
		   return q2.poll();
		}
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	// Your code here
	q1.add(a);
    }	
	public static void main (String[] args) {
		StackUsingTwoQueue s = new StackUsingTwoQueue();
		s.push(1);s.push(2);s.push(3);s.push(4);
		System.out.println(s.pop());
		s.push(5);
		System.out.println(s.pop());
		s.push(6);s.push(7);
		System.out.println(s.pop());
		s.push(8);
		System.out.println(s.pop());
		
	}
}
