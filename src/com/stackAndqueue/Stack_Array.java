package com.stackAndqueue;

public class Stack_Array {
	
public static void main (String [] args) {
		
		System.out.println("To create Stack using Array");
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		
		stack.print();	
	}

}

class Stack {
	
	 private int top;
	 private int [] stk;
	
	 public Stack() {
		this.top = -1;
		this.stk = new int[10];
	 }
	
	 public Stack(int maxSize) {
		this.top = -1;
		this.stk = new int[maxSize];
	 }
	
	 public boolean push(int data) {
		
		if(isFull()) {
		System.out.println("Stack OverFlow");
		return  false;
		}else {
		stk[++top] = data;
		System.out.println(data+" pushed into stack");	
		return true;	
		}
	 }

	 public boolean isFull() {
		return top >= stk.length - 1;
	 }
	
	
	
	 public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return 0;
		}else {
			return stk[top];
		}
	 }
	 
         public boolean isEmpty() {
		return  this.top < 0;
	 } 
	
	 public void print() {
		System.out.println("\nStack element are :");
		if(isEmpty() ) {
			System.out.println("[]");
		}
		
		for (int ele=0; ele <=this.top; ele++) {
			System.out.print(stk[ele]+" ");
		}
		
		System.out.println();
	 }		
			
}