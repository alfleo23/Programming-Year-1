package week11;               //Alfonso Leone
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		int num1= -20 ;
		int num2= -40;
		
		Scanner input = new Scanner(System.in);
		while (num1 == -20)
		  {
			System.out.println("Enter num1");
		    if ( input.hasNextInt() ) 
		    	num1 = input.nextInt();
		    else
		    	input.nextLine(); 
		}
		while (num2 == -40)
		{
			System.out.println("Enter num2");
		    if ( input.hasNextInt() ) 
		    	num2 = input.nextInt();
		    else
		    	input.nextLine(); 
		}
		
		input.close();	
		
		System.out.println("the sum of num1 and num2 is: "+ sum(num1,num2));
		System.out.println("the difference of num1 and num2 is: "+ subtraction(num1, num2));
		System.out.println("the product of num1 and num2 is: "+ multiplication(num1,num2));	
		System.out.println("num 1 raised to the power of num 2 is: "+ power(num1, num2));
	} //end of main

	
	
	static int sum (int x, int y)
	{		
		return x+y;
	}
	
	static int subtraction (int x, int y)
	{
		return x-y;
	}
	
	static int multiplication (int x, int y)
	{
		return x*y;
	}
	
	static int power (int x, int y)
	{
		int i;
		int xMult=x;
		
		if(y==0)
		{
			xMult=1;
			return xMult;
		}
		else
		{
			for(i=1;i<y;i++)
			{
				xMult= xMult*x;
			}
			return xMult;
		}
	}
	
}  //end of class

