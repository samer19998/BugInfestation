package edu.handong.csee.java.Lab06;// this package name 
import java.util.Scanner;//import scanner to scan  keyboard input
public class Lab06 {
	

	
	
	
	

	/** 
	 * this is a class for measuring the time it will take to fill a house of a certain volume and a certain amount of roaches inside the house.
	 * this class also measures the amount of roaches that grow in the period by the growth rate.
	 */
	// create class lab06 as public

	


		final double GROWTH_RATE =0.95;
		final double ONE_BUG_VOLUME = 0.002;

		/**
		 * defining the growth rate of roaches.
		 * defining the volume of house.
		 * 
		 * @param args
		 */

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Lab06 roaches = new Lab06(); // constructor
			// object myCokroch call the value from Lab06
			roaches.compteNumOfBugKill();// constructor method

		}


		/**
		 * to constructs and initializes  Lab06 on compteNumOfBugkill
		 */
		public void compteNumOfBugKill() {


			Scanner keyboard = new Scanner(System.in);
			//	Scanner keyboard = new Scanner (System.in);


			System.out.println("Enter the total volumn of your house");// this prints out this line after compiling 
			System.out.print("in cubic feet : ");// print the the unit of measuring volume
			// method variable 
			double houseVolume = keyboard.nextDouble();//assign volume of house as double 


			System.out.println("Enter the estimate number of ");// print out the second line after compiling
			System.out.print("roaches in your house : ");//to fill how many roaches are in the house
			// method variable 
			double startPopulation = keyboard.nextDouble(); // scan keyboard from user input

			// method variable 
			double  population  = startPopulation;//the population is equal to the population of the initial one.

			// method variable 
			double totalBugvolume = population  * ONE_BUG_VOLUME;//calculating bug volume 
			// method variable as integer
			int countWeek = 0;



			// while loop statement
			while (totalBugvolume < houseVolume) {

				//local variable
				double newBugs = population * GROWTH_RATE; // value of startPopulation * GROWTH_RATE = newBugs
				//local variable
				double newBugVolumn = newBugs * ONE_BUG_VOLUME;
				population = population + newBugs;
				totalBugvolume = population  * ONE_BUG_VOLUME;
				countWeek = countWeek + 1;

			}	

			
			System.out.println("Staring with a roach population of  " + startPopulation );//that is the initial population of roaches that you can insert any number.

			
			System.out.println("and a house with a volumn of "+   houseVolume +" Cubic feet" );//that is the volume of house, you can insert any number.
			
			System.out.println("After " + countWeek +" Week" );//print out After ..(value).. Week

			
			System.out.println("the house will be filled with  " + population +" roaches");//print the house will be filled , value, roaches

			System.out.println("They will fill a volume of " + (int) totalBugvolume + " cubic feet" );// print out They will fill a volume of (value of totalBugvolumn ) cubic feet

			System.out.println("Better call Debugging Experts Inc.");//to print out the line mentioned



		}



	}