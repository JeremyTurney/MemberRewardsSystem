package HW3;

import java.util.Scanner;

public class JKLTest 
{// start JKLTest
	
	public static void main ( String args[] )
	{
		
		Scanner input = new Scanner ( System.in );//Allows you to take input from keyboard
		
		Basic b1 = new Basic ( "20013", "Jones", "David", 4000 ); // creates a new Basic member
		
		Silver s1 = new Silver ( "20023", "Shoemaker", "Lisa", 1000 ); // creates a new Silver member
		
		Gold g1 = new Gold ( "20033", "Miller", "James", 12890, false ); // creates new Gold member
		
		Gold g2 = new Gold ( "20043", "Keller", "Richard", 50, true ); // creates new Gold member
		
		Silver s2 = new Silver ("20053", "Brown", "Anna", 3729 ); // creates new Silver member
		
		Member memberArray[ ] = new Member [100]; // creates an array of new Member that has 100 slots
		
		memberArray [0] = b1; // memberArray slot 0 set to b1
		memberArray [1] = s1; // memberArray slot 1 set to s1
		memberArray [2] = g1; // memberArray slot 2 set to g1
		memberArray [3] = g2; // memberArray slot 3 set to g2
		memberArray [4] = s2; // memberArray slot 4 set to s2
		
		boolean enter = true;// variable enter set to true
		boolean number = false; // variable number set to false
		int location = 0; // variable location created
		
		
		while(enter == true)
		{// start main while loop
		
		System.out.println ("1.     Add points to a member's account ");// allows keyboard to add points
		
		System.out.println ("2.     Reedem dining certificates for a member "); // allows keyboard to redeem dining certificates
		
		System.out.println ("3.     Quit "); // gives keyboard opportunity to quit
		int answer = 0; // creates a variable called answer
		answer = input.nextInt(); // set answer equal to the input from keyboard
		
		if ( answer == 1)
		{// start if statement 
			
			System.out.println ( " Please enter member ID number: ");// outputs please enter member ID number:
			String ID = ""; // creates string variable ID
			ID = input.next();// ID equals keyboard input
						
			for( int i = 0; i <= 4; i++) // for loop to search for memberID number
			{ // start for loop 1
				
				if ( ID.equals( memberArray[i].getMemberID() ) )
				{// start if statement 2
					
					location = i;
					number = true;
					
				}// end if statement 2
				
			}// end for loop
			
				if ( number == true)
				{
					System.out.println ( "Member found: " + memberArray[location].getMemberID() + ", " + memberArray[location].getLastName() + ", " + memberArray[location].getFirstName() + ", " + memberArray[location].getClass().getSimpleName() + ", " + memberArray[location].getCurrentTotalPoints() ); // outputs member information
					
					System.out.println ( "Enter purchase Amount: "); // outputs Enter purchase amount:
					double purchase = 0; // creates variable purchase
					purchase = input.nextDouble(); // sets purchase equal to what the keyboard enters
										
					System.out.println ( "Total points: " + memberArray[location].addPoints(purchase) ); // outputs total points
						
						if ( memberArray[location] instanceof Gold ) // if member is part of member class gold
						{// start if statement 3
							boolean given = false; // given is set to false
							
							given = ((Gold) memberArray[location]).getAnnualPresentGiven();// given finds out if annual present was given already 
							
							if( given == true ) // if given equals true
							{// start if statement4
								
								System.out.println ( "Annual present already received ");// outputs Annual present already received
								
							}// end if statement4
							
							else
							{// start else statement
								
								System.out.println("Annual present not yet received "); //outputs Annual present not yet received
							
							}// end else statement
							
						}// end if statement 3
							
				}// end if statement 1
				
				else 
				{// start else statement
					
					System.out.println("User not found ");
					
				}// end else statement
			
		}// end if statement 

		if ( answer == 2 ) // while answer equals 2
		{// start if statement 

			System.out.println ( " Please enter member ID number: ");// outputs please enter member ID number:
			String ID = ""; // creates string variable ID
			ID = input.next();// ID equals keyboard input
						
			for( int i = 0; i <= 4; i++) // for loop to search for memberID number
			{ // start for loop 1
				
				if ( ID.equals( memberArray[i].getMemberID() ) )
				{// start if statement 1
					
					location = i; // location is equal to i
					number = true; // number is set to true
					
				}// end if statement 1
				
			}// end for loop
			
			if ( number == true) // if number = true
			{// start if statement 2
		
				System.out.println ( "Member found: " + memberArray[location].getMemberID() + ", " + memberArray[location].getLastName() + ", " + memberArray[location].getFirstName() + ", " + memberArray[location].getClass().getSimpleName() + ", " + memberArray[location].getCurrentTotalPoints() + ", "+ memberArray[location].getAvailableCerts() ); // outputs member information
			
				System.out.println( "How many certicates would you like to redeem? " ); // asks keyboard how many certificates they'd like to redeem
				int deem = 0; // creates variable deem
				deem = input.nextInt();// sets deem equal to keyboard input
				
				if ( deem > 0) // if certificates requested is greater than 0
				{ // start if statement 3
					
					if (memberArray[location].getCurrentTotalPoints() >= 300)// if certificates requested can be completed
					{// start if statement 4
						
						System.out.println ( "no. of certificates awarded: " + memberArray[location].redeemCertificates(deem) ); //outputs number of certificates redeemed
						
						System.out.println ( "Available points remaining: " + memberArray[location].getCurrentTotalPoints() ); // outputs remaining points available
						
					}// end if statement 4
					
					else
					{// start else statement
						
						System.out.println( "Please try again later with more points " );// outputs Please try again with more points later
					
					}// end else statement
					
					if ( memberArray[location] instanceof Gold )// if member is member of gold class
					{// start if statement 5
						boolean given = false; // given is set to false
						
						given = ((Gold) memberArray[location]).getAnnualPresentGiven(); // given finds out if annual present was given already
						
						if( given == true ) // if given equals true
						{// start if statement4
							
							System.out.println ( "Annual present already received "); // outputs Annual present already received
							
						}// end if statement4
						
						else
						{
							System.out.println( "Annual present not yet received " ); // outputs Annual present not yet received
						}
						
					}// end if statement 5
					
				} // end if statement 3
				
				else
				{// start else statement
					
					System.out.println ( "Unable to grant request" );
					
				}// end else statement
				
			}// end if statement 2
			
			else 
			{
				System.out.println("User not found ");
				
			}
			
		}// end if statement
			
			if ( answer == 3 ) // if answer is equal to 3
			{// start if statement
				
				System.out.println( "Bye" );// outputs Bye
				
				enter = false; // enter equals false to exit while loop
				
			}// end if statement
			 
		System.out.println("");
		
		} // end main while loop
		
	}// end main method
	
}// end class JKLTest
