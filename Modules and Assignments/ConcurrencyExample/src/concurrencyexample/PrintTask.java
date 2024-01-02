package concurrencyexample;

import java.security.SecureRandom;

public class PrintTask implements Runnable {
	private static final SecureRandom generator = new SecureRandom();
	private final int sleepTime;
	private String taskName;
	
	public PrintTask(String taskName) {
		this.taskName = taskName;
		sleepTime = generator.nextInt(5000);
	}
	
	// This is the part of the class that actually runs concurrently
	// This is the thread
	public void run() {
		try {
		   System.out.printf("%s going to sleep for %d ms%n",
				taskName, sleepTime);
		   Thread.sleep(sleepTime);
		}
		catch (InterruptedException exception)
		{
			exception.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		System.out.printf("%s done sleeping%n", taskName);
	}

}
