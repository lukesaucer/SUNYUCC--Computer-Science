package stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack stack = new IntStack();
		Stack<String> newStack = new Stack<String>();
		LinkedStack<Double> linkedStack = new LinkedStack<Double>();
		
		linkedStack.push(5.5);
		linkedStack.push(10.10);
		linkedStack.push(15.5);
		
		stack.push(5);
		stack.push(10);
		stack.push(15);
		newStack.push("H");
		newStack.push("E");
		newStack.push("L");
		newStack.push("L");
		newStack.push("O");
		System.out.printf("Item %s%n", newStack.pop());
		System.out.printf("Item %s%n", newStack.pop());
		System.out.printf("Item %s%n", newStack.pop());
		System.out.printf("Item %s%n", newStack.pop());
		System.out.printf("Item %s%n", newStack.pop());
		int item = stack.pop();
		System.out.printf("Item %d%n", item);
		item = stack.pop();
		System.out.printf("Item %d%n", item);
		System.out.printf("Size %d%n", stack.size());
	}

}
