import java.util.Scanner;			// Alfonso Leone

public class daysOfMonth {

	public static void main(String[] args) {
		
		//int day= -99 ;
		int month= -99;
		int monthControl=-99;
		String monthName= "";
		
		Scanner input = new Scanner(System.in);
		while (month == -99)
		  {
			System.out.println("Enter a month [1..12]: ");
		    if ( input.hasNextInt())
		    {
		          monthControl = input.nextInt();
		          if (monthControl<=12 && monthControl>=1)
				    {
				    	month= monthControl;
				    }
		     }
		    if (month ==-99)
		    {
		    	input.nextLine();
		    }
		    		   
		  } //end of while loop
		
		
		switch (month)
		{
			case 1: monthName = "January";
			break;
			case 2: monthName = "February";
			break;
			case 3: monthName = "March";
			break;
			case 4: monthName = "April";
			break;
			case 5: monthName = "May";
			break;
			case 6: monthName = "June";
			break;
			case 7: monthName = "July";
			break;
			case 8: monthName = "August";
			break;
			case 9: monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
			break;
			default:
		}
		
		System.out.println("Enter a day [1..31]: ");

		int dayInput = input.nextInt();
		if (month==2)
		{
			if (dayInput <= 28 && dayInput >0)
			{
				//day = dayInput;
				System.out.println(dayInput + " is a valid day for " + monthName);
			}
			else
			{
				//day = dayInput;
				System.out.println(dayInput + " is NOT a valid day for " + monthName);
			}
		}
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			if (dayInput <= 31 && dayInput >0)
			{
				//day = dayInput;
				System.out.println(dayInput + " is a valid day for " + monthName);
			}
			else
			{
				//day = dayInput;
				System.out.println(dayInput + " is NOT a valid day for " + monthName);
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			if (dayInput <= 30 && dayInput >0)
			{
				//day = dayInput;
				System.out.println(dayInput + " is a valid day for " + monthName);
			}
			else
			{
				//day = dayInput;
				System.out.println(dayInput + " is NOT a valid day for " + monthName);
			}
		}
	
	
	input.close();

		
	} //end of main

}  // end of class
