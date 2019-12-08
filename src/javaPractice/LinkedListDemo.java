package javaPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//declaration
		LinkedList<String> bikes = new LinkedList<String>();                       //Size of the ArrayList is 100
		//Adding items to list
		bikes.add("Yamaha FZ");
		bikes.add("RE");
		bikes.add("Pulsar");
		bikes.add("Activa");
		bikes.add("KTM");
		//Size of array
		int size=bikes.size();
		System.out.println("The size of bikes is "+size);
		//get items
		System.out.println("The first element is "+bikes.get(0));
		System.out.println("The second element is "+bikes.get(1));
		System.out.println("The last element is "+bikes.get(4));
		//Iteration
		for (int i=0;i<size;i++) {
			System.out.println("Item on index " +i+" is "+bikes.get(i));
		}
		//Next for loop example
		System.out.println("\nNext line Printing");
		for(String bike : bikes) {
			System.out.println("The item is "+bike);
		}
		//Removing
		bikes.remove(size-1);
		//Next for loop after removing example
				System.out.println("\nNext line Printing after removing");
				for(String bike : bikes) {
					System.out.println("The item is "+bike);
	
	}

}

}
