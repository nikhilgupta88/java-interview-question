package com.example.java_inteview_question.StackQueue;

import java.util.Stack;

public class QueueUsingTwoStack {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	void insert(int value) {
		if(s2.isEmpty()){
			  s1.push(value);
			}
			else{
			    while(!s2.isEmpty()){
			        int temp =s2.pop();
			        s1.push(temp);
			    }
			    s1.push(value);
			 }
	}
	
	int remove() {
		if(s2.isEmpty()) {
			
			if(s1.isEmpty()) {
				System.exit(0);
			} else {
				while(!s1.isEmpty()){
					s2.push(s1.pop());
				}
			}
			
		}
		return s2.pop();

	}
	public static void main (String[] args) {
		QueueUsingTwoStack q = new QueueUsingTwoStack();
		q.insert(2);q.insert(3);q.insert(4);q.insert(5);
		System.out.println(q.remove());
		q.insert(2);q.insert(3);q.insert(4);q.insert(5);
		System.out.println(q.remove());
		
	}
}
