/* Oscar Hedblad
 * COP3330, 0001
 * 
 * DESCRIPTION: The code takes two input values from user, separated by a space,
 * then prints out the values. However, the program will print FIZZ for every value 
 * divisible by 3, and BUZZ for every value divisible by 5.
 * And for values divisible for both 3 & 5 it prints FIZZBUZZ.  
 */


// Starting off by importing the necessary packages. 
// One for importing user input (scanner), and one for tokenizing the input.

import java.util.Scanner;
import java.util.StringTokenizer;

public class FizzBuzz {

	
	
	public static void main(String[] args)
	{
		// Tells the user to enter two integers, separated by spaces.
		System.out.println("Enter two integers separated by a space: ");
		// Creates an object "input" for the scanner input.
		Scanner input = new Scanner(System.in); 
		// Converts the input int to String.
		String str = input.nextLine();
		// Extracts the users choice of two integers as strings. 
		String[] tokenz = str.split(" ");
		
		
		// Converts (parses) the first and second string tokens into ints.
		int a = Integer.parseInt(tokenz[0]);
		int b = Integer.parseInt(tokenz[1]);
		
		
		// i starts at the first input value (a), and is always less than the second (b).
		for(int i=a; i<=b; i++)
		{
			
			// If a == 0 AND b == 0, then stop everything.
			if(a == 0 && b == 0){
				System.exit(0);
			}
			// Initialize a string with length zero.
			String num="";

			// If i mod (remainder) 3 is equal to zero, then ADDS FIZZ to String num.
			if(i%3==0)
			  num+="Fizz";
			// If i mod (remainder) 5 is equal to zero, then ADD BUZZ to String num.
			if(i%5==0)
			  num+="Buzz";
			/* If the numbers are neither divisible by 3 or 5, 
			the string num still has length zero and we need to print an integer.
			*/
			if(num.length()==0)
			  num=Integer.toString(i);
			
			// Prints out the value stored in num.
			System.out.println(num);
		}
	}
}