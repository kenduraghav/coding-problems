package coding.problem.examples.hashmap;

import java.util.HashMap;

public class InventoryChecker {

	public static void main(String[] args) {

		HashMap<String, Integer> inventory = new HashMap<>();
		inventory.put("Apples", 50);
		inventory.put("Bananas", 100);
		inventory.put("Oranges", 75);
		System.out.println(getTotalQuantity(inventory)); // It should print 225

		HashMap<String, Integer> anotherInventory = new HashMap<>();
		anotherInventory.put("Pizzas", 20);
		anotherInventory.put("Burgers", 30);
		anotherInventory.put("Tacos", 50);
		System.out.println(getTotalQuantity(anotherInventory)); // It should print 100

		HashMap<String, Integer> emptyInventory = new HashMap<>();
		System.out.println(getTotalQuantity(emptyInventory)); // It should print 0
	}

	public static int getTotalQuantity(HashMap<String, Integer> inventory) {
		// implement this

		//return inventory.values().stream().mapToInt(Integer::valueOf).sum();
		 return inventory.values().stream().reduce(0, Integer::sum); // efficient approach without converting integer to int value.
	}

}
