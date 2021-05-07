package com.stackAndqueue;

public class Queue_Array {

	public static void main(String[] args) {

		QueueArray queue = new QueueArray(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.print();
		
		System.out.println("\nDequeue to remove first element:");
	        queue.dequeue();
	        queue.dequeue();

       }
}


class QueueArray {
	
	int front, rear, size;
	int que [];
	int capacity;
	
	public QueueArray(int capacity) {
		this.capacity= capacity;
		this.que=new int[capacity];
		this.size = -1;
		this.front= 0;
		this.rear = -1;
	}
	
	public void enqueue (int data) {
		
		if(isfull()) {
		   System.out.println("Queue is full");
		   return;			
		}else {
		rear++;
		if(rear == capacity-1)
		   rear=0;
		}
		que[rear]=data;
		size++;
	}

	private boolean isfull() {
		return size == capacity;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		else {
			front++;
			if(front == capacity-1) {
				System.out.print(que[front-1]+": is removed\n");
				front = 0;
			}
			else {
				System.out.print(que[front-1]+": is removed\n");
			}
			size--;
		}
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}

	public void print() {
		System.out.println("\nQueue element are:");
		
		for(int ele=0; ele <=this.size; ele++) {
		   System.out.print(que[ele]+" ");
		}
		
		System.out.println();
	}
}
