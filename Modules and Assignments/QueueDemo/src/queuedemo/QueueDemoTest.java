package queuedemo;

/**
 * @author Lucas Saucer
 * @since 10/26/2021
 * @version 1.0
 * 
 * This program creates a queue and uses stack methods to pop and push methods into and off of
 * the queue.
 */

public class QueueDemoTest {

	public static <E> void main(String[] args) {
		
		QueueDemo<E> queueDemo = new QueueDemo<E>();  
		try {
			queueDemo.pop();
		} catch (StackEmptyException e) {
		
		}  
		
		try {
			queueDemo.push(23);
		} catch (StackFullException e1) {
				
		}
		
		try {
			queueDemo.push(2);
		} catch (StackFullException e1) {
			
		}
		
		try {
			queueDemo.push(73);
		} catch (StackFullException e1) {
				
		}
		
		try {
			queueDemo.push(21);
		} catch (StackFullException e1) {
			
		}
		
		try {
			queueDemo.pop();
		} catch (StackEmptyException e) {
			
		}  
		try {
			queueDemo.pop();
		} catch (StackEmptyException e) {
			
		}  
		try {
			queueDemo.pop();
		} catch (StackEmptyException e) {
			
		}  
		try {
			queueDemo.pop();
		} catch (StackEmptyException e) {
			
		}
	}

}
