package com.concepts.behavioralDesignPatterns.strategy;

	//The Strategy Design Pattern is a behavioral design pattern that enables selecting an algorithm at runtime. 
	//Instead of implementing multiple behaviors in one class, it allows you to define a family of algorithms, 
	//encapsulate each one in a separate class, and make them interchangeable.
	
	//### Key Components:
	//1. Strategy Interface: Defines a common interface for all algorithms.
	//2. Concrete Strategies: Implement the Strategy interface with different algorithms.
	//3. Context: Uses a reference to a Strategy object and delegates the algorithm execution to the selected strategy.
	
	//### Example: Sorting Algorithms
	
	// 1. Strategy Interface
	
	interface SortStrategy {
	    void sort(int[] array);
	}
	
	
	// 2. Concrete Strategies
	
	// Bubble Sort
	class BubbleSort implements SortStrategy {
	    public void sort(int[] array) {
	        // Implement Bubble Sort logic
	    }
	}
	
	// Quick Sort
	class QuickSort implements SortStrategy {
	    public void sort(int[] array) {
	        // Implement Quick Sort logic
	    }
	}
	
	// 3. Context Class
	
	class SortContext {
	    private SortStrategy strategy;
	
	    public void setStrategy(SortStrategy strategy) {
	        this.strategy = strategy;
	    }
	
	    public void sortArray(int[] array) {
	        strategy.sort(array);
	    }
	}

public class StrategyDesignPattern {

	// 4. Client Code

	public static void main(String[] args) {
	    SortContext context = new SortContext();

	    int[] array = {5, 2, 9, 1, 5, 6};

	    // Using Bubble Sort
	    context.setStrategy(new BubbleSort());
	    context.sortArray(array);

	    // Switching to Quick Sort
	    context.setStrategy(new QuickSort());
	    context.sortArray(array);
	}
}

//### Advantages:
//- Flexibility: Change the algorithm at runtime.
//- Decoupling: The context is independent of the concrete algorithm.
//- Easy to extend: Add new strategies without modifying existing code.

//### When to Use:
//- When you have multiple algorithms for the same task and want to switch between them dynamically.
//- To avoid using multiple conditional statements (like `if-else` or `switch`).
