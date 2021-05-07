package com.stackAndqueue;

public class Stack_LinkedList {
	
	public static void main (String [] args) {
		LinkedStack stack1 = new LinkedStack();
		stack1.pushlist(56);
		stack1.pushlist(30);
		stack1.pushlist(70);
		
		stack1.printlist();
	}
}


class LinkedStack {
	
	StackNode root;
	
	class StackNode {
		int data;
		StackNode next;
		
		public StackNode(int data) {
			this.data = data;
			
		}
	}
	
	public void pushlist(int data) {
		
		StackNode newNode = new StackNode(data);
		if(isEmpty()) {
			root = newNode;
		}else {
			StackNode temp= root;
			root = newNode;
			newNode.next=temp;	
		}
		System.out.println(data+"pushed into stack");
	}

	public boolean isEmpty() {
		return root == null;
	}
	
	public void printlist() {
                System.out.print("\nStack using LinkedList:\n");
                StackNode temp=root;

                while(temp != null) {
	         System.out.print(temp.data+" -> ");
	         temp = temp.next;
                }
        }
}