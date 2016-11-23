package week14;

public class Room {

	int area;
	int time;
	float unitPrice;
	
Room (int roomArea, int roomTime, float roomUnitPrice)
{
	this.area= roomArea;
	this.time= roomTime;
	this.unitPrice= roomUnitPrice;
}
	
float calculateMaterialCost(Room anyRoom)
{
	float MaterialCost;
	MaterialCost= anyRoom.area * anyRoom.unitPrice;
	return MaterialCost;
}

float calculateTimeCost(Job anyJob, Room anyRoom)
{
	float timeCost;
	timeCost= anyJob.hourlyRate * anyRoom.time;
	return timeCost;
}
	
	
	
	
	
} //end of class Room
