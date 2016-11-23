package week14;							// Alfonso Leone
import java.util.Scanner;


public class DecoratingMain {

	public static void main(String[] args) {
		
		float HRate;
		int mainArea;
		int mainTime;
		float mainUnitPrice;
		
		int tiledRoomArea;
		int tiledRoomTime;
		float tiledRoomUnitPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter Hourly Rate: ");
		HRate = input.nextFloat();
		
		Job myJob = new Job(HRate);
		
		System.out.print("Please enter room's Area: ");
		mainArea= input.nextInt();
		tiledRoomArea = mainArea;
		
		System.out.print("Please enter room's Unit Cost: ");
		mainUnitPrice= input.nextFloat();
		tiledRoomUnitPrice= mainUnitPrice;
		
		System.out.print("Please enter room's Decorating Time: ");
		mainTime= input.nextInt();
		tiledRoomTime= mainTime;
		input.close();
		
		Room MyRoom = new Room (mainArea, mainTime, mainUnitPrice);
		TiledRoom myTiledRoom = new TiledRoom (tiledRoomArea, tiledRoomTime, tiledRoomUnitPrice);
		
		//float totalCost = MyJob.calculateTimeCost(MyJob, MyRoom) + MyRoom.calculateMaterialCost(MyRoom);
		double totalTiledRoomCost = MyRoom.calculateMaterialCost(MyRoom) + myTiledRoom.calculateTiledRoomCost(myJob, myTiledRoom);
		
		//System.out.println("The job will cost " + totalCost);
		System.out.println("The job will cost " + totalTiledRoomCost);
		
	} //end of main

} //end of DecoratingMain class
