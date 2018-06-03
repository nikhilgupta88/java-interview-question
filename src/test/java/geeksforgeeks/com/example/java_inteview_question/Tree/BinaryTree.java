package com.example.java_inteview_question.Tree;

class Node {
	int data;
	Node left; 
	Node right;
	public Node(int data) {
		this.data = data;
	}
}
public class BinaryTree {

	public BinaryTree() {
		Node root;
	}
	void leftViewRec(Node root, int level, int maxLevel) {
	
		if(root == null) {
			return;
		}
		if(level > maxLevel) {
			System.out.print(root.data+" ");
			maxLevel = level;
		}
		
		leftViewRec(root.left, level+1, maxLevel);
		leftViewRec(root.right, level+1, maxLevel);
	}
	public void printLeftView(Node root) {
		int maxLevel = 0;
		leftViewRec(root, 0, maxLevel);
	}
}
