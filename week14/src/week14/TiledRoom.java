package week14;

public class TiledRoom extends Room {

	int grouting = super.area;
	
	TiledRoom (int area, int time, float unitPrice)
	{
		super(area, time, unitPrice);
	}
	
	double calculateTiledRoomCost(Job anyJob, TiledRoom anyTiledRoom)
	{
		double tiledRoomCost = (super.calculateTimeCost(anyJob, anyTiledRoom)*1.5) + grouting;
		return tiledRoomCost;
	}
}
