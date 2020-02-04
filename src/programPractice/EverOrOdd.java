//Java Program to check Even or Odd number

package programPractice;

import java.util.Scanner;

public class EverOrOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The given number is even");
		}
		else
			System.out.println("The number is odd");
	}

}
