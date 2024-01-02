package threadsynchronizationexample;

import java.util.concurrent.*;

public class SharedArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArray sharedSimpleArray = new SimpleArray(6);
		
		ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
		ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(writer1);
		executorService.execute(writer2);
		
		executorService.shutdown();
		
		try {
			boolean tasksEnded =
				executorService.awaitTermination(1, TimeUnit.MINUTES);
			if (tasksEnded)
			{
			System.out.printf("%nContents of Array:%n");
			System.out.println(sharedSimpleArray);
			}
			else
				System.out.println("Timed out waiting for tasks");
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
