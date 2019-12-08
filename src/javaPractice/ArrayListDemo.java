package javaPractice;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//declaration
		ArrayList<String> bikes = new ArrayList<String>(100);                       //Size of the ArrayList is 100
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
	}

}
