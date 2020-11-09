package PontoonTask;

import java.util.Scanner;

import java.util.Random;

public class Poonton 
{

	public static void main(String[] args) 
	
	{
	
	Scanner kboard = new Scanner(System.in);
		
	  int choice = 1;
	  int card1 =10;
	  int card2 =10;
	  int card3 =10;
	  int card4 =10;
	  int card5 =10;
	  int total =0;
		  
	  Random rand = new Random();
		
		
	  	card1 = rand.nextInt(card1) +1;
		
		
	  	Random rand1 = new Random();
			
			
		card2 = rand1.nextInt(card2) +1;
	  
			System.out.println("Your first card "+card1);
	
			System.out.println("Your second card "+card2);
	
	  
	 total=card1+card2;
	 
	 		System.out.println("This is the total of your cards: "+total);
	  	
	 	  
	 		System.out.println("Do you want another card Yes = 1 No = 2:");
	 		choice = kboard.nextInt();
	 
	 
	 if(choice==1)
	 { 
		 Random rand2 = new Random();
			
			
		  	card3 = rand2.nextInt(card3) +1;
		  	
		  	System.out.println("This is your new card: "+card3);
		  	
		  	total=card1+card2+card3;
		  	
		  	System.out.println("This is your new total:"+total);
		    	
		  	
	 }	
		  	
	 			  	
		System.out.println("Do you want another card Yes = 1 No = 2:");
	 	choice = kboard.nextInt(); 	
	 		
	if(choice==1) 
			{
	 			
	 	Random rand3 = new Random();
				
				
			 card4 = rand3.nextInt(card4) +1;
			  	
			 System.out.println("This is your new card: "+card4);
			  
			  total=card1+card2+card3+card4;
			  
			  System.out.println("This is your new total:"+total);
			  
			  
			 System.out.println("Do you want another card Yes = 1 No = 2:");
			 choice = kboard.nextInt();
	 		} 
		 
	
	if(choice==1) 
	{
			
	Random rand3 = new Random();
		
		
	 card5 = rand3.nextInt(card5) +1;
	  	
	 System.out.println("This is your new card: "+card5);
	  
	  total=card1+card2+card3+card4+card5;
	  
	  System.out.println("This is your new total:"+total);
	  
	  if(choice==1)
	  {
		  
		  				{
				 
			if(total>=19 && total <=21)
			{
			System.out.println("You have won congrats");
			}

			else if
			(total>1 && total <18)
			{
			System.out.println("You have lost");
			}
				 	 		 
			else 
			{
			System.out.println("You have drawn with the dealer");
			} 
		  
		  				}
	  }
	  
	}
	 
	if (choice==2) 
	 {
		 
		 if(total>=19 && total <=21)
			{
			System.out.println("You have won congrats");
			}

	else if
		(total>1 && total <18)
			{
			System.out.println("You have lost");
			}
		 	 		 
	else 
			{
			 System.out.println("You have drawn with the dealer");
			}
		 
	 }
	kboard.close();
	 }
		 
}	 
	 
	 
	 
	 
	 
	  

	  



	

