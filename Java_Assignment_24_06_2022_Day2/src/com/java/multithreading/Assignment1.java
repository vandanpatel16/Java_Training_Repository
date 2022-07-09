//1. Try this java program which implements thread concepts.

package com.java.multithreading;

class Thread1 implements Runnable{

	private Integer number;
	
	public Thread1(Integer num) {
		this.number = num;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Creating Thread...............");
			System.out.println("[Thread Id: " + Thread.currentThread().getId() + ", Thread Name: "+ Thread.currentThread().getName() + ", Thread priority: " + Thread.currentThread().getPriority() + ", Thread status: "+Thread.currentThread().getState() + ", Number: " + number+"]");
			process();
			System.out.println("Terminating Thread.................");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void process() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			Thread1 t = new Thread1(i);
			t.run();
		}
	}

}
