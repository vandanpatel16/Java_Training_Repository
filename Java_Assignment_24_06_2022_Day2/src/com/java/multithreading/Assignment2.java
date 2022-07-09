//2. change the input string to “Good Morning, Good Afternoon, GoodEvening, Good Night”

package com.java.multithreading;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread2 implements Runnable{

	private String message;
	
	public Thread2(String msg) {
		this.message = msg;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Creating Thread...............");
			System.out.println("[Thread Id: " + Thread.currentThread().getId() + ", Thread Name: "+ Thread.currentThread().getName() + ", Thread priority: " + Thread.currentThread().getPriority() + ", Thread status: "+Thread.currentThread().getState() + ", Message: " + message+"]");
			process();
			System.out.println("Terminating Thread.................");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void process() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(4);
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Good Morning");
		array.add("Good Afternoon");
		array.add("Good Evening");
		array.add("Good Night");
		System.out.println("Array List: "+ array);
		System.out.println();
		
		for (String a:array) {
			Thread2 t = new Thread2(a);
			t.process();
			exe.execute(t);
		}
		
		exe.shutdown();
		while(!exe.isTerminated()) {
			
		}
	}

}
