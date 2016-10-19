package HW3;

public class Silver extends Member
{// start Silver class

	public Silver(String member, String last, String first, int current) // constructor
	{// starts constructor
		
		super ( member, last, first, current ); //implements super class
		
	}// ends constructor
	
	public int addPoints ( double purchaseValue ) //adds points 
	{// start of addPoints
		
		double allPoints; // creates variable allPoints
     	int total; // creates variable total
		
     	allPoints = purchaseValue * 1.05 ; // allPoints is getting points for last purchase
     	total = (int) Math.ceil( allPoints ); // rounding up to nearest int value

     	total = total + getCurrentTotalPoints(); // gets total points total
     	 
     	setCurrentTotalPoints(total);// sets new points total
     	
		return total; // returns total points
     	
	}// end of addpoints
	
	
}// end Silver class
