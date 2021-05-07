package com.stackAndqueue;

import com.stackAndqueue.LinkedListStack.StackNode;

public class Queue_LinkedList {
	
     public static void main(String[] args) {

	 Queue queue1=new Queue();
	 queue1.enqueuelist(56);
	 queue1.enqueuelist(30);
	 queue1.enqueuelist(70);
	
	 queue1.printlist();
	 System.out.println("\nTop Value before deque: "+queue1.topValue());
	 
	 queue1.dequeuelist();
	 queue1.printlist();
	 System.out.println("\nTop Value after deque: "+queue1.topValue());
     }
	
	
}

class Queue {
	
	class QNode {

	  int data;
	  QNode next;
	  
	  public QNode (int data) {
		 this.data=data;
		 next = null;
	  }
	}
	
	QNode front, rear;
	
	public Queue() {
		this.front=null;
		this.rear =null;
	}
	
	public void enqueuelist(int data) {
		QNode temp = new QNode(data);
		if(this.rear == null) {
			this.front = temp;
			this.rear = temp;
			return;
		}
		
		this.rear.next = temp;
		this.rear =temp;
	}
	
	public void dequeuelist() {
		if (this.front == null)
			return;
		
		QNode temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null)
			this.rear = null;
	}
	
	public void printlist() {
                 System.out.print("\nQueue using LinkedList:\n");
                 QNode temp=front;

                 while(temp != null) {
                  System.out.print(temp.data+" -> ");
                  temp = temp.next;
                 }
        }
	
	public boolean isempty() {
	         return front == null;
        } 

        public int topValue() {
	         if(!isempty()) 
		   return front.data; 
	         else
		   return 0;
        }
	
	
}