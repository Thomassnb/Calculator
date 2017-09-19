/*
 * Variable Name	DataType	Variable Description
 * User Name		String		The users name
 * firstNumber		Int			First number user wants to calculate
 * secondNumber		Int			Second number user wants to calculate
 * total			Int			Final calculation*/

package barnwell.llcs;

import java.util.Scanner;

public class MainClass
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String userName;
		
		int userChoice;
		boolean isProgramRunning = false;
		
		
		
		System.out.println("Hello, whats your name?");
		
		userName = input.nextLine();
				
		System.out.println("Hello "+ userName + " What would you like to do (Enter the number by your choice");
		
		isProgramRunning = true;
		
		while(isProgramRunning == true) 
		{
			System.out.println("(1)Add (2)Subtract (3)Multiply (4)Divide (5)Quit");	
			
			userChoice = input.nextInt();
			
			if (userChoice == 5)
			{
				isProgramRunning = false;
			}
			else
			{
				calculate(userChoice);
			}
			
		}
		System.out.println("Goodbye");
	}
	
	public static void calculate(int userChoice)
	{
		int firstNumber;
		int secondNumber;
		int total = 0;
			
		System.out.println("Enter your first number");
		firstNumber = input.nextInt();
		System.out.println("Enter your first number");
		secondNumber = input.nextInt();
			
		switch (userChoice)
		{
			case 1:
				//Addition
				total = firstNumber + secondNumber;
				break;
			case 2:
				//Subtract
				total = firstNumber - secondNumber;
				break;
			case 3:
				//Multiply
				total = firstNumber * secondNumber;
				break;
			case 4:
				//Divide
				total = firstNumber / secondNumber;
				break;
			
			default:
				System.out.println("invalid selection");
				break;
				
			}
		System.out.println("Your total is: " + total);
	}
}

