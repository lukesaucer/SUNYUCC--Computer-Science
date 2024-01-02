package concurrencyexample;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		// lines 17, 18 & 19 start concurrently
		executorService.execute(task1); // start 2nd thread
		executorService.execute(task2); // start 3rd thread
		executorService.execute(task3); // start 4th thread
	}

}
