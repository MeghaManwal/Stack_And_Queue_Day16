package com.stackAndqueue;

public class Stack_LinkedList {
	
	public static void main (String [] args) {
		LinkedStack stack1 = new LinkedStack();
		stack1.pushlist(56);
		stack1.pushlist(30);
		stack1.pushlist(70);
		
		stack1.printlist();
		
                System.out.println("\nElement at the top of the Stack: "+ stack1.topValue());
		
		System.out.println("\nTo pop out the First element till the stack is empty");
		stack1.poplist();
		stack1.printlist();
		System.out.println("Element at the top of the Stack: "+ stack1.topValue());
		
		stack1.poplist();
		stack1.printlist();
		System.out.println("Element at the top of the Stack: "+ stack1.topValue());
		
		stack1.poplist();
		stack1.printlist();
		System.out.println("Element at the top of the Stack: "+ stack1.topValue());
		
		
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
	  
        public boolean isempty() {
   	        return root == null;
        } 
    
        public int topValue() {
   	        if(!isempty()) 
   		   return root.data; 
   	        else
   		   return 0;
        }
	
	public void poplist() {
  	        if (root == null) {
  		  System.out.println("head should not be null");
  	        }
                root=(root).next;	 	 
        }
}