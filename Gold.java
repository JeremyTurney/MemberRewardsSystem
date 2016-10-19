package HW3;

public class Gold extends Member
{// start class Gold

	public boolean annualPresentGiven = true; // creates variable boolean annualPresentGiven
	
	public Gold ( String member, String last, String first, int current, boolean annual )//constructor
	{// start of constructor
		super( member, last, first, current ); //implements super class
		annualPresentGiven = annual;// annualPresentGiven = annual
		
	}// end of constructor
	
	public void setAnnualPresentGiven(boolean annualPresentGiven) // set annual present given
	{//start setAnnualPresentGiven
		
		this.annualPresentGiven = annualPresentGiven; // annualPresentGiven is equal to annualPresentGiven
		
	}//end setAnnualPresentGiven
	
	public boolean getAnnualPresentGiven() // returns whether or not annualPresentGiven occurred
	{// start getAnnualPresentGiven
		
		return annualPresentGiven;
		
	}// end getAnnualPresentGiven()
	
	public int addPoints ( double purchaseValue ) //adds points 
	{// start of addPoints
		
     	double allPoints = 0; // creates variable allPoints
     	int total = 0; // creates variable total
		
     	allPoints = purchaseValue * 1.10 ; // allPoints is getting points for last purchase
     	total = (int) Math.ceil( allPoints ); // rounding up to nearest int value

     	total = total + getCurrentTotalPoints(); // gets total points total
    	 
     	setCurrentTotalPoints(total);// sets new points total
     	
     	return total; // returns total points

	}// end of addPoints
	
	
}// end class Gold
