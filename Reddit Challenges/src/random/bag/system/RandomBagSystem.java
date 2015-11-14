package random.bag.system;

/**
 * @author Michael Jaramillo
 * 
 * In a game of Tetris, the tetromino (Tetris pieces) are not chosen at random
 * but instead, all seven pieces are placed into a bag where they are randomly
 * removed from the bag until all pieces are removed from the bag. Once the bag
 * is empty, it is re-filled with the tetromino pieces and the process is repeated.
 * 
 * Link to Challenge:
 *    https://www.reddit.com/r/dailyprogrammer/comments/3ofsyb/20151012_challenge_236_easy_random_bag_system/
 */

import java.util.ArrayList;
import java.util.Random;

public class RandomBagSystem
{
	// the bag to store each individual tetris piece
	private ArrayList<String> tetrisBag;
	// the tetris pieces stored in one string
	private String tetrimos;
	// the output of 50 tetromino pieces
	private String output;
	// random number generator
	private Random rand;
	// the index used to get a tetromino piece from the ArrayList
	private int index;
	
	public RandomBagSystem()
	{
		tetrisBag = new ArrayList<String>();
		rand = new Random();
		
		tetrimos = "OISZLJT";
		output = "";
		index = 0;
	}
	
	// method used to create the tetromino pieces
	public void createPieces()
	{
		/*
		 *  for each loop, about 5 tetromino pieces are created so once this loop
		 *  runs 10 times, 50 tetromino pieces are created in total
		 */
		for(int i = 0; i < 10; i++)
		{
			// adds each individual piece to the bag (ArrayList)
			for(int j = 0; j < tetrimos.length(); j++)
				tetrisBag.add(tetrimos.substring(j, j+1));
			
			// while the bag is not empty, loop through
			while(!tetrisBag.isEmpty())
			{
				/*
				 * index is equal to a random number chosen between 0 and
				 * 1 - the size of the bag currently
				 */
				index = rand.nextInt(tetrisBag.size());
				// save the piece to the output
				output = output + tetrisBag.get(index);
				// remove the piece from the bag
				tetrisBag.remove(index);
			}
		}
		
		// print out the total output
		System.out.println(output);
	}
	
	// an extra function to empty the output
	public void resetOutput()
	{
		output = "";
	}
	
	public static void main(String[] args) {
		RandomBagSystem bag = new RandomBagSystem();
		
		bag.createPieces();
		bag.resetOutput();
		
		bag.createPieces();
		bag.resetOutput();
		
		bag.createPieces();
	}

}
