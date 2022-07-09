//2. Write a Java program which first generates a set of random numbers and then determines negative, positive even, positive odd numbers concurrently.

package com.java.usingthread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class RandonNumber implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		
		Random r = new Random();
		Integer num = r.nextInt(15)-5;//0 to 10
		return num;
	}
}

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		FutureTask<Object>[] task = new FutureTask[5];
		
		for(int i = 0; i < 5; i++) {
			Callable<Object> call = new RandonNumber();
			task[i] = new FutureTask<Object>(call);
			Thread t = new Thread(task[i]);
			t.start();
		}
		
		for (int a = 0; a < 5; a++) {
			Object obj = task[a].get();
			int numb = (int) obj ;
			Thread.sleep(1000);
			
			if (numb >= 0) {
				if (numb % 2 == 0) {
					System.out.println("Number is positive even: "+obj);
				}
				else {
					System.out.println("Number is positive odd: "+obj);
				}
			}
			else {
				System.out.println("Number is Negative: "+obj);
			}
		}
	}
}
