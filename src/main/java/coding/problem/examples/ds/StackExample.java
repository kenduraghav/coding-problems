package coding.problem.examples.ds;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

//		Stack<Integer> stack = new Stack<>();
//		
//		stack.push(10);
//		
//		stack.push(20);
//		stack.push(30);
//		
//		System.out.println(stack.toString());
//		
//		
//		System.out.println(stack.peek());

		IStack kitchenStack = new IStack(3); // A stack for holding dishes
		kitchenStack.push(1); // Plate 1 arrives
		kitchenStack.push(2); // Plate 2 arrives

		System.out.println(kitchenStack.peek()); // Check the top plate (should be 2)

		kitchenStack.pop(); // Process Plate 2
		kitchenStack.pop(); // Process Plate 1
		kitchenStack.pop(); // Try to process a non-existent plate

		KitchenStack ks = new KitchenStack(5);
		ks.addOrder(101); // Order #101 added
		ks.addOrder(102); // Order #102 added
		ks.addOrder(103); // Order #103 added
		ks.addOrder(104); // Order #104 added
		ks.addOrder(105); // Order #105 added
		System.out.println("Next order to prepare: " + ks.nextOrder()); // Should print order #105
	}

}

class IStack {
	private int top = -1;
	private int[] dishesStack;

	public IStack(int capacity) {
		dishesStack = new int[capacity];
	}

	public void push(int dish) {
		if (top < dishesStack.length - 1) {
			dishesStack[++top] = dish;
		} else {
			System.out.println("Kitchen shelf is full!");
		}
	}

	public int pop() {
		if (top > -1) {
			return dishesStack[top--];
		} else {
			System.out.println("No dishes to process!");
			return -1;
		}
	}

	public int peek() {
		if (top > -1) {
			return dishesStack[top];
		} else {
			System.out.println("Kitchen shelf is empty!");
			return -1;
		}
	}
}

class KitchenStack {
	private int capacity;
	private int[] kitchenOrders;
	private int topIndex = -1;

	public KitchenStack(int capacity) {
		this.capacity = capacity;
		this.kitchenOrders = new int[capacity];
	}

	void addOrder(int order) {
		if (topIndex < capacity - 1) {
			kitchenOrders[++topIndex] = order;
		} else {
			System.out.println("Kitchen is too busy, cannot take more orders!");
		}
	}

	int nextOrder() {
		if (topIndex > -1) {
			return kitchenOrders[topIndex--];
		} else {
			System.out.println("No orders to prepare!");
			return -1;
		}
	}
}

class Solution {

	public static void main(String[] args) {
		Stack<Integer> plates = new Stack<>();

		plates.push(1);
		plates.push(2);
		plates.push(3);

		System.out.println("Initial Stack :" + plates);
		plates.pop();
		System.out.println("Initial Stack :" + plates);
		plates.pop();
		System.out.println("Initial Stack :" + plates);
		plates.pop();
		System.out.println("After removal of plates: " + plates);
	}

}
