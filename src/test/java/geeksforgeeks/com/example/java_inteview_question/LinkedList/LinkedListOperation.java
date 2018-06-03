package com.example.java_inteview_question.LinkedList;

import java.util.Stack;

public class LinkedListOperation {
	
	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	class LinkedList{
		Node head;
	}
	
	public int getMiddle(Node head) {
		int size = findLength(head);
		Node current = head;
		for(int i = 0; i < size/2; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	public int findLength(Node head) {
	
		if(head == null) {
			return 0;
		}
		Node current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public Node revrese(Node head) {
		if (head == null) {
			return head;
		}
		
		Node current = head, previous = null, next = null ;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		head = previous;
		return head;
	}
	
	public int detectLoop(Node head) {
		Node fast=head,slow=head;
		if(head==null)
		return 0;
		while(fast!=null && fast.next!=null)
		{
		fast=fast.next.next;
		slow=slow.next;
		if(slow==fast)
		return 1;

		}
		return 0;
		
	}
	public Node rotate(Node head,int k) {
	    Node current = head, temp = null, prevHead = head;
	    for(int i = 1; i < k; i++){
	        current = current.next;    
	    }
	    current.next = temp;
	    head = temp;
	    current.next = null;
	    while(temp.next!= null) {
	    	temp = temp.next;
	    }
	    temp.next = prevHead;
	    return head;
	}
	
	public int getNthFromLast(Node head, int n){
	       Node current = head;
	       int size = findLength(head);
	       if(n > size) return -1;
	       for(int i = 0; i <= size-n; i++ ) {
	    	   current = current.next;
	       }
	       return (current.data);
	}
	public int getNthFromLast1(Node head, int n)
    {
		int count=0;
		 Node m=head,nt=head;
		 if(head==null)
		 return -1;
		 while(++count<n)
		 {
		     m=m.next;
		     if(m==null)
		     return -1;
		 }
		 while(m.next!=null)
		 {
		     m=m.next;
		     nt=nt.next;
		 }
		 return nt.data;
		 
    }
	public int count(Node head, int search_for) {

	    Node current = head;
	    int count = 1;
	    while(current.next != null){
	        if(current.data == search_for){
	            count++;
	        }
	    }
	    return count;
	}
	public Node mergeLists(Node headA, Node headB) {
        Node currentA = headA, currentB = headB;
            Node sort, newHead;
            if(headA == null) return headB;
            if(headB == null) return headA;
            if(currentA.data < currentB.data){
                sort = currentA;
                currentA = currentA.next;
            }else {
                sort = currentB;
                currentB = currentB.next;
            }
            newHead = sort;
            
            while(currentA != null && currentB != null){
                if(currentA.data <= currentB.data){
                    sort.next = currentA;
                    sort = currentA;
                    currentA = currentA.next;
                }else{
                        sort.next = currentB;
                        sort = currentB;
                        currentB = currentB.next;
                }
            }
            if(currentA == null) sort.next = currentB;
            if(currentB == null) sort.next = currentA;
            
        return newHead;
   } 
	public int intersectPoint(Node headA, Node headB)
	{
     int sizeA = findLength(headA);
     int sizeB = findLength(headB);
     int d = Math.abs(sizeA-sizeB);
     Node currentA = headA, currentB = headB;
     if(sizeA > sizeB){
         for(int i = 0; i < d;i++){
             currentA = currentA.next;
         }
     }else {
         for(int i = 0; i < d;i++){
             currentB = currentB.next;
         }
     }
     while(currentA != currentB){
         currentA = currentA.next;
         currentB = currentB.next;
         
     }
     return currentA.data;
     
    }
	public void deleteNode(Node del)
    {
         Node temp = del.next;
         del.data = temp.data;
         del.next = temp.next;
    }
	public void linksort(Node head) {

	    Node current = head;
	    int count0 = 0, count1 = 0, count2 = 0;
	    while(current!= null){
	        if(current.data == 0){
	            count0++;
	        }else if(current.data == 1){
	            count1++;
	        }
	        else if(current.data == 2){
	            count2++;
	        }
	        current = current.next;
	    }
	        current = head;
	    while(current != null){
	        while(count0-- > 0){
	            current.data = 0;
	            current = current.next;
	        }
	        while(count1-- > 0){
	            current.data = 1;
	            current = current.next;
	        }
	        while(count2-- > 0){
	            current.data = 2;
	            current = current.next;
	        }
	    }
	    
	}

	public boolean isPalindrome(Node head) {
		Node current = head, runner = head;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(runner != null && runner.next != null) {
			stack.push(current.data);
			current = current.next;
			runner = runner.next.next;
			
		}
		if(runner != null) current = current.next;
		
		while(current != null) {
			if(stack.pop().intValue() != current.data) return false;
			current = current.next;
		}
		return true;
	}
	
	
	public Node addTwoLists(Node first, Node second) {
		Node result = null,temp = null,prev = null;
		int carry = 0, sum;
		while(first != null || second != null) {
			sum = carry + first.data + second.data;
			carry = sum/10;
			sum = sum % 10;
			
			temp = new Node(sum);
			if(result == null) {
				result = temp;
			}else {
				prev.next = temp;
			}
			prev = temp;
			
			first = first.next;
			second = second.next;
			
		}
		if(carry > 0) {
			temp.next = new Node(carry); 
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
