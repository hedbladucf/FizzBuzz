import java.util.Scanner;
import java.util.StringTokenizer;


public class BuzzFizz {
	
	public static void main(String [] args)
	{
	
		Scanner key;
		String str;
		String[] tokenz;
		int a, b;
		System.out.println("Enter two integers seperated by a space: ");
		key = new Scanner(System.in);
		str = key.nextLine();
		tokenz = str.split(" ");
		a = Integer.parseInt(tokenz[0]);
		b = Integer.parseInt(tokenz[1]);
		
		for(int i = a; i <= b; i++)
		{
			if(a == 0 && b == 0)
			{
				System.exit(0);
			}
			String num = "";
			
			if(i % 3 == 0)
			{
				num += "Fizz";
			}
			if(i % 5 == 0)
			{
				num += "Buzz";
			}
			if(num.length() == 0)
			{
				num = Integer.toString(i);
			}
			
			System.out.println(num);
			
		}
		
		
	}

}
