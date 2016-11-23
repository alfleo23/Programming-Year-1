package week17;										// Alfonso Leone

import java.util.Scanner;
import java.util.ArrayList;

public class namesArray
{

	public static void main(String[] args)
	{
		int selection = 0;
		String enteredName;		
		ArrayList<String> Names = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		printMenu();
		
		while (selection != 3)
		{
			
			selection = in.nextInt();
			
			switch(selection)
			{
			case 1:
				System.out.print("Please enter a name: ");
				enteredName = in.next();
				Names.add(enteredName);
				break;
			case 2:
				System.out.print("Please enter a name to search for: ");
				enteredName = in.next();
				if(Names.indexOf(enteredName)!= -1)
				{			
					System.out.print("Name found at location " + Names.indexOf(enteredName));
					System.out.println(" ");
				}
				else
				{
					System.out.println("Sorry, name not found");
					System.out.println(" ");
				}
				break;
				default:
			}
			if (selection != 3)
			{
				System.out.println(" ");
				printMenu();
			}
			else
			{
				System.out.print("goodbye !");
			}
		}
		
		in.close();
		
	}  // end of main

	public static void printMenu()
	{
		System.out.println("Menu: ");
		System.out.println("1. Enter a name");
		System.out.println("2. Search for a name");
		System.out.println("3. Quit");
		System.out.print("Please enter a selection: ");
	}
	
}  // end of class
