package HW3;

public class Basic extends Member
{// start class Basic
		
	public Basic( String member, String last, String first, int current ) // constructor
    {//start constructor
		
		super( member, last, first, current );// implements super class constructor
		
	}// end constructor
	
	public int addPoints ( double purchaseValue ) //adds points
	{// start addPoints
		
		double allPoints; // creates variable allPoints
     	int total; // creates variable total
		
     	allPoints = purchaseValue; // allPoints is getting points for last purchase
     	total = (int) Math.ceil( allPoints ); // rounding up to nearest int value
     	
     	total = total + getCurrentTotalPoints(); // gets total points total
    	 
     	setCurrentTotalPoints(total);// sets new points total
     	
     	return total; // returns total points
		
	}// end addPoints
	
}// end class basic
