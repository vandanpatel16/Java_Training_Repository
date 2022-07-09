//1. Write a Java program which handles Push operation and Pop operation on stack concurrently.

package com.java.usingthread;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Mycall implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		
//		Random r = new Random();
//		Integer num = r.nextInt(10);
//		return num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer num = scan.nextInt();
		return num;
	}
}


public class Assignment1 {

	static void push(Stack<Integer> stack, int z) {
		stack.push(new Integer(z));
		System.out.println("Element " + z + " puch into the stack");
	}

	public static void pop(Stack<Integer> stack) {
		Integer num1 = (Integer) stack.pop();
		System.out.println("Element " + num1 + " pop from the stack");
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int a = 5;
		FutureTask<Object>[] task = new FutureTask[a];
		Callable<Object> call = new Mycall();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < a; i++) {
			task[i] = new FutureTask<Object>(call);
		}
		
		for (int x = 0; x < a; x++) {
			try {
				Thread th1 = new Thread(task[x]);
				th1.start();
				System.out.println("Creating Thread...... "+"[Thread Id: " + th1.getId() + ", Thread Name: "+ th1.getName() + ", Thread priority: " + th1.getPriority() + ", Thread status: "+th1.getState() +"]");
				Object obj = task[x].get();
				int numb = (int) obj ;
				push(st, numb);
				Thread.sleep(1000);
				th1.stop();
				System.out.println("Terminating Thread...... "+"[Thread Id: " + th1.getId() + ", Thread Name: "+ th1.getName() + ", Thread priority: " + th1.getPriority() + ", Thread status: "+th1.getState() +"]");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Stack is: "+st);
		Thread.sleep(5000);

		
		for (int x = 0; x < a; x++) {
			try {
				Thread th1 = new Thread(task[x]);
				th1.start();
				System.out.println("Creating Thread...... "+"[Thread Id: " + th1.getId() + ", Thread Name: "+ th1.getName() + ", Thread priority: " + th1.getPriority() + ", Thread status: "+th1.getState() +"]");
				pop(st);
				Thread.sleep(1000);
				th1.stop();
				System.out.println("Terminating Thread...... "+"[Thread Id: " + th1.getId() + ", Thread Name: "+ th1.getName() + ", Thread priority: " + th1.getPriority() + ", Thread status: "+th1.getState() +"]");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Stack is: "+st);
	}
}


