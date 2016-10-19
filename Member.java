//Jeremy Turney
//023299492
//June 18, 2015
//CSC262
//Homework 3
//Classes and inheritance. Restaurant Membership Clubs

package HW3;

public abstract class Member // abstract class Member
{//start class Member
	
	private String memberID = ""; // private memberID variable
	private String lastName = ""; // private lastName variable
	private String firstName= ""; // private firstName variable
	private int currentTotalPoints = 0; // private currentTotalPoints variable
	private static int noOfPointsPerCert = 300; // private static noOfPointsPerCert variable equals 300
	
	public Member(String member, String last, String first, int current)//constructor
	{ // start constructor
		this.memberID = member; // memberID equals member
		this.lastName = last; // lastName equals last
		this.firstName = first; // firstName equals first
		this.currentTotalPoints = current; // currentTotalPoints equals current
	}// end constructor
	
	public void setMemberID( ) // setMemberID method
	{// start setMemberID
		this.memberID = memberID; // memberID equals memberID
	}// end setMemberID
	
	public String getMemberID() // getMemberID method
	{ // start getMemberID
		return memberID; // return memberID
	}// end getMemberID
	
	public void setLastName( String lastName ) // setLastName method
	{// start setLastName
		this.lastName = lastName; // lastName equals lastName
	}// end setLastName
	
	public String getLastName() // getLastName method
	{// start getLastName
		return lastName; // return lastName
	}// end getLastName
	
	public void setFirstName( String firstName ) // setFirstName method
	{// start setFirstName
		this.firstName = firstName; // firstName equals firstName
	}// end setFirstName
	
	public String getFirstName() // getFirstName method
	{// start getFirstName
		return firstName; // return firstName
	}// end getFirstName
	
	public void setCurrentTotalPoints(int currentTotalPoints) // setCurrentTotalPoints method
	{// start setCurrentTotalPoints
		this.currentTotalPoints = currentTotalPoints; // currentTotalPoints equals currentTotalPoints
	}// end setCurrentTotalPoints
	
	public int getCurrentTotalPoints() //getCurrentTotalPoints method
	{// start getCurrentTotalPoints
		return currentTotalPoints; // return currentTotalPoints
	}// end getCurrentTotalPoints

	public static void setNoOfPointsPerCert( int noOfPointsPerCert)// static void setNoOfPointsPerCert method
	{// start setNoOfPointsPerCert
		noOfPointsPerCert = noOfPointsPerCert; // sets noOfPointsPerCert equal to noOfPointsPerCert
	}// end setNoOfPointsPerCert
	
	public static int getNoOfPointsPerCert() // get noOfPointsPerCert method
	{// start getNoOfPointsPerCert method
		return noOfPointsPerCert; //returns noOfPointsPerCert
	}// end getNoOfPointsPerCert method
	
	public abstract int addPoints ( double purchaseValue ); // abstract method addPoints
	
	public int getAvailableCerts() //availableCerts method
	{ // start availableCerts
		int num = 0;// creates num variable
		
		num = getCurrentTotalPoints() / getNoOfPointsPerCert(); // gets number of certificates available
		
		if ( num > 0 ) // if num is greater than 0
		{// start if statement
			return num; // return num
		}// end if statement
		
		else
		{// start else statement
			return 0; // return 0
		}// end else statement
		
	}// end availableCerts
	
	public int redeemCertificates ( int noOfCertificatesRequested ) // method redeems certificates
	{// Start redeemCertificates method
		
			int pointsRemaining = 0; //creates a variable called pointsRemaining
					
			int certs = getAvailableCerts();
			
				if (noOfCertificatesRequested <= certs ) // if noOfCertificatesRequested is equal to or less than certificateAvailable
				{// start if statement 2
														
					pointsRemaining = getCurrentTotalPoints() - ( noOfCertificatesRequested * noOfPointsPerCert ); // calculates points remaining
					
					setCurrentTotalPoints(pointsRemaining); // sets new point total
					
					return noOfCertificatesRequested; // return noOfCertificatesRequested
					
					
				}// end if statement 2
				
				else if (noOfCertificatesRequested > certs)
				{// start else statement 1
					
					pointsRemaining = getCurrentTotalPoints() - ( getAvailableCerts() * noOfPointsPerCert ); // calculates remaining points available
					
					setCurrentTotalPoints(pointsRemaining); // sets new point total
										
					return certs; // return certificateAvailable
										
				}// end else statement 1
				
				else
				{
					return 0;
				}
				
	}// end redeemCertificates method
	

	
}//end class Member
