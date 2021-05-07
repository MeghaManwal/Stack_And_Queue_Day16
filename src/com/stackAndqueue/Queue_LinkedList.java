package com.stackAndqueue;

import com.stackAndqueue.LinkedListStack.StackNode;

public class Queue_LinkedList {
	
   public static void main(String[] args) {

	 Queue queue1=new Queue();
	 queue1.enqueue(56);
	 queue1.enqueue(30);
	 queue1.enqueue(70);
	
	 queue1.printlist();
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
	
	public void enqueue(int data) {
		QNode temp = new QNode(data);
		if(this.rear == null) {
			this.front = temp;
			this.rear = temp;
			return;
		}
		
		this.rear.next = temp;
		this.rear =temp;
	}
	
	public void printlist() {
                 System.out.print("\nQueue using LinkedList:\n");
                 QNode temp=front;

                 while(temp != null) {
                  System.out.print(temp.data+" -> ");
                  temp = temp.next;
                 }
        }
	
	
}