package programPractice;

import java.util.Scanner;

public class FloydsTriangle {
	
	public static void main(String[] args) {
		int i, j, num=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int RowNum = sc.nextInt();
		
		System.out.println("Floyd's Triangle is:");
		System.out.println("****************************");
		for (i=1; i<=RowNum; i++) {
			for(j=1; j<=i; j++) {
				
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
		
		
	}

}
