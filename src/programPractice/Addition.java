package programPractice;

import java.util.Scanner;

public class Addition {
static int a,b;
	public static int sum() {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		int total = sum();
		System.out.println("Totls is "+ total);
		
	}

}
