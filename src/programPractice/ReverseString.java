package programPractice;

//*******Without using string inbuilt functions

public class ReverseString {
	public static void main(String[] args) {
		String input = "Hello World";
		//char[] try1 = input.toCharArray();      //converting to char array
		for(int i= input.length()-1; i>=0; i--) {
			
		
		System.out.print(input.charAt(i));    // Use 'print' instead of 'println' to print in single line
	}
	}
}
