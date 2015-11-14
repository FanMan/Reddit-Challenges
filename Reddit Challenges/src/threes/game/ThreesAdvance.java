package threes.game;

/**
 * @author Michael Jaramillo
 * 
 * What is this game?
 * First, you enter a large number
 * Then, you must either add or subtract from that large number between
 * 	-2 to 2
 * That number is then divided by three
 * The game ends when you reach 1
 * And the sum of every number you added/subtracted must equal 0
 * 
 * Link to Challenge
 *    https://www.reddit.com/r/dailyprogrammer/comments/3rhzdj/20151104_challenge_239_intermediate_a_zerosum/
 * 
 * @param num: the current number that needs to be divided by 3
 * @param sum: all numbers added to num must add up to zero
 * @param response: get the response from the user
 */

import java.util.Scanner;

public class ThreesAdvance
{
	private int num;
	private int sum;
	private int response;
	private Scanner scan = new Scanner(System.in);
	
	public ThreesAdvance()
	{
		num = 0;
		sum = 0;
		response = 0;
	}
	
	public void setGameOptions()
	{
		System.out.println("Enter a starting number: ");
		num = scan.nextInt();
	}
	
	public void divideThree()
	{
		// set up the game
		setGameOptions();
		
		// will always stop when number reaches 1 or less than 1
		while(num > 1)
		{
			System.out.println("Enter either -2, -1, 1, or 2");
			response = scan.nextInt();
			
			switch(response)
			{
			case -2:
				num = (num - 2) / 3;
				sum = sum - 2;
				break;
			case -1:
				num = (num - 1) / 3;
				sum = sum - 1;
				break;
			case 0:
				num = num / 3;
				break;
			case 1:
				num = (num + 1) / 3;
				sum = sum + 1;
				break;
			case 2:
				num = (num + 2) / 3;
				sum = sum + 2;
				break;
				default:
					System.out.println("Invalid input, try again.");
			}
			
			System.out.println("\nCurrent Number: " + num + "\nYour Response: " + response + "\nCurrent Sum: " + sum + "\n");
		}
		
		if(sum == 0)
		{
			System.out.println("Sum equals 0! Solution found!");
		}
		else
		{
			System.out.println("Sum equals " + sum + ". Solution not found.");
		}
	}
	
	public static void main(String[] args) {
		ThreesAdvance g = new ThreesAdvance();
		g.divideThree();
	}

}
